package com.lab.bfs.wc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {

	private Queue<String> queue;
	private List<String> discovedWebList;

	public WebCrawler() {
		queue = new LinkedList<String>();
		discovedWebList = new ArrayList<String>();
	}

	public void discoveWeb(String root) {

		queue.add(root);

		String regexp = "http://(\\w+\\.)*(\\w+)";
		Pattern pattern = Pattern.compile(regexp);

		while (!queue.isEmpty()) {
			String w = queue.remove();
			// System.out.println("Web Found :" + w);

			String rawHTML = readURL(w);
			Matcher matcher = pattern.matcher(rawHTML);

			while (matcher.find()) {
				String url = matcher.group();
				if (!discovedWebList.contains(url)) {
					discovedWebList.add(url);
					System.out.println("Web Site Found :" + url);
					queue.add(url);
				}
			}

		}

	}

	private String readURL(String w) {

		String rawHtml = "";

		try {

			URL url = new URL(w);
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			String str = "";
			while ((str = in.readLine()) != null) {
				rawHtml += str;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return rawHtml;
	}

}

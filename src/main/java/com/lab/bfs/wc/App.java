package com.lab.bfs.wc;

public class App {
	public static void main(String[] args) {
		
		String root = "http://www.bbc.com/";
		WebCrawler crawler = new WebCrawler();
		crawler.discoveWeb(root);
	}
}

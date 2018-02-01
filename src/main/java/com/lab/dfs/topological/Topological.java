package com.lab.dfs.topological;

import java.util.List;
import java.util.Stack;

public class Topological {

	private Stack<Vertex> stack;

	public Topological() {
		stack = new Stack<Vertex>();

	}

	public void topological(List<Vertex> list) {

		for (Vertex v : list) {

			if (!v.isVisited()) {
				dfs(v);
			}
		}

	}

	private void dfs(Vertex root) {

		root.setVisited(true);

		for (Vertex v : root.getAdjList()) {

			if (!v.isVisited()) {
				v.setVisited(true);
				dfs(v);
			}
		}
		
		stack.push(root);

	}

	public Stack<Vertex> getStack() {
		return stack;
	}
}

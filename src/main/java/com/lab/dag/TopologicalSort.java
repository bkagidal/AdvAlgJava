package com.lab.dag;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class TopologicalSort {

	private Stack<Vertex> stack;

	public TopologicalSort() {
		stack = new Stack<Vertex>();
	}

	public void topologicalSort(List<Vertex> list) {
		for (Vertex v : list) {
			if (!v.isVisited()) {
				dfs(v);
			}
		}
	}

	private void dfs(Vertex v) {

		for (Edge e : v.getAdjList()) {
			if (!e.getTargetVertex().isVisited()) {
				e.getTargetVertex().setVisited(true);
				dfs(e.getTargetVertex());
			}
		}

		stack.push(v);
	}

	public Stack<Vertex> getTopologicalOrder() {

		Collections.reverse(stack);
		return stack;
	}
}

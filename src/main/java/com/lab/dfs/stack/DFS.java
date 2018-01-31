package com.lab.dfs.stack;

import java.util.List;
import java.util.Stack;

public class DFS {

	Stack<Vertex> stack;

	public DFS() {
		stack = new Stack<Vertex>();
	}

	public void dfs(List<Vertex> vertices) {

		for (Vertex v : vertices) {
			if (!v.isVisited()) {
				dfsTraversal(v);
			}
		}
	}

	private void dfsTraversal(Vertex root) {
		stack.push(root);
		root.setVisited(true);

		while (!stack.isEmpty()) {
			Vertex v = stack.pop();
			System.out.print(v + " ");

			for (Vertex ver : v.getNeighbors()) {

				if (!ver.isVisited()) {
					ver.setVisited(true);
					stack.add(ver);
				}
			}
		}
	}

}

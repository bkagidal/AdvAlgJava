package com.lab.bfs.vertex;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	private Queue<Vertex> queue;

	public BFS() {

		queue = new LinkedList<Vertex>();
	}

	public void bfs(Vertex root) {
		queue.add(root);
		root.setVisited(true);

		while (!queue.isEmpty()) {

			Vertex v = queue.remove();
			System.out.println(v);

			for (Vertex v1 : v.getAdjacentVertices()) {
				if (!v1.isVisited()) {
					v1.setVisited(true);
					queue.add(v1);
				}

			}

		}
	}
}

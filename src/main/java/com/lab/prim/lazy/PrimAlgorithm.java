package com.lab.prim.lazy;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PrimAlgorithm {

	private List<Vertex> unvisitedVertices;
	private PriorityQueue<Edge> queue;
	double fullCost;
	private List<Edge> spaningTree;

	public PrimAlgorithm(List<Vertex> unvisitedVertices) {
		this.unvisitedVertices = unvisitedVertices;
		queue = new PriorityQueue<Edge>();
		spaningTree = new ArrayList<Edge>();
	}

	public void primsAlgorithm(Vertex v) {

		unvisitedVertices.remove(v);

		while (!unvisitedVertices.isEmpty()) {

			for (Edge e : v.getAdjList()) {

				if (unvisitedVertices.contains(e.getTargetVeretx())) {
					queue.add(e);
				}
			}

			Edge minEdge = queue.remove();
			spaningTree.add(minEdge);
			fullCost += minEdge.getWeight();

			v = minEdge.getTargetVeretx();
			unvisitedVertices.remove(v);
		}
	}

	public void showMST() {
		System.out.println("Cost :" + fullCost);
		for (Edge e : spaningTree) {
			System.out.println(e.getStartVertex() + " " + e.getTargetVeretx());
		}
	}

}

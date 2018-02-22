package com.lab.prim.eagar;

import java.util.List;
import java.util.PriorityQueue;

public class PrimsEagarAlg {

	private List<Vertex> vertices;
	private PriorityQueue<Vertex> queue;

	public PrimsEagarAlg(Graph g) {
		this.vertices = g.getVertices();
		queue = new PriorityQueue<Vertex>();
	}

	public void spannigTree() {

		for (Vertex v : vertices) {
			if (!v.isVisited()) {
				greedyPrism(v);
			}
		}

	}

	private void greedyPrism(Vertex v) {
		v.setMinDistance(0);
		queue.add(v);
		while (!queue.isEmpty()) {
			Vertex v1 = queue.remove();
			scanVertex(v1);
		}
	}

	public void scanVertex(Vertex v) {
		v.setVisited(true);

		for (Edge e : v.getAdjList()) {

			Vertex targetVertex = e.getTargetVeretex();

			if(targetVertex.isVisited())
				continue;
			
			if (e.getWeight() < targetVertex.getMinDistance()) {
				targetVertex.setMinDistance(e.getWeight());
				targetVertex.setMinEdge(e);
			}

			if (queue.contains(targetVertex))
				queue.remove(targetVertex);

			queue.add(targetVertex);
		}
	}

	public void show() {
		for (Vertex v : vertices) {
			if (v.getMinEdge() != null) {
				Edge e = v.getMinEdge();
				System.out.println("Edge: " + e.getStartVertex() + "-" + e.getTargetVeretex());
			}
		}
	}
}

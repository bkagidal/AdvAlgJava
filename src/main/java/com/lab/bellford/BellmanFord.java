package com.lab.bellford;

import java.util.List;

public class BellmanFord {

	private List<Vertex> vertices;
	private List<Edge> edges;

	public BellmanFord(List<Vertex> vertices, List<Edge> edges) {
		this.vertices = vertices;
		this.edges = edges;

	}

	public void findPaths(Vertex source) {

		source.setDistance(0);

		for (int i = 0; i < vertices.size() - 1; i++) {

			for (Edge e : edges) {

				Vertex u = e.getStartVertex();
				Vertex v = e.getTargtVertex();
				
				if(u.getDistance() == Double.MAX_VALUE) continue;

				double newdistance = u.getDistance() + e.getWeight();

				if (newdistance < v.getDistance()) {
					v.setDistance(newdistance);
					v.setPredecessor(u);
				}
			}
		}

		for (Edge e : edges) {

			if (e.getStartVertex().getDistance() != Double.MAX_VALUE) {
				if (hasCycle(e)) {
					System.out.println("There has been a negative cycle detected...");
					return;
				}
			}

		}

	}

	private boolean hasCycle(Edge e) {
		return e.getStartVertex().getDistance() + e.getWeight() < e.getTargtVertex().getDistance();
	}

	public void shortestPathTo(Vertex targetVertex) {
		if (targetVertex.getDistance() == Double.MAX_VALUE) {
			System.out.println("No Path exists");
			return;
		}

		Vertex a = targetVertex;

		while (a != null) {
			System.out.print(a + " - ");
			a = a.getPredecessor();
		}
	}

}

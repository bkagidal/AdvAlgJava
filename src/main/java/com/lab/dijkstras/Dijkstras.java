package com.lab.dijkstras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstras {

	public void findPath(Vertex source) {

		source.setDistance(0);
		source.setPredecessor(null);

		PriorityQueue<Vertex> queue = new PriorityQueue<Vertex>();

		queue.add(source);

		while (!queue.isEmpty()) {

			Vertex actualVertex = queue.poll();

			for (Edge e : actualVertex.getAdjList()) {

				Vertex v = e.getTargetVertex();

				double newdistance = actualVertex.getDistance() + e.getWeight();

				if (newdistance < v.getDistance()) {

					queue.remove(v);
					v.setDistance(newdistance);
					v.setPredecessor(actualVertex);
					queue.add(v);
				}
			}
		}

	}

	public List<Vertex> shortestPath(Vertex targetVertex) {

		List<Vertex> path = new ArrayList<Vertex>();

		for (Vertex v = targetVertex; v != null; v = v.getPredecessor()) {
			path.add(v);
		}

		Collections.reverse(path);

		return path;

	}

}

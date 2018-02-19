package com.lab.kruskal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KruskalAlgorithm {

	public void spaningTree(List<Vertex> vertexList, List<Edge> edgeList) {

		DisjointSet disJointSet = new DisjointSet(vertexList);

		List<Edge> mst = new ArrayList<Edge>();
		
		Collections.sort(edgeList);

		for (Edge e : edgeList) {

			Vertex u = e.getStartVertex();
			Vertex v = e.getTargetVertex();

			if (disJointSet.find(u.getNode()) != disJointSet.find(v.getNode())) {
				mst.add(e);
				disJointSet.union(u.getNode(), v.getNode());
			}
		}

		for (Edge e : mst)
			System.out.print(e.getStartVertex() + "" + e.getTargetVertex() + "--");
	}

}

package com.lab.dag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class AcyclicShortestPath {

	public void shortestPaths(List<Vertex> vertices, Vertex sourceVertex, Vertex targetVertex) {

		sourceVertex.setMinDistance(0);

		TopologicalSort top = new TopologicalSort();
		top.topologicalSort(vertices);

		Stack<Vertex> stack = top.getTopologicalOrder();

		for (Vertex ver : stack) {
			//System.out.print(ver + " ");

			for (Edge e : ver.getAdjList()) {

				Vertex u = e.getStartVertex();
				Vertex v = e.getTargetVertex();

				double newdistance = u.getMinDistance() + e.getWeight();

				if (newdistance < v.getMinDistance()) {

					v.setMinDistance(newdistance);
					v.setPredecessor(ver);
				}
			}
		}

		//System.out.println("\n");
		if (targetVertex.getMinDistance() == Double.MAX_VALUE)
			System.out.println("There no Shortest Path..");
		else
			System.out.println("Target Vertex Shortest Path " + targetVertex.getMinDistance());
	}
	
	public void showShortestPath(Vertex targetVer){
		
		List<Vertex> list = new ArrayList<Vertex>();
		
		Vertex actualVer = targetVer;
		
		list.add(actualVer);
		
		while(actualVer.getPredecessor() != null){
			list.add(actualVer.getPredecessor());
			actualVer = actualVer.getPredecessor();
		}
		
		Collections.reverse(list);
		
		System.out.println(list);
	}

}

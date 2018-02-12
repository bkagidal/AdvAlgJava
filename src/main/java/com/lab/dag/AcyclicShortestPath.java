package com.lab.dag;

import java.util.List;
import java.util.Stack;

public class AcyclicShortestPath {
	
	public void shortestPaths(List<Vertex> vertices,Vertex sourceVertex,Vertex targetVertex){
		
		sourceVertex.setMinDistance(0);
		
		TopologicalSort top = new TopologicalSort();
		top.topologicalSort(vertices);
		
		Stack<Vertex> stack = top.getTopologicalOrder();
		
		for(Vertex v : stack){
			System.out.print( v+" ");
		}
	}

}

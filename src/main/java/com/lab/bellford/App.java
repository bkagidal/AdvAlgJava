package com.lab.bellford;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
		List<Vertex> vertexList = new ArrayList<Vertex>();
		
		vertexList.add(new Vertex("A"));
		vertexList.add(new Vertex("B"));
		vertexList.add(new Vertex("C"));
		
		List<Edge> edgeList = new ArrayList<Edge>();
		
		edgeList.add(new Edge(vertexList.get(0),vertexList.get(1),1));
		edgeList.add(new Edge(vertexList.get(1),vertexList.get(2),-1));
		edgeList.add(new Edge(vertexList.get(2),vertexList.get(2),-11));
		
		BellmanFord bellmannFordAlgorithm = new BellmanFord(vertexList,edgeList);
		bellmannFordAlgorithm.findPaths(vertexList.get(0));
		//bellmannFordAlgorithm.shortestPathTo(vertexList.get(2));
		
		
	}

}

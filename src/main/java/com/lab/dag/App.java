package com.lab.dag;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {

		Vertex vertex0 = new Vertex("A");
		Vertex vertex1 = new Vertex("B");
		Vertex vertex2 = new Vertex("C");

		List<Vertex> vertexList = new ArrayList<Vertex>();

		vertexList.add(vertex0);
		vertexList.add(vertex1);
		vertexList.add(vertex2);
		
		vertex0.addNeighbour(new Edge(1, vertex0, vertex1));
		vertex0.addNeighbour(new Edge(10, vertex0, vertex2));

		vertex1.addNeighbour(new Edge(1, vertex1, vertex2));


		AcyclicShortestPath acyclicShortestPath = new AcyclicShortestPath();
		acyclicShortestPath.shortestPaths(vertexList, vertex0, vertex2);
		acyclicShortestPath.showShortestPath(vertex2);
	}
}

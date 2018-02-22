package com.lab.prim.eagar;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex>{

	private String name;
	private List<Edge> adjList;
	private boolean visited;
	private Edge minEdge;
	private double minDistance = Double.POSITIVE_INFINITY;

	public Vertex(String name) {
		this.name = name;
		adjList = new ArrayList<Edge>();
	}

	public void addNeighbour(Edge e) {
		adjList.add(e);
	}

	@Override
	public String toString() {

		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Edge> getAdjList() {
		return adjList;
	}

	public void setAdjList(List<Edge> adjList) {
		this.adjList = adjList;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public Edge getMinEdge() {
		return minEdge;
	}

	public void setMinEdge(Edge minEdge) {
		this.minEdge = minEdge;
	}

	public double getMinDistance() {
		return minDistance;
	}

	public void setMinDistance(double minDistance) {
		this.minDistance = minDistance;
	}

	public int compareTo(Vertex o) {
		return Double.compare(this.minDistance, o.getMinDistance());
	}

}

package com.lab.dag;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	private List<Edge> adjList;
	private boolean visited;
	private Vertex predecessor;
	private double minDistance = Double.MAX_VALUE;

	public double getMinDistance() {
		return minDistance;
	}

	public void setMinDistance(double minDistance) {
		this.minDistance = minDistance;
	}

	public Vertex(String name) {
		this.name = name;
		adjList = new ArrayList<Edge>();
	}

	@Override
	public String toString() {
		return name + " ";
	}

	public void addNeighbour(Edge e) {
		adjList.add(e);
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

	public Vertex getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}

}

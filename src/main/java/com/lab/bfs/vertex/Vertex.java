package com.lab.bfs.vertex;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String v;
	private boolean visited;
	private List<Vertex> adjacentVertices;

	public Vertex(String v) {
		this.v = v;
		adjacentVertices = new ArrayList<Vertex>();
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getAdjacentVertices() {
		return adjacentVertices;
	}

	public void addVerAdjList(Vertex v) {
		adjacentVertices.add(v);
	}

	@Override
	public String toString() {
		return "" + v;
	}

}

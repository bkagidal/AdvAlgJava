package com.lab.dfs.stack;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	private boolean visited;
	private List<Vertex> neighbors;

	public Vertex(String name) {
		this.name = name;
		neighbors = new ArrayList<Vertex>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getNeighbors() {
		return neighbors;
	}

	public void setNeighbors(List<Vertex> neighbors) {
		this.neighbors = neighbors;
	}

	public void addNeighbor(Vertex v) {
		neighbors.add(v);
	}

	@Override
	public String toString() {
		return this.name;
	}
}

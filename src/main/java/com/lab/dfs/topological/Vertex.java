package com.lab.dfs.topological;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	private boolean visited;
	private List<Vertex> adjList;

	public Vertex(String name) {
		this.name = name;
		adjList = new ArrayList<Vertex>();
	}

	public void addNeibour(Vertex v) {
		this.adjList.add(v);
	}

	@Override
	public String toString() {
		return this.name;
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

	public List<Vertex> getAdjList() {
		return adjList;
	}

	public void setAdjList(List<Vertex> adjList) {
		this.adjList = adjList;
	}

}

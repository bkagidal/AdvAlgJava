package com.lab.dfs.cycle;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	private boolean visited;
	private boolean beingVisited;
	private List<Vertex> adjList;

	public Vertex(String name) {
		this.name = name;
		this.adjList = new ArrayList<Vertex>();
	}

	public void addNeighbour(Vertex v) {
		this.adjList.add(v);
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

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public boolean isBeingVisited() {
		return beingVisited;
	}

	public void setBeingVisited(boolean beingVisited) {
		this.beingVisited = beingVisited;
	}

	public List<Vertex> getAdjList() {
		return adjList;
	}

	public void setAdjList(List<Vertex> adjList) {
		this.adjList = adjList;
	}

}

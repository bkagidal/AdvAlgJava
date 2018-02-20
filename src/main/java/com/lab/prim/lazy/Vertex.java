package com.lab.prim.lazy;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	private List<Edge> adjList;

	public Vertex(String name) {
		this.name = name;
		adjList = new ArrayList<Edge>();
	}

	public void addEdge(Edge e){
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

}

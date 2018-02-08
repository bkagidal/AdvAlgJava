package com.lab.bellford;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name;
	private List<Edge> adjList;
	private Vertex predecessor;
	private double distance = Double.MAX_VALUE;
	
	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public Vertex(String name){
		this.name = name;
		adjList = new ArrayList<Edge>();
	}
	
	public void addNeighbour(Edge e){
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

	public Vertex getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}
}

package com.lab.dijkstras;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {

	private String name;
	private List<Edge> adjList;
	private double distance = Double.MAX_VALUE;
	private Vertex predecessor;

	public Vertex getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}

	public Vertex(String name) {
		this.name = name;
		this.adjList = new ArrayList<Edge>();
	}

	public void addneibhour(Edge e) {
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

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int compareTo(Vertex otherVertex) {
		return Double.compare(this.distance, otherVertex.distance);
	}

}

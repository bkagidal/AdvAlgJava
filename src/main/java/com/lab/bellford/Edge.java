package com.lab.bellford;

public class Edge {

	private double weight;
	private Vertex startVertex;
	private Vertex targtVertex;
	
	public Edge(Vertex startVertex, Vertex targtVertex,double weight) {
		this.weight = weight;
		this.startVertex = startVertex;
		this.targtVertex = targtVertex;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Vertex getStartVertex() {
		return startVertex;
	}

	public void setStartVertex(Vertex startVertex) {
		this.startVertex = startVertex;
	}

	public Vertex getTargtVertex() {
		return targtVertex;
	}

	public void setTargtVertex(Vertex targtVertex) {
		this.targtVertex = targtVertex;
	}
	
	
	
}

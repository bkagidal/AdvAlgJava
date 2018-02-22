package com.lab.prim.eagar;

public class Edge {

	private Vertex startVertex;
	private Vertex targetVeretex;
	private double weight;

	public Edge(Vertex startVertex, Vertex targetVeretex, double weight) {
		this.startVertex = startVertex;
		this.targetVeretex = targetVeretex;
		this.weight = weight;
	}

	public Vertex getStartVertex() {
		return startVertex;
	}

	public void setStartVertex(Vertex startVertex) {
		this.startVertex = startVertex;
	}

	public Vertex getTargetVeretex() {
		return targetVeretex;
	}

	public void setTargetVeretex(Vertex targetVeretex) {
		this.targetVeretex = targetVeretex;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	
}

package com.lab.prim.lazy;

public class Edge implements Comparable<Edge>{

	private Vertex startVertex;
	private Vertex targetVeretx;
	private double weight;

	public Edge(Vertex startVertex, Vertex targetVeretx, double weight) {
		this.startVertex = startVertex;
		this.targetVeretx = targetVeretx;
		this.weight = weight;
	}

	public Vertex getStartVertex() {
		return startVertex;
	}

	public void setStartVertex(Vertex startVertex) {
		this.startVertex = startVertex;
	}

	public Vertex getTargetVeretx() {
		return targetVeretx;
	}

	public void setTargetVeretx(Vertex targetVeretx) {
		this.targetVeretx = targetVeretx;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int compareTo(Edge otherEdge) {
		return Double.compare(this.weight, otherEdge.getWeight());
	}

}

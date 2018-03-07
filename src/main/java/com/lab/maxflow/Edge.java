package com.lab.maxflow;

public class Edge {

	private Vertex fromVertex;
	private Vertex targetVertex;
	private final double capacity;
	private double flow;

	public Edge(Vertex fromVertex, Vertex targetVertex, double capacity) {
		this.fromVertex = fromVertex;
		this.targetVertex = targetVertex;
		this.capacity = capacity;
		this.flow = 0.0;
	}

	public Edge(Edge e) {
		this.fromVertex = e.getFromVertex();
		this.targetVertex = e.getTargetVertex();
		this.capacity = e.getCapacity();
		this.flow = e.getFlow();

	}

	public Vertex getFromVertex() {
		return fromVertex;
	}

	public void setFromVertex(Vertex fromVertex) {
		this.fromVertex = fromVertex;
	}

	public Vertex getTargetVertex() {
		return targetVertex;
	}

	public void setTargetVertex(Vertex targetVertex) {
		this.targetVertex = targetVertex;
	}

	public double getCapacity() {
		return capacity;
	}

	public double getFlow() {
		return flow;
	}

	public void setFlow(double flow) {
		this.flow = flow;
	}

	public Vertex getOther(Vertex vertex) {

		if (vertex == fromVertex)
			return targetVertex;
		else
			return fromVertex;

	}

	public double getResidualCapacity(Vertex vertex) {

		if (vertex == fromVertex)
			return flow;
		else
			return (capacity - flow);

	}

	public void addResidualFlowTo(Vertex vertex, double deltaFlow) {
		if (vertex == fromVertex) {
			flow = flow - deltaFlow;
		} else {
			flow = flow + deltaFlow;
		}

	}

	@Override
	public String toString() {
		return fromVertex + "-" + targetVertex + " " + flow + "/" + capacity;
	}

}

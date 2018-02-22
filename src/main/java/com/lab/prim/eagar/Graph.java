package com.lab.prim.eagar;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	private List<Vertex> vertices;
	private List<Edge> edjes;

	public Graph() {
		this.vertices = new ArrayList<Vertex>();
		this.edjes = new ArrayList<Edge>();
	}

	public void addVertex(Vertex v) {
		vertices.add(v);
	}

	public void addEdge(Edge e) {

		Vertex u = e.getStartVertex();
		Vertex v = e.getTargetVeretex();

		this.vertices.get(vertices.indexOf(e.getStartVertex())).addNeighbour(new Edge(u, v, e.getWeight()));
		this.vertices.get(vertices.indexOf(e.getTargetVeretex())).addNeighbour(new Edge(v, u, e.getWeight()));
	}

	public List<Vertex> getVertices() {
		return vertices;
	}

	public void setVertices(List<Vertex> vertices) {
		this.vertices = vertices;
	}

	public List<Edge> getEdjes() {
		return edjes;
	}

	public void setEdjes(List<Edge> edjes) {
		this.edjes = edjes;
	}

}

package com.lab.dijkstras;

public class App {

	public static void main(String[] args) {

		Vertex v0 = new Vertex("A");
		Vertex v1 = new Vertex("B");
		Vertex v2 = new Vertex("C");

		Edge e0 = new Edge(1, v0, v1);
		Edge e1 = new Edge(1, v1, v2);
		Edge e2 = new Edge(3, v0, v2);

		v0.addneibhour(e0);
		v1.addneibhour(e1);
		v0.addneibhour(e2);

		Dijkstras sp = new Dijkstras();

		sp.findPath(v0);
		System.out.println(sp.shortestPath(v2));

	}

}

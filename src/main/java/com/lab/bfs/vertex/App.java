package com.lab.bfs.vertex;

public class App {

	public static void main(String[] args) {
		
		Vertex v1 = new Vertex("1");
		Vertex v2 = new Vertex("2");
		Vertex v3 = new Vertex("3");
		Vertex v4 = new Vertex("4");
		Vertex v5 = new Vertex("5");
		
		
		v1.addVerAdjList(v2);
		v1.addVerAdjList(v4);
		v4.addVerAdjList(v5);
		v2.addVerAdjList(v3);
		//v5.addVerAdjList(v2);
		BFS search = new BFS();
		search.bfs(v1);
	}
}

package com.lab.dfs.cycle;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		Vertex v1 = new Vertex("1");
		Vertex v2 = new Vertex("2");
		Vertex v3 = new Vertex("3");
		Vertex v4 = new Vertex("4");
		Vertex v5 = new Vertex("5");
		Vertex v6 = new Vertex("6");
		
		v1.addNeighbour(v2);
		v2.addNeighbour(v3);
		v3.addNeighbour(v1);
		v4.addNeighbour(v1);
		v5.addNeighbour(v6);
		v6.addNeighbour(v4);
		
		List<Vertex> list = new ArrayList<Vertex>();
		
		list.add(v1);
		list.add(v2);
		list.add(v3);
		list.add(v4);
		list.add(v5);
		list.add(v6);
		
		CycleDetection cycle = new CycleDetection();
		
		cycle.dfs(list);
		
		
		
	}
}

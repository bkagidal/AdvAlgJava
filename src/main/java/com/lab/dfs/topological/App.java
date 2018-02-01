package com.lab.dfs.topological;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class App {
	
	public static void main(String[] args) {
	
		Topological topo = new Topological();
		
		Vertex v0= new Vertex("0");
		Vertex v1= new Vertex("1");
		Vertex v2= new Vertex("2");
		Vertex v3= new Vertex("3");
		Vertex v4= new Vertex("4");
		Vertex v5= new Vertex("5");
		
		
		v2.addNeibour(v3);
		
		v3.addNeibour(v1);
		
		v4.addNeibour(v0);
		v4.addNeibour(v1);
		
		v5.addNeibour(v0);
		v5.addNeibour(v2);
		
		List<Vertex> list = new ArrayList<Vertex>();
		
		list.add(v1);
		list.add(v2);
		list.add(v3);
		list.add(v4);
		list.add(v5);
		
		topo.topological(list);
		
		Stack<Vertex> stack = topo.getStack();
		
		
		while(!stack.isEmpty())
			System.out.println(stack.pop());
	}
	
	

}

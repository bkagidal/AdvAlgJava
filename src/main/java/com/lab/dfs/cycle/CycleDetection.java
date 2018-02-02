package com.lab.dfs.cycle;

import java.util.List;

public class CycleDetection {

	public void dfs(List<Vertex> list) {

		for (Vertex v : list) {
			if (!v.isVisited())
				dfs(v);
		}
	}

	private void dfs(Vertex v) {

		v.setBeingVisited(true);
		//System.out.println("DFS On Vertex :"+v);
		
		for (Vertex child : v.getAdjList()) {
			
			//System.out.println("Visting neighbours of vertex :"+v);
			if (child.isBeingVisited()) {
				System.out.println("Graph has Cycle");
				return;
			}

			if (!child.isVisited()) {
				//System.out.println("Vissiting vertex "+v+" recursivily...");
				child.setVisited(true);
				dfs(child);
			}
			
			
		}
		
		//System.out.println("Set vertex "+v+" setBeingVisited(false) and visited(true)");
		v.setBeingVisited(false);
		v.setVisited(true);

		
	}

}

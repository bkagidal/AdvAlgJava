package com.lab.logestpath;

import java.util.List;

public class BellmanFord {

	private List<Vertex> vertexList;
	private List<Edge> edgeList;

	public BellmanFord(List<Vertex> verList, List<Edge> edgeList) {
		this.vertexList = verList;
		this.edgeList = edgeList;
	}

	public void bellmanford(Vertex sourceVertex, Vertex targetVertex) {

		sourceVertex.setMinDistance(0);

		for (int i = 0; i < vertexList.size() - 1; i++) {

			for (Edge e : edgeList) {

				if (e.getStartVertex().getMinDistance() == Integer.MAX_VALUE)
					continue;

				int newdistance = e.getStartVertex().getMinDistance() + e.getWeight();

				if (newdistance < e.getTargetVertex().getMinDistance()) {
					e.getTargetVertex().setMinDistance(newdistance);
					e.getTargetVertex().setPredecessor(e.getStartVertex());
				}
			}

		}

		for (Edge e : edgeList) {

			if (e.getStartVertex().getMinDistance() != Integer.MAX_VALUE) {

				if (hasCycle(e)) {
					System.out.println("There is Cycle exists");
					return;
				}
			}
		}
		
		if(targetVertex.getMinDistance() != Integer.MAX_VALUE){
			System.out.println("There is shortest path from source to target");
			
			Vertex actualVertex = targetVertex;
			
			while(actualVertex != null){
				System.out.print(actualVertex+" ");
				actualVertex = actualVertex.getPredecessor();
			}
		}else{
			System.out.println("There is no path from source to target");
		}
		
	}

	private boolean hasCycle(Edge e) {
		return e.getStartVertex().getMinDistance() + e.getWeight() < e.getTargetVertex().getMinDistance();
	}

}

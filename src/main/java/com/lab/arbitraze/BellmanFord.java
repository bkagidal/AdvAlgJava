package com.lab.arbitraze;

import java.util.ArrayList;
import java.util.List;

public class BellmanFord {

	private List<Vertex> vertexList;
	private List<Edge> edgeList;
	private List<Vertex> cycleList;

	public BellmanFord(List<Vertex> verlist, List<Edge> edgList) {
		this.vertexList = verlist;
		this.edgeList = edgList;
		this.cycleList = new ArrayList<Vertex>();
	}

	public void findArbitraze(Vertex source) {

		source.setMinDistance(0);

		for (int i = 0; i < vertexList.size() - 1; i++) {

			for (Edge e : edgeList) {

				if (e.getStartVertex().getMinDistance() == Double.MAX_VALUE)
					continue;

				double newDistance = e.getStartVertex().getMinDistance() + e.getWeight();

				if (newDistance < e.getTargetVertex().getMinDistance()) {

					e.getTargetVertex().setMinDistance(newDistance);
					e.getTargetVertex().setPredecessor(e.getStartVertex());
				}
			}
		}

		for (Edge edge : edgeList) {

			if (edge.getStartVertex().getMinDistance() != Double.MAX_VALUE) {

				if (hasCyle(edge)) {

					Vertex v = edge.getStartVertex();
				
					while (!v.equals(edge.getTargetVertex())) {
						this.cycleList.add(v);
						v = v.getPredecessor();
					}
					
					this.cycleList.add(edge.getTargetVertex());
					
					return;
				}
			}
		}

	}

	private boolean hasCyle(Edge edge) {
		return edge.getStartVertex().getMinDistance() + edge.getWeight() < edge.getTargetVertex().getMinDistance();
	}
	
	public void printCycle(){
		
		if(cycleList != null){
			
			for(Vertex v : cycleList){
				System.out.print(v+" ");
			}
		}else{
			System.out.println("No Arbitrage Situation !!!!");
		}
	}

}

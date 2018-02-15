package com.lab.arbitraze;

import java.util.ArrayList;
import java.util.List;

public class BellmanFord {
	
	private List<Vertex> vertexList;
	private List<Edge> edgeList;
	private List<Vertex> cycleList;
	
	public BellmanFord(List<Vertex> verlist,List<Edge> edgList) {
		this.vertexList = verlist;
		this.edgeList = edgList;
		this.cycleList = new ArrayList<Vertex>();
	}

	
}

package comlab.kosaraju;

import java.util.List;

public class Graph {
	
	private List<Vertex> vertexList;
	private List<Edge> edgeList;
	
	public Graph() {
	}

	public Graph(List<Vertex> vertexList,List<Edge> edgeList) {
		this.vertexList = vertexList;
		this.edgeList = edgeList;
	}

	public List<Vertex> getVertexList() {
		return vertexList;
	}

	public void setVertexList(List<Vertex> vertexList) {
		this.vertexList = vertexList;
	}

	public List<Edge> getEdgeList() {
		return edgeList;
	}

	public void setEdgeList(List<Edge> edgeList) {
		this.edgeList = edgeList;
	}
	
	public Graph getTransposeGraph(){
		
		Graph transGraph = new Graph();
		List<Vertex> transVerList = this.vertexList;
		
		for(Edge e: this.edgeList){
			
			transVerList.get(transVerList.indexOf(e.getTargetVertex())).addNeighbour(e.getStartVertex());
		}
		
		transGraph.setVertexList(transVerList);
		
		return transGraph;
	}


}

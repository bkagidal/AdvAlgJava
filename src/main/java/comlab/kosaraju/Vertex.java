package comlab.kosaraju;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private int id;
	private String name;
	private List<Vertex> adjacencies;
	private int component;
	private boolean visited;

	public Vertex(int id, String name) {
		this.id = id;
		this.name = name;
		adjacencies = new ArrayList<Vertex>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Vertex> getAdjacencies() {
		return adjacencies;
	}

	public void setAdjacencies(List<Vertex> adjacencies) {
		this.adjacencies = adjacencies;
	}

	public int getComponent() {
		return component;
	}

	public void setComponent(int component) {
		this.component = component;
	}
	
	public void addNeighbour(Vertex vertex){
		this.adjacencies.add(vertex);
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	@Override
	public String toString() {
		return name;
	}
}

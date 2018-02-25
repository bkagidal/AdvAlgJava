package comlab.kosaraju;

import java.util.Stack;

public class DepthFirstOrder {

	private Stack<Vertex> stack;

	public DepthFirstOrder(Graph g) {

		stack = new Stack<Vertex>();
		for (Vertex v : g.getVertexList()) {
			if (!v.isVisited()) {
				dfs(v);
			}
		}
	}

	private void dfs(Vertex v) {

		v.setVisited(true);

		for (Vertex v1 : v.getAdjacencies()) {
			if (!v1.isVisited()) {
				dfs(v1);
			}
		}

		stack.push(v);
	}

	public Stack<Vertex> getStack() {
		return stack;
	}
}

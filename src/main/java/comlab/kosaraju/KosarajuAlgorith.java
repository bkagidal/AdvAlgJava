package comlab.kosaraju;

public class KosarajuAlgorith {

	private int[] id;
	private boolean[] marked;
	private int count;

	public KosarajuAlgorith(Graph g) {

		DepthFirstOrder dfs = new DepthFirstOrder(g.getTransposeGraph());

		marked = new boolean[g.getVertexList().size()];
		id = new int[g.getVertexList().size()];

		for (Vertex v : dfs.getStack()) {
			if (!marked[v.getId()]) {
				dfs(v);
				count++;
			}
		}
	}

	private void dfs(Vertex v) {
		marked[v.getId()] = true;
		id[v.getId()] = count;
		v.setComponent(count);
		
		for (Vertex v1 : v.getAdjacencies()) {
			if (!marked[v1.getId()]) {
				dfs(v1);
			}
		}

	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}

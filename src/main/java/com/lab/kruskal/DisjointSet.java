package com.lab.kruskal;

import java.util.ArrayList;
import java.util.List;

public class DisjointSet {

	private int nodeCount;
	private int setCount;
	private List<Node> rootNodes;

	public DisjointSet(List<Vertex> vertexList) {
		rootNodes = new ArrayList<Node>(vertexList.size());
		makeSets(vertexList);
	}

	private void makeSets(List<Vertex> vertexList) {

		for (Vertex v : vertexList)
			makeSet(v);

	}

	private void makeSet(Vertex v) {
		Node n = new Node(0, rootNodes.size(), null);
		v.setNode(n);
		this.rootNodes.add(n);
		nodeCount++;
		setCount++;

	}

	public int find(Node n) {

		Node currentNode = n;

		while (currentNode.getParent() != null)
			currentNode = currentNode.getParent();

		Node rootNode = currentNode;
		
		currentNode = n;
		while (currentNode != rootNode) {
			Node temp = currentNode.getParent();
			currentNode.setParent(rootNode);
			currentNode = temp;
		}

		return rootNode.getId();
	}

	public void union(Node n1, Node n2) {

		int index1 = find(n1);
		int index2 = find(n2);

		if (index1 == index2)
			return;

		Node root1 = rootNodes.get(index1);
		Node root2 = rootNodes.get(index2);

		if (root1.getRank() < root2.getRank()) {
			root1.setParent(root2);
		} else if (root1.getRank() > root2.getRank()) {
			root2.setParent(root1);
		} else {
			root2.setParent(root1);
			root1.setRank(root1.getRank() + 1);
		}

		this.setCount--;
	}

}

package com.datastructures.searching;

import java.util.LinkedList;
import java.util.Stack;

public class DepthFirstSearch {

	private int vertices;
	private int edges;
	private LinkedList<Integer>[] adj;

	public DepthFirstSearch(int nodes) {
		this.vertices = nodes;
		this.edges = 0;
		adj = new LinkedList[nodes];
		for (int v = 0; v < vertices; v++) {
			adj[v] = new LinkedList<>();
		}
	}

	public void addEdge(int u, int v) {
		adj[u].add(v);
		adj[v].add(u);
		edges++;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		System.out.println("Vertices " + vertices + " edges " + edges + "\n");
		for (int v = 0; v < vertices; v++) {
			sb.append(v + ": ");
			for (int w : adj[v]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}

		return sb.toString();
	}

	public void dfs(int start) {
		boolean[] visited = new boolean[vertices];
		visited[start] = true;

		Stack<Integer> s = new Stack();
		s.push(start);
		while (!s.isEmpty()) {
			int res = s.pop();
			System.out.println(res);
			for (int w : adj[res]) {
				if (!visited[w]) {
					s.push(w);
					visited[w] = true;
				}

			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepthFirstSearch g = new DepthFirstSearch(5);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		g.addEdge(2, 4);
		// System.out.println(g);
		g.dfs(0);
	}

}

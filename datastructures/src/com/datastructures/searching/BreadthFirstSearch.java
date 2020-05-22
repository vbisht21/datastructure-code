package com.datastructures.searching;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

	private int vertices;
	private int edges;
	private LinkedList<Integer>[] adj;

	BreadthFirstSearch(int nodes) {
		this.vertices = nodes;
		this.edges = 0;
		this.adj = new LinkedList[nodes];
		for (int i = 0; i < vertices; i++) {
			adj[i] = new LinkedList<>();
		}
	}

	public void addEdge(int u, int v) {
		adj[u].add(v);
		adj[v].add(u);
	}

	public void bfs(int start) {
		boolean[] visit = new boolean[vertices];
		Queue<Integer> queue = new LinkedList<>();

		visit[start] = true;
		queue.offer(start);
		while (!queue.isEmpty()) {
			int result = queue.poll();
			System.out.println(result + " ");

			for (int w : adj[result]) {
				if (!visit[w]) {
					queue.offer(w);
					visit[w] = true;
				}
			}
		}

	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Vertices " + vertices + " Edges " + edges+"\n");
		for (int i= 0; i < vertices; i++) {
			sb.append(i + ": ");
			for (int w : adj[i]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BreadthFirstSearch g = new BreadthFirstSearch(5);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		g.addEdge(2, 4);
		//System.out.println(g);
		g.bfs(0);
	}

}

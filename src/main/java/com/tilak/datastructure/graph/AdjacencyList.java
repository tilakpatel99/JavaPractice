package com.tilak.datastructure.graph;

import java.util.LinkedList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AdjacencyList {

	//create class to store the vertex and weight
	class Edge {
		int vertex, weight;
		
		Edge(int vertex, int weight){
			this.vertex = vertex;
			this.weight = weight;
		}
		@Override
		public String toString() {
			return "vertex = "+vertex + " weight = "+weight;
		}
	}
	
	//create list of Edge array to store the graph
	private List<Edge> adjacencyGraph [] ;
	
	public AdjacencyList(int numberOfVertex) {
		
		//intilize graph size to the number of vertex present in graph
		adjacencyGraph = new LinkedList[numberOfVertex];
		
		//itereate list and create link list to each position of graph list
		for (int i=0; i<adjacencyGraph.length; i++) {
			adjacencyGraph[i]  = new LinkedList<Edge>();
		}
		
	}
	
	//funtion to add the vertex and weight to particulat position
	public void add (int position, int vertex, int weight) {
		
		//adding Edge to always 0th position of linked list because it will take O(1) time
		adjacencyGraph[position].add(0, new Edge(vertex, weight));
	}
	
	//function to check vertex is present on specifies position of graph List
	public boolean isConnected (int position, int vertex) {
		for (Edge e : adjacencyGraph[position]) {
			if (e.vertex == vertex) {
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		String result = "";
		for (int i=0; i<adjacencyGraph.length; i++) {
			result += i+ " =>"+adjacencyGraph[i]+"\n";
		}
		return result;
	}
	
	
	@Test
	public void testAdjanencyList () {
		AdjacencyList a1 = new AdjacencyList(2);
		a1.add(0, 1, 2);
		a1.add(0, 3, 4);
		a1.add(1, 10, 20);
		
		System.out.println(a1);
		
		Assert.assertEquals(a1.isConnected(1, 10), true);
	}
	
}

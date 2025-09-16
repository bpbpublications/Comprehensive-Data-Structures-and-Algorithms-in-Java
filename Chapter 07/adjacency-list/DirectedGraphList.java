//DirectedGraphList.java : Program for directed graph using adjacency list.

class VertexNode
{
	public String name;
	public VertexNode nextVertex;
	public EdgeNode firstEdge;

	public VertexNode(String name)
	{
		this.name = name;
		nextVertex = null;
		firstEdge = null;
	}
}//End of class VertexNode

class EdgeNode
{
	public VertexNode endVertex; //Destination vertex of the Edge
	public EdgeNode nextEdge;	//next Edge of the adjacency list

	public EdgeNode(VertexNode v)
	{
		this.endVertex = v;
		nextEdge = null;
	}
}//End of class EdgeNode

class DirectedGraphList
{
	private int nVertices;
	private int nEdges;
	private VertexNode start;

	public DirectedGraphList()
	{
		nVertices = 0;
		nEdges = 0;
		start = null;
	}//End of DirectedGraphList()

	public void insertVertex(String vertexName)
	{
		VertexNode p, temp;
		boolean vertexFound = false;

		p = start;

		if(p == null)
		{
			temp = new VertexNode(vertexName);
			start = temp;
			nVertices++;
		}
		else
		{
			while(p.nextVertex != null)
			{
				if(p.name == vertexName)
				{
					vertexFound = true;
					break;
				}
				p = p.nextVertex;
			}//End of while

			if(vertexFound || p.name==vertexName)
			{
				System.out.println("Vertex already present");
			}
			else
			{
				temp = new VertexNode(vertexName);
				p.nextVertex = temp;
				nVertices++;
			}
		}//End of else

	}//End of insertVertex()

	private VertexNode findVertex(String vertexName)
	{
		VertexNode p = start;

		while(p != null)
		{
			if(p.name == vertexName)
				break;

			p = p.nextVertex;
		}

		return p;
	}//End of findVertex()

	public void insertEdge(String source, String destination)
	{
		VertexNode u, v;
		EdgeNode edgeRef, temp;

		boolean edgeFound = false;

		if(source == destination)
		{
			System.out.println("Invalid Edge : source and destination vertices are same");
		}
		else
		{
			u = findVertex(source);
			v = findVertex(destination);

			if(u == null)
			{
				System.out.println("Source vertex not present, first insert vertex " + source);
			}
			else if(v == null)
			{
				System.out.println("Destination vertex not present, first insert vertex " + destination);
			}
			else
			{
				if(u.firstEdge == null)
				{
					temp = new EdgeNode(v);
					u.firstEdge = temp;
					nEdges++;
				}
				else
				{
					edgeRef = u.firstEdge;

					while(edgeRef.nextEdge != null)
					{
						if(edgeRef.endVertex.name == v.name)
						{
							edgeFound = true;
							break;
						}

						edgeRef = edgeRef.nextEdge;
					}//End of while

					if(edgeFound || edgeRef.endVertex.name==destination)
					{
						System.out.println("Edge already present");
					}
					else
					{
						temp = new EdgeNode(v);
						edgeRef.nextEdge = temp;
						nEdges++;
					}
				}//End of else
			}//End of else
		}//End of else

	}//End of insertEdge()

	public void deleteVertex(String vertexName)
	{
		deleteFromEdgeLists(vertexName);
		deleteFromVertexList(vertexName);
	}//End of deleteVertex()

	//Delete incoming edges
	private void deleteFromEdgeLists(String vertexName)
	{
		VertexNode vertexRef;
		EdgeNode edgeRef;

		vertexRef = start;

		while(vertexRef != null)
		{
			if(vertexRef.firstEdge != null)
			{
				if(vertexRef.firstEdge.endVertex.name == vertexName)
				{
					vertexRef.firstEdge = vertexRef.firstEdge.nextEdge;
					nEdges--;
					continue;
				}

				edgeRef = vertexRef.firstEdge;
				while(edgeRef.nextEdge != null)
				{
					if(edgeRef.nextEdge.endVertex.name == vertexName)
					{
						edgeRef.nextEdge = edgeRef.nextEdge.nextEdge;
						nEdges--;
						continue;
					}
					edgeRef = edgeRef.nextEdge;
				}
			}//End of if

			vertexRef = vertexRef.nextVertex;
		}//End of while
	}//End of deleteFromEdgeLists()

	//Delete outgoing edges and vertex
	private void deleteFromVertexList(String vertexName)
	{
		VertexNode vertexRef, tempVertex=null;
		EdgeNode edgeRef;

		if(start == null)
		{
			System.out.println("No vertices to be deleted");
			return;
		}

		if(start.name == vertexName)
		{
			tempVertex = start;
			start = start.nextVertex;
		}
		else	//vertex to be deleted is in between or at last
		{
			vertexRef = start;
			while(vertexRef.nextVertex != null)
			{
				if(vertexRef.nextVertex.name == vertexName)
					break;
				vertexRef = vertexRef.nextVertex;
			}

			if(vertexRef.nextVertex != null)
			{
				tempVertex = vertexRef.nextVertex;
				vertexRef.nextVertex = vertexRef.nextVertex.nextVertex;
			}
			else
			{
				System.out.println("Vertex not found");
			}
		}//End of else

		if(tempVertex != null)
		{
			edgeRef = tempVertex.firstEdge;
			while(edgeRef != null)
			{
				edgeRef = edgeRef.nextEdge;
				nEdges--;
			}

			nVertices--;
		}

	}//End of deleteFromVertexList()

	public void deleteEdge(String source, String destination)
	{
		VertexNode vertexRef;
		EdgeNode edgeRef;

		vertexRef = findVertex(source);

		if(vertexRef == null)
		{
			System.out.println("Edge not found");
		}
		else
		{
			edgeRef = vertexRef.firstEdge;

			if(edgeRef == null)
			{
				System.out.println("Edge not found");
			}
			else
			{
				if(edgeRef.endVertex.name == destination)
				{
					vertexRef.firstEdge = edgeRef.nextEdge;
					nEdges--;
				}
				else
				{
					while(edgeRef.nextEdge != null)
					{
						if(edgeRef.nextEdge.endVertex.name == destination)
						{
							break;
						}
						edgeRef = edgeRef.nextEdge;
					}

					if(edgeRef.nextEdge == null)
					{
						System.out.println("Edge not found");
					}
					else
					{
						edgeRef.nextEdge = edgeRef.nextEdge.nextEdge;
						nEdges--;
					}
				}//End of else
			}//End of else
		}//End of else

	}//End of deleteEdge()

	public void display()
	{
		VertexNode vertexRef;
		EdgeNode edgeRef;

		vertexRef = start;

		while(vertexRef != null)
		{
			System.out.println("Vertex : " + vertexRef.name);

			edgeRef = vertexRef.firstEdge;
			while(edgeRef != null)
			{
				System.out.println("Edge : " + vertexRef.name + " -> " + edgeRef.endVertex.name);
				edgeRef = edgeRef.nextEdge;
			}

			vertexRef = vertexRef.nextVertex;
		}
	}//End of display()

	public boolean edgeExists(String source, String destination)
	{
		VertexNode vertexRef;
		EdgeNode edgeRef;
		boolean edgeFound = false;

		vertexRef = findVertex(source);

		if(vertexRef != null)
		{
			edgeRef = vertexRef.firstEdge;
			while(edgeRef != null)
			{
				if(edgeRef.endVertex.name == destination)
				{
					edgeFound = true;
					break;
				}
				edgeRef = edgeRef.nextEdge;
			}
		}

		return edgeFound;
	}//End of edgeExists()

	public int getOutdegree(String vertex)
	{
		VertexNode vertexRef;
		EdgeNode edgeRef;
		int outdegree = 0;

		vertexRef = findVertex(vertex);
		if(vertexRef == null)
			throw new RuntimeException("Invalid Vertex");

		edgeRef = vertexRef.firstEdge;
		while(edgeRef != null)
		{
			outdegree++;
			edgeRef = edgeRef.nextEdge;
		}

		return outdegree;
	}//End of getOutdegree()

	public int getIndegree(String vertex)
	{
		VertexNode vertexRef;
		EdgeNode edgeRef;
		int indegree = 0;

		if(findVertex(vertex) == null)
			throw new RuntimeException("Invalid Vertex");

		vertexRef = start;
		while(vertexRef != null)
		{
			edgeRef = vertexRef.firstEdge;
			while(edgeRef != null)
			{
				if(edgeRef.endVertex.name == vertex)
				{
					indegree++;
				}
				edgeRef = edgeRef.nextEdge;
			}
			vertexRef = vertexRef.nextVertex;
		}

		return indegree;
	}//End of getIndegree()

}//End of class DirectedGraphList

class DirectedGraphListDemo
{
	public static void main(String[] args)
	{
		DirectedGraphList dGraph = new DirectedGraphList();

		try
		{
			//Creating the graph, inserting the vertices and edges
			dGraph.insertVertex("0");
			dGraph.insertVertex("1");
			dGraph.insertVertex("2");
			dGraph.insertVertex("3");

			dGraph.insertEdge("0","3");
			dGraph.insertEdge("1","2");
			dGraph.insertEdge("2","3");
			dGraph.insertEdge("3","1");
			dGraph.insertEdge("0","2");

			//Display the graph
			dGraph.display();
			System.out.println();

			//Deleting an edge
			dGraph.deleteEdge("0","2");

			//Display the graph
			dGraph.display();
			System.out.println();

			//Deleting a vertex
			dGraph.deleteVertex("0");

			//Display the graph
			dGraph.display();

			//Check if there is an edge between two vertices
			System.out.println("Edge exist : " + (dGraph.edgeExists("2","3") ? "True" : "False"));

			//Display Outdegree and Indegree of a vertex
			System.out.println("Outdegree : " + dGraph.getOutdegree("3"));
			System.out.println("Indegree : " + dGraph.getIndegree("3"));

		}//End of try
		catch (RuntimeException e)
		{
			System.out.println(e.getMessage());
		}
	}//End of main()
}//End of class DirectedGraphListDemo

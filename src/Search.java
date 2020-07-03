import java.util.*;

public class Search
{
	public static void main(String[] args)
	{
		Graph graph = new Graph();

		// Declare vertices
		Vertex S = new Vertex("S");
		Vertex A = new Vertex("A");
		Vertex B = new Vertex("B");
		Vertex C = new Vertex("C");
		Vertex D = new Vertex("D");
		Vertex E = new Vertex("E");
		Vertex F = new Vertex("F");
		Vertex H = new Vertex("H");
		Vertex G = new Vertex("G");

		// Add direct and weight
		S.addEdge(new Edge(A, 3));
		S.addEdge(new Edge(B, 6));
		S.addEdge(new Edge(C, 2));

		A.addEdge(new Edge(D, 3));

		B.addEdge(new Edge(D, 4));
		B.addEdge(new Edge(G, 9));
		B.addEdge(new Edge(E, 2));

		C.addEdge(new Edge(E, 1));

		D.addEdge(new Edge(F, 5));

		E.addEdge(new Edge(F, 6));
		E.addEdge(new Edge(H, 5));

		B.addEdge(new Edge(G, 5));

		F.addEdge(new Edge(G, 6));

		H.addEdge(new Edge(G, 6));

		// Add vertices to graph
		graph.addVertex(S);
		graph.addVertex(A);
		graph.addVertex(B);
		graph.addVertex(C);
		graph.addVertex(D);
		graph.addVertex(E);
		graph.addVertex(F);
		graph.addVertex(H);
		graph.addVertex(G);
		

		DFS(graph, S, G);
	}
	public static void PrintProcess(Vertex v)
	{
		if(v.getPreVertex()!=null)
		{
			PrintProcess(v.getPreVertex());
		}
		v.printLabel();
	}
	public static void DFS(Graph g, Vertex Start, Vertex Goal)
	{
		Stack<Vertex> Open = new Stack<Vertex>();
		Set<Vertex> Closed = new HashSet<Vertex>();
		// B1: cho dinh xuat phat vao open
		Open.add(Start);

		while (true)
		{
			// B2: neu open rong thi ket thuc
			if (Open.isEmpty())
				break;

			// B3: lay dinh dau trong open ra, goi la O. Cho O vao close
			Vertex O = Open.pop();
			Closed.add(O);

			// B4: neu O la goal thi tim kiem thanh cong
			if (O.getLabel() == Goal.getLabel())
			{
				PrintProcess(O);
				break;
			}
			
			// B5: tim tat ca cac dinh con cua O khong thuoc close va open, cho vao dau open
			List<Edge> e = O.getEdges();
			int length = e.size(); // Tong so dinh con = tong so canh
			for (int i = 0; i < length; i++)
			{
				Vertex childVertex = e.get(i).getTo();
				if (Closed.contains(childVertex)||Open.contains(childVertex))
					continue;
				childVertex.setPreVertex(O);
				Open.add(childVertex);
			}
			
			// B6: tro lai buoc 2
		}
	}

}

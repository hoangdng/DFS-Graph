import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Vertex
{
	private String label;
	private Set<Edge> edges; // all the edges of this vertex
	private Vertex preVertex = null; // the previous vertex lead to this vertex

	public Vertex(String pageObject)
	{
		this.label = pageObject;
		edges = new HashSet<>();
	}

	String getLabel()
	{
		return label;
	}

	public void printLabel()
	{
		System.out.println(this.label + " ");
	}

	public void setPreVertex(Vertex v)
	{
		this.preVertex = v;
	}

	public Vertex getPreVertex()
	{
		return this.preVertex;
	}

	boolean addEdge(Edge edge)
	{
		return edges.add(edge);
	}

	List<Edge> getEdges()
	{
		return new ArrayList<>(edges);
	}
}

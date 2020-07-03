import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph
{
	private Set<Vertex> vertices; // tat ca cac dinh 

	public Graph()
	{
		vertices = new HashSet<>();
	}

	List<Vertex> getVertices()
	{
		return new ArrayList<>(vertices);
	}

	boolean addVertex(Vertex vertex)
	{
		return vertices.add(vertex);
	}
}

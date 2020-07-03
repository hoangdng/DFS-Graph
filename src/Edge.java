
public class Edge
{
	private Vertex to; //vertex that this edge lead to
    public int weight;

    public Edge(Vertex to, int weight) {
        super();
        this.to = to;
        this.weight = weight;
    }

    Vertex getTo() {
        return to;
    }

    int getWeight() {
        return weight;
    }   
}

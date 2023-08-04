package Graph.GraphMatrix;

public class Main {
    public static void main(String[] args) {
        String[] names = {"A", "B", "C", "D", "E"};
        Graph graph = new Graph(names);
        graph.edgeTo(0, 2);
        graph.edgeBetween(0, 3);
        System.out.println(graph);
    }
}

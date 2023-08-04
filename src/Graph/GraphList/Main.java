package Graph.GraphList;

public class Main {
    public static void main(String[] args) {
        String[] names = {"A", "B", "C", "D", "E", "F", "G"};
        Graph graph = new Graph(names);
        graph.edgeBetween(0, 1);
        graph.edgeBetween(0, 2);
        graph.edgeBetween(1, 3);
        graph.edgeBetween(1, 6);
        graph.edgeBetween(2, 3);
        graph.edgeBetween(2, 4);
        graph.edgeBetween(3, 5);
        graph.edgeBetween(4, 5);
        graph.edgeBetween(6, 5);
//        System.out.println(graph);
        System.out.println(graph.BFS(0));
    }
}

package Graph.GraphMatrix;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    Node[] nodes;
    int size;
    int[][] matrix;

    public Graph() {
    }

    public Graph(int size) {
        this.size = size;
        nodes = new Node[size];
        matrix = new int[size][size];
    }

    public Graph(Node[] nodes) {
        this.nodes = nodes;
        size = nodes.length;
        matrix = new int[size][size];
    }

    public Graph(String[] nodeNames) {
        size = nodeNames.length;
        nodes = new Node[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = new Node(nodeNames[i], i);
        }
        matrix = new int[size][size];
    }

    public void edgeBetween(int i1, int i2) {
        // Adds undirected unweighted edge between two nodes
        matrix[i1][i2] = 1;
        matrix[i2][i1] = 1;
    }

    public void edgeBetween(int i1, int i2, int weight) {
        // Adds undirected weighted edge between two nodes
        matrix[i1][i2] = weight;
        matrix[i2][i1] = weight;
    }

    public void edgeTo(int fromInd, int toInd) {
        // Adds directed unweighted edge between two nodes
        matrix[fromInd][toInd] = 1;
    }

    public void edgeTo(int fromInd, int toInd, int weight) {
        // Adds directed weighted edge between two nodes
        matrix[fromInd][toInd] = weight;
    }

    public ArrayList<Node> BFS(int index) {
        ArrayList<Node> res = new ArrayList<>(nodes.length);
        Queue<Node> queue = new LinkedList<>();

        Node current = nodes[index];
        queue.add(current);
        while (!queue.isEmpty()) {
            current = queue.remove();
            current.visited = true;
            res.add(current);
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[current.index][i] > 0 && !nodes[i].visited) {
                    nodes[i].visited = true;
                    queue.add(nodes[i]);
                }
            }
        }

        return res;
    }

    public ArrayList<Node> getNeighbors(int index) {
        ArrayList<Node> res = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[index][i] > 0) res.add(nodes[i]);
        }

        return res;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();

        // First Row (only names)
        res.append("  ");
        for (Node node: nodes) {
            res.append(node.name).append(" ");
        }
        res.append("\n");

        // Remaining rows
        for (int i = 0; i < size; i++) {
            res.append(nodes[i].name).append(" ");
            for (int j = 0; j < size; j++) {
                res.append(matrix[i][j]).append(" ");
            }
            res.append("\n");
        }

        return res.toString();
    }
}

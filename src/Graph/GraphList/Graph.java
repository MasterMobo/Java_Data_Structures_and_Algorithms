package Graph.GraphList;

public class Graph {
    Node[] nodes;
    int size;

    public Graph() {
    }

    public Graph(int size) {
        this.size = size;
        nodes = new Node[size];
    }

    public Graph(Node[] nodes) {
        size = nodes.length;
        this.nodes = nodes;
    }

    public Graph(String[] nodeNames) {
        size = nodeNames.length;
        nodes = new Node[nodeNames.length];
        for (int i = 0; i < size; i++) {
            nodes[i] = new Node(nodeNames[i], i);
        }
    }

    public void edgeBetween(int i1, int i2) {
        Node node1 = nodes[i1];
        Node node2 =  nodes[i2];
        node1.neighbors.add(node2);
        node2.neighbors.add(node1);
    }

    public void edgeTo(int i1, int i2) {
        nodes[i1].neighbors.add(nodes[i2]);
    }
}

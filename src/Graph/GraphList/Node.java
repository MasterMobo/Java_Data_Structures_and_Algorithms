package Graph.GraphList;

import java.util.ArrayList;

public class Node {
    String name;
    int index;
    ArrayList<Node> neighbors = new ArrayList<>();

    public Node() {
    }

    public Node(String name, int index) {
        this.name = name;
        this.index = index;
    }
}

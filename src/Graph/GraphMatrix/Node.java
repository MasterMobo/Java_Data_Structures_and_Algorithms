package Graph.GraphMatrix;

import java.util.ArrayList;
import java.util.Arrays;

public class Node {
    String name;
    int index;
    boolean visited = false;

    public Node() {
    }

    public Node(String name, int index) {
        this.name = name;
        this.index = index;
    }

    @Override
    public String toString() {
        return name;
    }
}

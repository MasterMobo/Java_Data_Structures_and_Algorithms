package Trie;
import java.util.HashMap;

public class Node {
    HashMap<Character, Node> children;
    boolean isEnd;

    public Node() {
        children = new HashMap<>();
        isEnd = false;
    }

    public boolean contains(char c) {
        return children.containsKey(c);
    }

    public Node get(char key) {
        return children.get(key);
    }

    public int size() {
        return children.size();
    }

    public void removeChild(char c) {children.remove(c);}

    public void addChild(char c) {
        children.put(c, new Node());
    }

}

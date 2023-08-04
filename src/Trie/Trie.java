package Trie;

import java.util.Stack;

public class Trie {
    Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String s) {
        Node current = root;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!current.contains(c)) {
                current.addChild(c);
            }

            current = current.get(c);
        }

        current.isEnd = true;
    }


    public boolean exists(String s) {
        Node current = root;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!current.contains(c)) return false;
            current = current.get(c);
        }

        return current.isEnd;
    }

    public void delete(String s) {

}

}
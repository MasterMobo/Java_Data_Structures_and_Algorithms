package Trie;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("APP");
        trie.insert("API");
        trie.insert("APPLE");

//        trie.delete("APP");
        trie.delete("API");
        trie.delete("APPLE");

        System.out.println(trie.exists("APP"));
        System.out.println(trie.exists("API"));
        System.out.println(trie.exists("APPLE"));

//        System.out.println(trie.root.size());
    }
}

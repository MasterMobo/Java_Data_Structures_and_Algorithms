package Trie;

public class Test {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("APP");
        trie.insert("APPLE");

        System.out.println(trie.exists("APP"));
        System.out.println(trie.exists("APPL"));
        System.out.println(trie.exists("API"));
        System.out.println(trie.exists("VDX"));

    }
}

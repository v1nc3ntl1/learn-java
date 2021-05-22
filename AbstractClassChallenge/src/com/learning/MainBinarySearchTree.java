package com.learning;

import com.sun.source.tree.BinaryTree;

public class MainBinarySearchTree {
    public static void main(String[] args) {
        SearchTree list = new SearchTree(null);
        list.traverse(list.getRoot());

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] data = stringData.split(" ");
        for (String s: data) {
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());

        list = new SearchTree(null);
        stringData = "5 7 3 9 8 2 1 0 4 6";
        data = stringData.split(" ");
        for (String s: data) {
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
        list.removeItem(new Node("3"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("5"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("0"));
        list.removeItem(new Node("4"));
        list.removeItem(new Node("2"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("9"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("8"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("6"));
        list.traverse(list.getRoot());
        list.removeItem(list.getRoot());
        list.traverse(list.getRoot());
        list.removeItem(list.getRoot());
        list.traverse(list.getRoot());
    }
}

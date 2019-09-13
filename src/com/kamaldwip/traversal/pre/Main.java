package com.kamaldwip.traversal.pre;

public class Main {

    static class Node{
        int key;
        Node left;
        Node right;
    }

    static Node newNode(int value){
        Node node = new Node();
        node.key = value;
        node.right = node.left = null;
        return node;
    }

    static void preOrderTraversal(Node root){
        if(root == null)
            return;
        System.out.println(root.key);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }
    static void inOrderTraversal(Node root){
        if(root == null)
            return;
        inOrderTraversal(root.left);
        System.out.println(root.key);
        inOrderTraversal(root.right);
    }

    static void postOrderTraversal(Node root){
        if(root == null)
            return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.key);
    }

    public static void main(String[] args) {
	// write your code here
        Node root = newNode(25);
        root.left = newNode(15);
        root.right = newNode(35);
        root.left.left = newNode(10);
        root.left.right = newNode(20);
        root.right.left = newNode(30);
        root.right.right = newNode(40);
        System.out.println("Pre-Order Traversal is");
        preOrderTraversal(root);
        System.out.println("In-Order Traversal is ");
        inOrderTraversal(root);
        System.out.println("Post-Order Traversal is ");
        postOrderTraversal(root);

    }
}

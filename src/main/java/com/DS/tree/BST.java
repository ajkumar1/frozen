package com.DS.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ajkumar on 6/6/17.
 */
public class BST {
    Node root;

    public BST(int item){
        root = new Node(item);
    }

    public BST(){
        root = null;
    }

    public void insert(int item){
        root = insertRec(root, item);

    }

    public void search(){

    }
    public void preorder(){
        preorderRec(root);
    }
    public void inorder(){
        inorderRec(root);
    }
    public void postorder(){
        postOrderRec(root);
    }

    public void levelOrderTraversal(){
        Queue<Node> queue = new LinkedList<Node>();

        queue.add(root);
        while(!queue.isEmpty()){
            Node tempNode = queue.poll();

            System.out.println(tempNode.item);
            if(tempNode.left != null)
                queue.add(tempNode.left);
            if(tempNode.right != null)
                queue.add(tempNode.right);
        }
    }

    private Node insertRec(Node root, int item){

        if(root == null){
            root = new Node(item);
            return root;
        }

        if(item < root.item){
            root.left = insertRec(root.left, item);
        }else{
            root.right = insertRec(root.right, item);
        }
        return root;
    }

    private void preorderRec(Node root){
        if(root == null)
            return;
        System.out.println(root.item);
        preorderRec(root.left);
        preorderRec(root.right);
    }

    private void inorderRec(Node root){
        if(root == null)
            return;

        inorderRec(root.left);
        System.out.println(root.item);
        inorderRec(root.right);
    }

    private void postOrderRec(Node root){
        if(root == null)
            return;

        postOrderRec(root.left);
        postOrderRec(root.right);
        System.out.println(root.item);
    }
}

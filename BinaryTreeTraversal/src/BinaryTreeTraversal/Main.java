/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTreeTraversal;

/**
 *
 * @author pratik
 */
public class Main {
    
    
    public static void preOrder(BinaryTreeNode root){
        
        if(root!=null){
            System.out.println(root.getData());
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }
    
    public static void postOrder(BinaryTreeNode root){
        
        if(root!=null){
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.println(root.getData());
        }
    
    }
    
    public static void inOrder(BinaryTreeNode root){
        if(root!=null){
            inOrder(root.getLeft());
            System.out.println(root.getData());
            inOrder(root.getRight());
            
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creating the nodes
        BinaryTreeNode root = new BinaryTreeNode(5);
        BinaryTreeNode node1 = new BinaryTreeNode(4);
        BinaryTreeNode node2 = new BinaryTreeNode(8);
        BinaryTreeNode node3 = new BinaryTreeNode(8);
        BinaryTreeNode node4 = new BinaryTreeNode(10);
        BinaryTreeNode node5 = new BinaryTreeNode(12);
        
        //Binarry Tree Struture
        /*
                    5
                  /   \ 
                4       8
               / \     /
              8  10   12
        */
        
        //Building the nodes
        root.setLeft(node1);
        root.setRight(node2);
        node1.setLeft(node3);
        node1.setRight(node4);
        node2.setLeft(node5);
        
        
        //preOrder Method Call
        System.out.println("\nPre Order Traversal:");
        preOrder(root);
        
        //PostOrder Method Call
        System.out.println("\nPost Order Traversal:");
        postOrder(root);
        
        //In Order Method Call
        System.out.println("\nIn Order Traversal:");
        inOrder(root);
        
        
    }
    
}

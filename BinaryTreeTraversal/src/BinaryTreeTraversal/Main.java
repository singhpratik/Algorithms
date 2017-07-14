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
    
    
    public void preOrder(BinaryTreeNode root){
        
        
    
    }
    
    public void postOrder(BinaryTreeNode root){
    
    }
    
    public void inOrder(BinaryTreeNode root){
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            
        BinaryTreeNode root = new BinaryTreeNode(5);
        BinaryTreeNode node1 = new BinaryTreeNode(4);
        BinaryTreeNode node2 = new BinaryTreeNode(8);
        BinaryTreeNode node3 = new BinaryTreeNode(8);
        BinaryTreeNode node4 = new BinaryTreeNode(10);
        BinaryTreeNode node5 = new BinaryTreeNode(12);
        
        root.setLeft(node1);
        root.setRight(node2);
        node1.setLeft(node3);
        node1.setRight(node4);
        node2.setLeft(node5);
        
    }
    
}

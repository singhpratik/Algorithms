/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author pratik
 */
public class BinaryTree {

    
    Node root=new Node();
    
    public BinaryTree(){
        
        
    }
    
   public BinaryTree(int dat){
        root.data = dat;
        root.left = null;
        root.right = null;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BinaryTree binaryTree = new BinaryTree(5);
        Node node1  = new Node(3);
        Node node2 = new Node(6);
        Node node3 = new Node(9);
        binaryTree.root.left = node1;
        binaryTree.root.right = node2;
       binaryTree.root.left.left = node3;
       
       Node node  = binaryTree.root;
       while(node!=null){
           System.out.println(node.data);
           node =node.left;
       }
        
    }
    
    
}

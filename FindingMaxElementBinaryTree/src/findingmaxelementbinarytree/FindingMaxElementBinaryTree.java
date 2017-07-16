/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findingmaxelementbinarytree;

/**Program to find the maximum element in the binary tree
 *
 * @author pratik
 */

public class FindingMaxElementBinaryTree {
    public static int maxElemet;
    /**
     * @param args the command line arguments
     */
    public static void preOrder(BinaryTreeNode root){
        
        if(root!=null){
        
            preOrder(root.getLeft());
            if(root.getData()>maxElemet){
                maxElemet = root.getData();
            }
            preOrder(root.getRight());
        }
    }
    
    public static void main(String[] args) {
         
        //Creating the nodes
        BinaryTreeNode root = new BinaryTreeNode(5);
        BinaryTreeNode node1 = new BinaryTreeNode(4);
        BinaryTreeNode node2 = new BinaryTreeNode(22);
        BinaryTreeNode node3 = new BinaryTreeNode(8);
        BinaryTreeNode node4 = new BinaryTreeNode(10);
        BinaryTreeNode node5 = new BinaryTreeNode(12);
        
        //Binarry Tree Struture
        /*
                    5
                  /   \ 
                4       22
               / \     /
              8  10   12
        */
        
        //Building the nodes
        root.setLeft(node1);
        root.setRight(node2);
        node1.setLeft(node3);
        node1.setRight(node4);
        node2.setLeft(node5);
        
        maxElemet = root.getData();
        preOrder(root);
        System.out.println("The max Element is "+maxElemet);
       
    }
    
}

package myBinaryTree;

import java.util.*;

public class BinaryTree2 {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        String str = "4(2(3)(1))(6(5))";
        // Node head = new Node("2");
        Node2 node = null;
        int len = str.length();
        int data = 10;
        int data2 = data;
        int data3 = data;
        System.out.println(data2);
        System.out.println(data3);
    
        // Node2 root = treeFromBinary(str, node, 0, len);
        // postOrder(root);
    }
    static void postOrder(Node2 root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.err.print(root.data + " ");      
    }

    // static Node2 treeFromBinary(String str, Node2 root, int i, int len){
        
    //     String temp = "";
        
    //         while((str.charAt(i) != '(' || str.charAt(i) != ')') && i<=len-1){
    //             temp = temp+ str.charAt(i);
    //             i++;
    //             len--;
    //         }
    //           root.data = temp; 
            
    //         if(str.charAt(i) == '('){
    //            treeFromBinary(str, root, i, len);
    //         }
    //         if(str.charAt(i) == ')'){
    //             return root;
    //         }
        


    //     return root;
    // }

  
}


class Node2{
    Node2 left, right;
    String data;
    public Node2(String data){
        this.data = data;
    }
}
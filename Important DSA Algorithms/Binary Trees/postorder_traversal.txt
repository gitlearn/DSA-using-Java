import java.util.*;
class Node{
    int value;
    Node left, right;
    public Node(int value){
        this.value = value;
        left = right = null;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        inorder(root);
        System.out.println();
        inorder_iterative(root);
        System.out.println();
        inorder_iterative1(root);
    }
    
    //Recursive Approach
    
    public static void postorder(Node root){
	    if(root == null) return;
	    postorder(root.left);
	    postorder(root.right);
	    System.out.print(root.value + " ");
	}
}
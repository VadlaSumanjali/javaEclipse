package trees;

import java.util.ArrayList;
class Node{
	int data;
	Node left;
	Node right;
	public Node(int data) {
		this.data=data;
	}
}
public class PostOrderTraversal {
	
	public static void postOrder(Node root,ArrayList<Integer> res) {
		if(root==null) {
			return;
		}
		postOrder(root.left, res);
		postOrder(root.right, res);
		res.add(root.data);
	}

	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.right=new Node(6);
		
		ArrayList<Integer> res=new ArrayList<Integer>();
		
		postOrder(root,res);
		
		System.out.println(res);
	}

}

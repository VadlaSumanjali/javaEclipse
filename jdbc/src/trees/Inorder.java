package trees;

import java.util.ArrayList;
class Tree{
	int data;
	Tree left;
	Tree right;
	public Tree(int data) {
		this.data=data;
	}
}
public class Inorder {
	
	public static void inorderTraversal(Tree node ,ArrayList<Integer> res) {
		if(node==null) {
			return;
		}
		inorderTraversal(node.left, res);
		res.add(node.data);
		inorderTraversal(node.right, res);
	}

	public static void main(String[] args) {
		Tree root=new Tree(1);
		root.left=new Tree(2);
		root.right=new Tree(3);
		root.left.left=new Tree(4);
		root.left.right=new Tree(5);
		root.right.right=new Tree(6);
		
		ArrayList<Integer> res=new ArrayList<Integer>();
		
		inorderTraversal(root, res);
		
		System.out.println(res);
		

	}

}

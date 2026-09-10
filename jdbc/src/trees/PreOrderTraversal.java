package trees;

import java.util.ArrayList;
import java.util.Iterator;

class Tree{
	int data;
	Tree left;
	Tree right;
	public Tree(int data){
		this.data=data;
	}
}
public class PreOrderTraversal { 
	public static void preOrder(Tree node,ArrayList<Integer> res) {
		if(node==null) return ; 
		res.add(node.data);
		preOrder(node.left, res);
		preOrder(node.right, res);
	}
	public static void main(String[] args) {
		Tree root=new Tree(1);
		root.left=new Tree(2);
		root.right=new Tree(3);
		root.left.left=new Tree(4);
		root.left.right=new Tree(5);
		root.right.right=new Tree(6);
		
		ArrayList<Integer> res=new ArrayList<Integer>();
		
		preOrder(root,res);
		
		for(int val:res) {
			System.out.print(val+" ");
		}

	}

}

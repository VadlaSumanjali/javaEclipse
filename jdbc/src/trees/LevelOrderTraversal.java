package trees;

import java.util.*;

class Tree {

    int data;

    Tree left;
    Tree right;
 
    public Tree(int data) {
        this.data = data;
    }
}

public class LevelOrderTraversal {

    public static void levelOrder(Tree root) {
    	Queue<Tree> q=new LinkedList<Tree>();
    	q.add(root);
    	while(!q.isEmpty()) {
    		Tree curr=q.poll();
    		System.out.print(curr.data+" ");
    		if(curr.left!=null) {
    			q.add(curr.left);
    		}
    		if(curr.right!=null) {
    		    q.add(curr.right);
    		}
    	}
    }

    public static void main(String[] args) {

        Tree root = new Tree(1);

        root.left = new Tree(2);
        root.right = new Tree(3);

        root.left.left = new Tree(4);
        root.left.right = new Tree(5);

        root.right.right = new Tree(6);

        levelOrder(root);
    }
}
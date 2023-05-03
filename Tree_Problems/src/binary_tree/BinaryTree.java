package binary_tree;

import java.util.*;

class Node {
	int value;
	Node left, right;

	Node(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
}

public class BinaryTree {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Node> stack = new Stack<>();
		System.out.println("Enter the root value:");
		int rootValue = scan.nextInt();
		Node root = new Node(rootValue);
		stack.push(root);
		while (!stack.isEmpty()) {
			Node currNode = stack.pop();
			System.out.println("Enter the left child of " + currNode.value + " (or -1 if no left child):");
			int leftValue = scan.nextInt();
			if (leftValue != -1) {
				currNode.left = new Node(leftValue);
				stack.push(currNode.left);
			}
			System.out.println("Enter the right child of " + currNode.value + " (or -1 if no right child):");
			int rightValue = scan.nextInt();
			if (rightValue != -1) {
				currNode.right = new Node(rightValue);
				stack.push(currNode.right);
			}

		}
		System.out.println(height(root));
		System.out.println(size(root));
		System.out.println(findMax(root));
		System.out.println(findMin(root));
		System.out.println(diameter(root));
	}

	static int height(Node node) {
		if (node == null)
			return 0;
		return Math.max(height(node.left), height(node.right)) + 1;
	}

	static int size(Node root) {
		if (root == null)
			return 0;
		return size(root.left) + size(root.right) + 1;
	}

	public static int findMax(Node root) {
		if (root == null)
			return Integer.MIN_VALUE;
		return Math.max(root.value, Math.max(findMax(root.left), findMax(root.right)));
	}

	public static int findMin(Node root) {
		if (root == null)
			return Integer.MAX_VALUE;
		return Math.min(root.value, Math.min(findMin(root.left), findMin(root.right)));
	}
    public static int diameter(Node root) {
    	int ans=0;
    	if(root==null) {
    		return 0;
    	}
    	
    	int d1=diameter(root.left);
    	int d2=diameter(root.right);
    	ans = Math.max(ans,1+d1+d2);
    	return 1+ Math.max(d1, d2);
    }
}

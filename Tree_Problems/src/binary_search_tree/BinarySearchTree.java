package binary_search_tree;

class BinarySearchTree {

	public static void main(String args[]) {
		int values[] = { 1, 3, 5, 7, 9, 2, 4, 6, 8 };
		Node root = null;

		for (int i = 0; i < values.length; i++) {
			root = insert(root, values[i]);
		}
		inorder(root);
		System.out.println();

		if (search(root, 10)) {
			System.out.println("found");
		} else {
			System.out.println("not found");
		}
		delete(root, 4);
		inorder(root);
	}

	public static Node insert(Node root, int value) {
		if (root == null) {
			root = new Node(value);
			return root;
		}
		if (root.data > value) {
			root.left = insert(root.left, value);
		} else {
			root.right = insert(root.right, value);
		}
		return root;
	}

	public static void inorder(Node root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

	public static boolean search(Node root, int key) {
		if (root == null) {
			return false;
		}

		if (root.data > key) {
			return search(root.left, key);
		} else if (root.data == key) {
			return true;
		} else {
			return search(root.right, key);
		}
	}

	public static Node delete(Node root, int value) {
		if (root.data > value) {
			root.left = delete(root.left, value);
		} else if (root.data < value) {
			root.right = delete(root.right, value);
		} else {
			if (root.left == null && root.right == null) {
				return null;
			}
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}

			Node IS = inorderSuccessor(root.right);
			root.data = IS.data;
			root.right = delete(root.right, IS.data);
		}
		return root;
	}

	static Node inorderSuccessor(Node root) {
		while (root.left != null) {
			root = root.left;
		}
		return root;
	}

}

class Node {
	int data;
	Node left, right;

	Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
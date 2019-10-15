import java.util.Scanner;

class Node {
	int data;
	Node left, right;

	public Node(int item) {
		data = item;
		left = right = null;
	}
}

public class BST {

	Node root;

	BST() {
		root = null;
	}

	Node delete(Node root, int data) {
		/* If the root is null than tree is empty */
		if (root == null)
			return root;

		// travels till the end
		if (data < root.data) {
			root.left = delete(root.left, data);
		} else if (data > root.data) {
			root.right = delete(root.right, data);
		}

		else {
			// node with only one child or no child
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;
		}
		return root;
	}

	Node insert(Node root, int data) {

		// If the root is null than tree is empty, new node will become root
		if (root == null) {
			root = new Node(data);
			return root;
		}

		// if data is < root go left
		if (data < root.data)
			root.left = insert(root.left, data);
		// if data > root go right
		else if (data > root.data)
			root.right = insert(root.right, data);

		return root;
	}

	// Prints left-right-data
	void postorder(Node node) {
		if (node == null)
			return;

		// traverse on left subtree
		postorder(node.left);

		// traverse right subtree
		postorder(node.right);

		// print node data
		System.out.print(node.data + " ");
	}

	// prints root left root right
	void inorder(Node node) {
		if (node == null)
			return;

		// traverse on left subtree
		inorder(node.left);

		// print root
		System.out.print(node.data + " ");

		// traverse on right subtree
		inorder(node.right);
	}

	// root left right
	void preorder(Node node) {
		if (node == null)
			return;

		// print root
		System.out.print(node.data + " ");

		// traverse on left subtree
		preorder(node.left);

		// traverse on right subtree
		preorder(node.right);
	}

	int minValue(Node node) {
		Node current = node;

		// loop to find left most node
		while (current.left != null) {
			current = current.left;
		}
		return (current.data);
	}

	int maxValue(Node node) {
		Node current = node;

		// loop to find right most node
		while (current.right != null) {
			current = current.right;
		}
		return (current.data);
	}

	public static void main(String[] args) {
		BST tree = new BST();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("\n1.Add\n2.Remove\n3.PrintAllTraversal\n4 Quit");
			int ch = sc.nextInt();
			int ele;
			switch (ch) {
			case 1:
				System.out.println("Enter element to add: ");
				ele = sc.nextInt();
				tree.root=tree.insert(tree.root, ele);
				break;
			case 2:
				System.out.println("Enter element to delete: ");
				ele = sc.nextInt();
				tree.root=tree.delete(tree.root, ele);
				break;
			case 3:
				System.out.println("Inorder: ");
				tree.inorder(tree.root);
				System.out.println("\nPreorder: ");
				tree.preorder(tree.root);
				System.out.println("\nPostOrder: ");
				tree.postorder(tree.root);
				break;
			case 4:
				flag = false;

			}
		}
		System.out.println("Final Tree: ");
		tree.inorder(tree.root);
		
		System.out.println("\nBye Bye..");
	}
}
package com.dailycoding.three.zero;

/** Kth Largest / Smallest element in a binary tree **/

public class BinaryTree {
	TreeNode root;
	static int largeCounter = 0;
	static int smallCounter = 0;

	public BinaryTree() {
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new TreeNode(20);
		tree.root.left = new TreeNode(10);
		tree.root.left.left = new TreeNode(5);
		tree.root.left.right = new TreeNode(7);

		tree.root.right = new TreeNode(30);
		tree.root.right.left = new TreeNode(25);
		tree.root.right.right = new TreeNode(35);
		tree.root.right.right.right = new TreeNode(40);
		inOrder(tree.root); // prints the tree node inorder 
		System.out.println();
		int k = 1;
		tree.kthLargestNode(tree.root, k);
		System.out.println();
		tree.kthSmallesttNode(tree.root, k);

	}

	public void kthLargestNode(TreeNode node, int k) {
		if (node == null || largeCounter >= k) {
			return;
		}
		kthLargestNode(node.right, k);
		largeCounter++;
		if (largeCounter == k) {
			System.out.print(k + "th largest element is " + node.val);
			return;
		}
		kthLargestNode(node.left, k);
	}
	
	
	public void kthSmallesttNode(TreeNode node, int k) {
		if (node == null || smallCounter >= k) {
			return;
		}
		kthSmallesttNode(node.left, k);
		smallCounter++;
		if (smallCounter == k) {
			System.out.print(k + "th smallest element is " + node.val);
			return;
		}
		kthSmallesttNode(node.right, k);
	}

	public static void inOrder(TreeNode node) {
		if (node == null) {
			return;
		}
		// largest = node.val;
		inOrder(node.left);
		System.out.print(node.val + " ");
		inOrder(node.right);
		// secondLargest=node.val;
	}
}

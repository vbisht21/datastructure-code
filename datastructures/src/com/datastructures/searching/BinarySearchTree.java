package com.datastructures.searching;

public class BinarySearchTree {

	private TreeNode root;

	class TreeNode {
		private int data;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	public void insert(int value) {
		root = insert(root, value);
	}

	public TreeNode insert(TreeNode root, int value) {
		if (root == null) {
			root = new TreeNode(value);
			return root;
		}
		if (value < root.data) {
			root.left = insert(root.left, value);
		} else {
			root.right = insert(root.right, value);
		}
		return root;
	}

	public void inorder() {
		inorder(root);
	}

	public void inorder(TreeNode root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.data + " ");
		inorder(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchTree b = new BinarySearchTree();
		b.insert(5);
		b.insert(3);
		b.insert(7);
		b.insert(1);
		b.inorder();
	}

}

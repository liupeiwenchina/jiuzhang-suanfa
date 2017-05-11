package com.binarytree;

import java.util.Stack;

class Node2 {

	private int key;

	private Node2 left;

	public Node2 getLeft() {
		return left;
	}

	public void setLeft(Node2 left) {
		this.left = left;
	}

	public Node2 getRight() {
		return right;
	}

	public void setRight(Node2 right) {
		this.right = right;
	}

	private Node2 right;

	public Node2(int key) {
		this.setKey(key);
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

}

public class PreOrderIteration {
	public static void iteratePreOrder(Node2 root) {
		Stack<Node2> stack = new Stack<Node2>();

		if (root != null) {
			stack.push(root);
			while (!(stack.empty())) {
				root = stack.pop();
				visit(root);
				if (root.getRight() != null) {
					stack.push(root.getRight());
				}
				if (root.getLeft() != null) {
					stack.push(root.getLeft());
				}

			}

		}

	}

	private static void visit(Node2 n) {

		System.out.println(n.getKey());

	}
}

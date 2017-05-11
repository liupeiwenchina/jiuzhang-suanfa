package com.binarytree;

public class Test {

	public static void main(String[] args) {
		Node2 n1 = new Node2(1);
		Node2 n2 = new Node2(2);
		Node2 n3 = new Node2(3);
		Node2 n4 = new Node2(4);
		Node2 n5 = new Node2(5);
		Node2 n6 = new Node2(6);
		Node2 n7 = new Node2(7);
		n1.setLeft(n2);
		n1.setRight(n3);
		n2.setLeft(n4);
		n2.setRight(n5);
		n3.setLeft(n6);
		n3.setRight(n7);
		
		
		PreOrderIteration.iteratePreOrder(n1);
	}

}

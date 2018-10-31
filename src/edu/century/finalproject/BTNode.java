package edu.century.finalproject;

import java.util.Scanner;


public class BTNode<T> {
	private T position;
	private  T data;
	private BTNode<T> left, right;
	public BTNode(T initPos, T initData) {
		position = initPos;
		data = initData;
	}
	
	public BTNode() {
		data = null;
		left = null;
		right = null;
	}
	public void insert(T headPos, T leftPos,
			T leftData, T rightPos, T rightData){
		if(position.equals(headPos)) {
			left = new BTNode<>(leftPos, leftData);
			right = new BTNode<>(rightPos, rightData);
			return;
		}else {
		if(left != null) 
			left.insert(headPos,leftPos,
					leftData, rightPos, rightData);	
		if(right != null)
			right.insert(headPos,leftPos,
					leftData, rightPos, rightData);	
		}
		
	}
	public void printAll() {
		System.out.println(data.toString());
		if(left != null) left.printAll();
		if(right != null) right.printAll();
		
	}

	public void printYN() {
		Character yn = 'q';
		System.out.println(data.toString());
		Scanner input = new Scanner(System.in);
		yn = input.next().charAt(0);
		if(yn.equals('y') ) {
			if(left!=null)
			left.printYN();
		}
		if(yn.equals('n')) {
			if (right!=null)
				right.printYN();
		}
		
	}

	public T getPosition() {
		return position;
	}

	public void setPosition(T position) {
		this.position = position;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BTNode<T> getLeft() {
		return left;
	}

	public void setLeft(BTNode<T> left) {
		this.left = left;
	}

	public BTNode<T> getRight() {
		return right;
	}

	public void setRight(BTNode<T> right) {
		this.right = right;
	}
			
	
		

}

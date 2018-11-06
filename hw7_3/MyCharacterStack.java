package hw7_3;

import java.util.EmptyStackException;

public class MyCharacterStack {

	private class Node {
		char data;
		Node link;

		Node(char data) {
			this.data = data;
		}
	}

	private Node top = null;

	public boolean isEmpty() {
		return (top == null);
	}

	public void push(char data) {
		Node StackNode = new Node(data);
		StackNode.link = top;
		top = StackNode;
	}

	public char pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		} 
		else 
		{
			char newdata = top.data;
			top = top.link;
			return newdata;
		}
	}

	public char peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		else
		{
			return top.data;
		}
	}

}

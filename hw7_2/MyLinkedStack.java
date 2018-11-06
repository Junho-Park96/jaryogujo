package hw7_2;

import java.util.EmptyStackException;

public class MyLinkedStack {
	
	private class StackNode{

		 int data;
		 StackNode link;
		
		StackNode(int data) {
			this.data = data;
		}

	}
	
	private StackNode top = null;

	public void push(int data) {
		StackNode newNode = new StackNode(data);
		newNode.link = top;
		top = newNode;
		System.out.println("삽입할 아이템 : " + data);
	
	}


	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		else {
			int data = top.data;
			top = top.link;
			return data;
		}
	}
	public boolean isEmpty() {
		return (top == null);

	}


	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
			
		}
		else 
			return top.data;

	}
}


/*
 * 파일명 : MyLinkedQueueTest.java
 * 작성일: 2018년 11월 6일
 * 작성자: 박준호
 * 내용: 연결자료구조를 이용한 큐 구현을 연습한다.
 */

package hw8_2;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class MyLinkedQueue {

	private class Node {
		int data;
		Node link;

		Node(int data) {
			this.data = data;
		}
	}

	private int count;
	private Node front;
	private Node rear;


	public MyLinkedQueue() {

		front=null;
		rear=null;
		count = 0;
	}

	public boolean isEmpty() {
		return (count == 0);
	}

	public void enQueue(int data) {

		Node newNode=new Node(data);

		if(isEmpty()) {
			front = newNode;
			rear = newNode;

		}
		else {
			rear.link=newNode;
			rear=newNode;
		}
		count++;
	}

	public int deQueue() {
		int del;
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		else {
			del=front.data;
			front=front.link;
			count--;
			return del;
		}
	}

	public int peek() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		else {
			return front.data;
		}
	}

	public int arraySize() {
		return count;
	}
}
package hw8_1;

import java.util.NoSuchElementException;

/*
 * 파일명 : MyCircularQueue.java
 * 작성일: 2018년 11월 1일
 * 작성자: 박준호
 * 내용: 배열을 이용한 원형 큐 구현을 연습한다.
 */

public class MyCircularQueue {
	private int[] array;
	private int arraySize;
	private int count;
	private int front;
	private int rear;

	public MyCircularQueue(int n) {
		array = new int[n];
		arraySize = n;
		count = 0;
		front = 0;
		rear = 0;
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public boolean isFull() {
		return count == arraySize;
	}

	public void enQueue(int item) {
		if(isFull()) {
			System.out.println("큐가 가득 차서 삽입할 수 없습니다. ");
		}
		else {
			rear = (rear+1) % arraySize;
			array[rear] = item;
			count++;
		
		}

	}

	public int deQueue() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		else {
			front = (front + 1) % arraySize;
			count--;
			return array[front];
		}
	}

	public int peek() {
		if(isEmpty()) {
			throw new NoSuchElementException(); 
		}
		else
			return array[(front+1) % arraySize];
	}

	public int arraySize() {
		return count;
	}
}



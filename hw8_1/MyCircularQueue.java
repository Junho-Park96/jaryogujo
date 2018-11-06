package hw8_1;

import java.util.NoSuchElementException;

/*
 * ���ϸ� : MyCircularQueue.java
 * �ۼ���: 2018�� 11�� 1��
 * �ۼ���: ����ȣ
 * ����: �迭�� �̿��� ���� ť ������ �����Ѵ�.
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
			System.out.println("ť�� ���� ���� ������ �� �����ϴ�. ");
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



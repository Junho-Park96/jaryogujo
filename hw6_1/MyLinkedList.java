//***************************
// ���ϸ�: hw6_1.java
// �ۼ���: ����ȣ
// �ۼ���: 2018.10.04
// ����: �ܼ� ���Ḯ��Ʈ ������ �����Ѵ�.
//***************************
package hw6_1;

import java.util.Scanner;

public class MyLinkedList {

	private class Node {
		int data;
		Node link;

		Node(int data) {
			this.data = data;
		}
	}
	private Node head = null ;

	public int size() { //����Ʈ�� ���̸� ����
		int size = 0;
		Node temp = head;
		while (temp!=null) {
			temp = temp.link;
			size++;
		}
		return size;
	}


	public void addFirst(int data) { 
		Node n = new Node(data);
		n.link = head;
		head = n;
	}


	public void addLast(int data) { //�������� �Ű������� �޾� ����Ʈ�� �������� ����
		Node t = new Node(data);
		Node temp = null; 

		if(head == null){
			t.link = head;
			head = t;

		}
		else {
			temp = head;
			while (temp.link != null) {
				temp = temp.link;
			}
			temp.link = t;
		}
	}

	public int removeFirst() { // ����Ʈ�� ���� �� ����(������)�� �����Ͽ� ����
		int delnum = head.data;
		if (head != null) {
			head = head.link;
		}
		return delnum;

	}

	public int removeLast() { // ����Ʈ�� ������ ����(������)�� �����Ͽ� ���� 

		int delnum = 0;
		Node temp = head;

		if (head.link == null) {
			delnum = temp.data;
			head = null;
		} 
		else {
			while (temp.link.link != null)
			{
				temp = temp.link;
			}
			delnum = temp.link.data;
			temp.link = null;
		}
		return delnum;
	}


	@Override
	public String toString() {
		Node t = head;
		String str = " ";
		while (t != null) {
			str += " " + t.data;
			t = t.link;
		}
		return "list =" + str;
	}

}


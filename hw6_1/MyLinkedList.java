//***************************
// 파일명: hw6_1.java
// 작성자: 박준호
// 작성일: 2018.10.04
// 설명: 단순 연결리스트 연산을 구현한다.
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

	public int size() { //리스트의 길이를 리턴
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


	public void addLast(int data) { //정수값을 매개변수로 받아 리스트의 마지막에 삽입
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

	public int removeFirst() { // 리스트의 가장 앞 원소(정수값)을 삭제하여 리턴
		int delnum = head.data;
		if (head != null) {
			head = head.link;
		}
		return delnum;

	}

	public int removeLast() { // 리스트의 마지막 원소(정수값)을 삭제하여 리턴 

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


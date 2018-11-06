//***************************
// 파일명: lab6_2.java
// 작성자: 박준호
// 작성일: 2018.10.04
// 설명: 이중 연결리스트 구현을 준비한다.
//***************************
package lab6_2;

public class MyDoublyLinkedList {

	private class Node {
		int data;
		Node rlink;
		Node llink;

		Node(int data) {
			this.data = data;
		}
	}
	private Node head = null ;

	public void addFirst(int data) {
		Node temp = new Node (data);
		if(head == null) {
			head = temp;
		}
		else{
			temp.rlink = head;
			head.llink = temp;
			head = temp;
		}
	}

	@Override
	public String toString() {
		Node t = head;
		String str = " ";
		while (t != null) {
			str += " " + t.data;
			t = t.rlink;

		}
		return "list =" + str;
	}

	// 양방향 링크가 제대로 구성되었는지를 확인하기 위해 리스트를 왕복하며 출력하는 메소드
	public void printList() {
		if(head == null) {
			System.out.println("( )( )");
		}
		else {
			System.out.print("(");
			Node temp = head;

			while( temp.rlink != null) {
				System.out.print(" " + temp.data);
				temp = temp.rlink;
			}
			System.out.print(" " + temp.data);
			System.out.print(") ");
			System.out.print("( ");
			while(temp != null) {
				System.out.print(" " + temp.data);
				temp = temp.llink;

			}
			System.out.println(")");
		}
	}
}

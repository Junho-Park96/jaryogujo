//***************************
// ���ϸ�: lab6_2.java
// �ۼ���: ����ȣ
// �ۼ���: 2018.10.04
// ����: ���� ���Ḯ��Ʈ ������ �غ��Ѵ�.
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

	// ����� ��ũ�� ����� �����Ǿ������� Ȯ���ϱ� ���� ����Ʈ�� �պ��ϸ� ����ϴ� �޼ҵ�
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

//***************************
// ���ϸ�: lab6_1.java
// �ۼ���: ����ȣ
// �ۼ���: 2018.09.27
// ����: �ܼ� ���Ḯ��Ʈ ������ �غ��Ѵ�.
//***************************
package lab6_1;

public class MyLinkedList {

	private class Node {
		int data;
		Node link;
		
		Node(int data) {
			this.data = data;
		}
	}
	private Node head = null ;

	public void addFirst(int data) {
		Node t = new Node(data);
		t.link = head;
		head = t;
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


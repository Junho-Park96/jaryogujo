//***************************
// ���ϸ�: lab6_2.java
// �ۼ���: ����ȣ
// �ۼ���: 2018.10.04
// ����: ���� ���Ḯ��Ʈ ������ �غ��Ѵ�.
//***************************
package lab6_2;

public class MyDoublyLinkedListTest {	
	public static void main(String [] args) {
		System.out.println("lab6_2 : ����ȣ \n");
		MyDoublyLinkedList list = new MyDoublyLinkedList();

		System.out.println(list);

		list.addFirst(2);
		list.addFirst(-3);
		list.addFirst(0);

		System.out.println(list);
		list.printList();
	}
}




//***************************
// 파일명: lab6_2.java
// 작성자: 박준호
// 작성일: 2018.10.04
// 설명: 이중 연결리스트 구현을 준비한다.
//***************************
package lab6_2;

public class MyDoublyLinkedListTest {	
	public static void main(String [] args) {
		System.out.println("lab6_2 : 박준호 \n");
		MyDoublyLinkedList list = new MyDoublyLinkedList();

		System.out.println(list);

		list.addFirst(2);
		list.addFirst(-3);
		list.addFirst(0);

		System.out.println(list);
		list.printList();
	}
}




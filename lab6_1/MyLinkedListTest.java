//***************************
// 파일명: lab6_1.java
// 작성자: 박준호
// 작성일: 2018.09.27
// 설명: 단순 연결리스트 구현을 준비한다.
//***************************
package lab6_1;

public class MyLinkedListTest {
	
	public static void main(String [] args) {
		System.out.println("lab6_1 : 박준호 \n");
		MyLinkedList list = new MyLinkedList();
		
		System.out.println(list);
		
		list.addFirst(2);
		list.addFirst(-3);
		list.addFirst(0);
		
		System.out.println(list);
	}
}

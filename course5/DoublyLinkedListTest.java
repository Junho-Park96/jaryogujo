package course5;
/*
//***************************
// 파일명: course5.java
// 작성자: 박준호
// 작성일: 2018.10.16
// 설명: 이중 연결 리스트의 연산을 연습한다.
//***************************
 */

class Node {
	int data;  // 리스트 원소값
	Node llink;  // 왼쪽 링크
	Node rlink;  // 오른쪽 링크
	Node(int data) {
		this.data = data;
		this.llink = null;
		this.rlink = null;
	}
}

public class DoublyLinkedListTest {
	public static void main(String[] args) {
		System.out.println("course5 : 박준호 ");

		// 선형 리스트 list = (22, 33, 44, 55, 66) 를 이중 연결 리스트로 표현
		Node n1 = new Node(22);
		Node n2 = new Node(33);
		Node n3 = new Node(44);
		Node n4 = new Node(55);
		Node n5 = new Node(66);
		n1.rlink = n2;
		n2.llink = n1;
		n2.rlink = n3;
		n3.llink = n2;
		n3.rlink = n4;
		n4.llink = n3;
		n4.rlink = n5;
		n5.llink = n4;
		Node list = n1;
		n1 = n2 = n3 = n4 = n5 = null;

		// 리스트를 왕복 출력
		System.out.print("리스트의 초기 상태: ");
		printList(list);

		// (1) 리스트의 첫번째 원소를 삭제

		list = list.rlink;
		list.llink = null;

		// 리스트를 왕복 출력
		System.out.print("첫번째 원소 삭제 후: ");
		printList(list);

		// (2) 리스트의 맨 앞에 11을 삽입

		Node n = new Node(11);
		n.rlink = list;
		list.llink = n;
		list = n;
		n.llink = null;

		// 리스트를 왕복 출력
		System.out.print("맨 앞에 11 삽입 후: ");
		printList(list);

		System.out.println("======================"); // 1단계는 여기까지임

		// (3) 리스트의 마지막 원소를 삭제

		Node temp = list;
		while(temp.rlink!=null) {
			temp = temp.rlink;
		}
		
		temp.llink.rlink=null;




		// 리스트를 왕복 출력
		System.out.print("마지막 원소 삭제 후: ");
		printList(list);

		// (4) 리스트의 맨 뒤에 99를 삽입

		Node node = new Node(99);
		Node temp1 = list;
		while(temp1 .rlink!=null) {
			temp1 = temp1.rlink;
		}
		temp1.rlink = node;
		node.llink = temp1;



		// 리스트를 왕복 출력
		System.out.print("맨 뒤에 99 삽입 후: ");
		printList(list);

		// (5) 전체 원소 합을 구하여 출력

		Node temp2 = list;
		int sum = 0;
		while (temp2 != null) {
			sum += temp2.data;
			temp2 = temp2.rlink;
		}

		// 리스트를 왕복 출력
		System.out.println("합 = " + sum );
		System.out.print("전체 원소 합 계산 후: ");
		printList(list);
	}

	// list가 가리키는 이중 연결 리스트를 왕복하며 원소들을 순방향, 역방향 출력하는 메소드
	private static void printList(Node list) {
		if(list == null) {
			System.out.println("( ) ( )");
		}
		
		else {
			System.out.print("( ");
			Node temp = list;
			while(temp.rlink != null) {
				System.out.print(temp.data + " ");
				temp = temp.rlink;
			}
			System.out.print(temp.data + " ) ( ");
			while(temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.llink;
			}
		}
		System.out.println(")");
	}
}

//***************************
// ���ϸ�: hw6_1.java
// �ۼ���: ����ȣ
// �ۼ���: 2018.10.04
// ����: �ܼ� ���Ḯ��Ʈ ������ �����Ѵ�.
//***************************
package hw6_1;

import java.util.Scanner;

public class MyLinkedListTest {

	public static void main(String [] args) {
		System.out.println("hw6_1 : ����ȣ \n");
		Scanner input = new Scanner(System.in);

		MyLinkedList list = new MyLinkedList();

		int menu = 0;
		int index = 0;
		int element = 0;

		do {
			System.out.println("1:��ü��ȸ 2:������ȸ 3:�Ǿջ��� 4:�ǵڻ��� 5:�Ǿջ��� 6:�ǵڻ��� 7:����");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println("����Ʈ ��ü ��ȸ�� �մϴ�.");
				System.out.println(list.toString()    );				index = input.nextInt();

				break;
			case 2:
				System.out.println("����Ʈ ���̸� ��ȸ�մϴ�.");
				int size = list.size(); 
				System.out.println(size);
				break;
			case 3:
				System.out.println("���Ҹ� ����Ʈ�� �� �տ� �����մϴ�.");
				System.out.print("������ �Է�: ");
				element = input.nextInt();    
				list.addFirst(element)                               ;  // �ϼ��ϼ���.
				break;
			case 4:
				System.out.println("���Ҹ� ����Ʈ�� �� �ڿ� �����մϴ�.");
				System.out.print("������ �Է�: ");
				element = input.nextInt();    
				list.addLast(element)                               ;  // �ϼ��ϼ���.
				break;
			case 5:
				System.out.println("����Ʈ �� ���� ������ �����մϴ�.");


				element = list.removeFirst()    ;  // �ϼ��ϼ���.
				System.out.print("���� �� ����: " + element );
				System.out.println();
				index = input.nextInt();

				System.out.println();
				break;
			case 6:
				System.out.println("����Ʈ �� ���� ������ �����մϴ�.");


				element = list.removeLast()    ;  // �ϼ��ϼ���.
				System.out.print("���� �� ����: " + element );
				System.out.println();
				index = input.nextInt();
				System.out.println();

				break;
			case 7:
				System.out.println("�����մϴ�.");   
				break;
			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");
			}
		} while(menu != 7);
	}
}
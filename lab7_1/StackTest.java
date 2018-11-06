//***************************
// ���ϸ�: lab7_1.java
// �ۼ���: ����ȣ
// �ۼ���: 2018.10.11
// ����: Stack Ŭ������ �����Ѵ�.
//***************************
package lab7_1;

import java.util.Scanner;
import java.util.Stack;


public class StackTest {
	public static void main (String[] args) {
		System.out.println("lab7_1: ����ȣ \n");
		Scanner input = new Scanner(System.in);

		Stack<Integer> stack = new Stack<Integer>();

		int menu = 0;
		int number = 0;
		int element = 0;

		do {
			System.out.println("1:���� 2:���� 3:��ȸ 4:�հ� 5:����");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println("���ÿ� �����մϴ�.");
				System.out.print("������ �Է�: ");
				element = input.nextInt();    
				number = stack.push(element);
				break;

			case 2:
				System.out.println("���ÿ��� �����մϴ�.");
				System.out.println(stack.pop()); 
				break;

			case 3:
				System.out.println("������ ��ȸ �մϴ�.");
				System.out.println(stack.peek());                         ; 
				break;

			case 4:
				System.out.println("������ �� �� ������ ��� �����Ͽ� �հ踦 ����մϴ�.");
				int sum = 0;
				while(!stack.empty()) 
					sum += stack.pop();
				System.out.println(sum);

			case 5:
				System.out.println("�����մϴ�.");   
				break;

			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");
			}
		} while(menu != 5);


	}
}

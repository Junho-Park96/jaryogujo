package hw7_2;

import java.util.EmptyStackException;

//***************************
//���ϸ�: hw7_2.java
//�ۼ���: ����ȣ
//�ۼ���: 2018.10.26
//����: ������ ���� �ڷᱸ���� �����Ѵ�.
//***************************


import java.util.Scanner;
import java.util.Stack;
import java.util.Scanner;

public class MyLinkedStackTest {


	public static void main (String[] args) {
		System.out.println("hw7_2: ����ȣ \n");
		Scanner input = new Scanner(System.in);

		MyLinkedStack stack = new MyLinkedStack();

		int menu;
		int number;
		int sum = 0;

		do {
			System.out.println("1:���� 2:���� 3:��ȸ 4:�հ� 5:����");
			menu = input.nextInt();
			try {


				switch(menu) {
				case 1:
					System.out.println("���ÿ� �����մϴ�.");
					System.out.print("������ �Է�: ");
					number = input.nextInt();    
					stack.push(number);
					break;

				case 2:
					System.out.println("���ÿ��� �����մϴ�.");
					System.out.println(stack.pop()); 
					break;

				case 3:
					System.out.println("������ ��ȸ �մϴ�.");
					System.out.println(stack.peek());                        
					break;

				case 4:
					System.out.println("������ �� �� ������ ��� �����Ͽ� �հ踦 ����մϴ�.");
					if (!stack.isEmpty()) {
						while(!stack.isEmpty()) {
							sum += stack.pop();
						}
					}
					System.out.println(sum);
					break;


				case 5:
					System.out.println("�����մϴ�.");   
					break;

				default:
					System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");

				}
			} catch (EmptyStackException e) {
				System.out.println("������ ����ִ� �����Դϴ�.");
			}
		} while(menu != 5);


	}
}
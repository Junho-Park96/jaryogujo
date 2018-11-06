package hw8_1;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/*
/*
 * ���ϸ� : MyCircularQueueTest.java
 * �ۼ���: 2018�� 11�� 1��
 * �ۼ���: ����ȣ
 * ����: �迭�� �̿��� ���� ť ������ �����Ѵ�.
 */

public class MyCircularQueueTest {
	public static void main(String[] args) {
		System.out.println("hw8_1: ����ȣ");
		Scanner input = new Scanner(System.in);
		// ũ�� 5�� ���� ť�� ����
		MyCircularQueue queue = new  MyCircularQueue(5);

		int menu;
		int number;
		int sum = 0;

		do {
			System.out.println("1:���� 2:���� 3:��ȸ 4:ũ�� 5:��ü���� 6:����");
			menu = input.nextInt();
			try {

				switch(menu) {
				case 1:
					System.out.println("ť�� �����մϴ�.");
					System.out.print("������ �Է�: ");
					number = input.nextInt();    
					queue.enQueue(number);
					break;

				case 2:
					System.out.println("ť���� �����մϴ�.");
					System.out.println(queue.deQueue()); 
					break;

				case 3:
					System.out.println("ť�� ��ȸ �մϴ�.");
					System.out.println(queue.peek());                        
					break;

				case 4:
					System.out.println("ť�� ���� �� ���� ���� ��ȸ�մϴ�.");
					System.out.println(queue.arraySize());
					break;

				case 5:
					System.out.println("ť�� �� �� ������ ��� �����Ͽ� ���Ҹ� ����մϴ�.");
					if (!queue.isEmpty()) {
						while(!queue.isEmpty()) {
							System.out.println(queue.deQueue());
						}
					}
					else
					{
						System.out.println("ť�� �������");
					}

					break;

				case 6:
					System.out.println("�����մϴ�.");   
					break;

				default:
					System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");


				}
			}catch (NoSuchElementException e) {
				//TODO: handle exception
				System.out.println("ť�� �������");
			} 
		} while(menu != 6);


	}

}
/*
 * ���ϸ� : MyLinkedQueueTest.java
 * �ۼ���: 2018�� 11�� 6��
 * �ۼ���: ����ȣ
 * ����: �����ڷᱸ���� �̿��� ť ������ �����Ѵ�.
 */

package hw8_2;

import java.util.Scanner;
import java.util.NoSuchElementException;

public class MyLinkedQueueTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      System.out.println("hw8_2:����ȣ \n");
      
      Scanner scan = new Scanner(System.in);
      
      int menu;
      int number;
      int sum = 0;
      
      MyLinkedQueue queue = new MyLinkedQueue();
      do {
         System.out.println("1:���� 2:���� 3:��ȸ 4:ũ�� 5:��ü���� 6:����");
         menu = scan.nextInt();
         try {
            switch (menu) {
            case 1:
               System.out.println("�������� ť�� �� �ڿ� �����մϴ�.");
               System.out.println("������ �Է�: ");
               number = scan.nextInt();
               queue.enQueue(number);
               break;

            case 2:
               System.out.println("ť�� �� �� �������� �����մϴ�.");
               System.out.println(queue.deQueue());
               break;

            case 3:
               System.out.println("ť�� ��ȸ �մϴ�.");
               System.out.println(queue.peek());
               break;

            case 4:
               System.out.println("ť�� ũ��: ");
               System.out.println(queue.arraySize());
               break;
               
            case 5:
               if (!queue.isEmpty()) {
                  while (!queue.isEmpty()) {
                     System.out.println(queue.deQueue());
                  }
               }else {
                  System.out.println("ť�� ����ֽ��ϴ�!");
               }
               break;

            case 6:
               System.out.println("�����մϴ�.");
               break;

            default:
               System.out.println("�޴� ���� ����: �ٽ� �����Ͻÿ�.");

            }
         } catch (NoSuchElementException e) {
            // TODO: handle exception
            System.out.println("ť�� ����ֽ��ϴ�!");
         }
      } while (menu != 6);
   }

}
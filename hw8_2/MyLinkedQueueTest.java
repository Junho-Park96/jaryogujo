/*
 * 파일명 : MyLinkedQueueTest.java
 * 작성일: 2018년 11월 6일
 * 작성자: 박준호
 * 내용: 연결자료구조를 이용한 큐 구현을 연습한다.
 */

package hw8_2;

import java.util.Scanner;
import java.util.NoSuchElementException;

public class MyLinkedQueueTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      System.out.println("hw8_2:박준호 \n");
      
      Scanner scan = new Scanner(System.in);
      
      int menu;
      int number;
      int sum = 0;
      
      MyLinkedQueue queue = new MyLinkedQueue();
      do {
         System.out.println("1:삽입 2:삭제 3:조회 4:크기 5:전체삭제 6:종료");
         menu = scan.nextInt();
         try {
            switch (menu) {
            case 1:
               System.out.println("정수값을 큐의 맨 뒤에 삽입합니다.");
               System.out.println("정수값 입력: ");
               number = scan.nextInt();
               queue.enQueue(number);
               break;

            case 2:
               System.out.println("큐의 맨 앞 정수값을 삭제합니다.");
               System.out.println(queue.deQueue());
               break;

            case 3:
               System.out.println("큐를 조회 합니다.");
               System.out.println(queue.peek());
               break;

            case 4:
               System.out.println("큐의 크기: ");
               System.out.println(queue.arraySize());
               break;
               
            case 5:
               if (!queue.isEmpty()) {
                  while (!queue.isEmpty()) {
                     System.out.println(queue.deQueue());
                  }
               }else {
                  System.out.println("큐가 비어있습니다!");
               }
               break;

            case 6:
               System.out.println("종료합니다.");
               break;

            default:
               System.out.println("메뉴 선택 오류: 다시 선택하시오.");

            }
         } catch (NoSuchElementException e) {
            // TODO: handle exception
            System.out.println("큐가 비어있습니다!");
         }
      } while (menu != 6);
   }

}
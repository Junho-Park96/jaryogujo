package hw8_1;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/*
/*
 * 파일명 : MyCircularQueueTest.java
 * 작성일: 2018년 11월 1일
 * 작성자: 박준호
 * 내용: 배열을 이용한 원형 큐 구현을 연습한다.
 */

public class MyCircularQueueTest {
	public static void main(String[] args) {
		System.out.println("hw8_1: 박준호");
		Scanner input = new Scanner(System.in);
		// 크기 5인 원형 큐를 생성
		MyCircularQueue queue = new  MyCircularQueue(5);

		int menu;
		int number;
		int sum = 0;

		do {
			System.out.println("1:삽입 2:삭제 3:조회 4:크기 5:전체삭제 6:종료");
			menu = input.nextInt();
			try {

				switch(menu) {
				case 1:
					System.out.println("큐에 삽입합니다.");
					System.out.print("정수값 입력: ");
					number = input.nextInt();    
					queue.enQueue(number);
					break;

				case 2:
					System.out.println("큐에서 삭제합니다.");
					System.out.println(queue.deQueue()); 
					break;

				case 3:
					System.out.println("큐를 조회 합니다.");
					System.out.println(queue.peek());                        
					break;

				case 4:
					System.out.println("큐에 저장 된 원소 수를 조회합니다.");
					System.out.println(queue.arraySize());
					break;

				case 5:
					System.out.println("큐가 텅 빌 때까지 모두 삭제하여 원소를 출력합니다.");
					if (!queue.isEmpty()) {
						while(!queue.isEmpty()) {
							System.out.println(queue.deQueue());
						}
					}
					else
					{
						System.out.println("큐가 비어있음");
					}

					break;

				case 6:
					System.out.println("종료합니다.");   
					break;

				default:
					System.out.println("메뉴 선택 오류: 다시 선택하세요.");


				}
			}catch (NoSuchElementException e) {
				//TODO: handle exception
				System.out.println("큐가 비어있음");
			} 
		} while(menu != 6);


	}

}
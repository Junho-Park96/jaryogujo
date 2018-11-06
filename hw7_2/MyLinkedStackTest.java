package hw7_2;

import java.util.EmptyStackException;

//***************************
//파일명: hw7_2.java
//작성자: 박준호
//작성일: 2018.10.26
//설명: 스택을 연결 자료구조로 구현한다.
//***************************


import java.util.Scanner;
import java.util.Stack;
import java.util.Scanner;

public class MyLinkedStackTest {


	public static void main (String[] args) {
		System.out.println("hw7_2: 박준호 \n");
		Scanner input = new Scanner(System.in);

		MyLinkedStack stack = new MyLinkedStack();

		int menu;
		int number;
		int sum = 0;

		do {
			System.out.println("1:삽입 2:삭제 3:조회 4:합계 5:종료");
			menu = input.nextInt();
			try {


				switch(menu) {
				case 1:
					System.out.println("스택에 삽입합니다.");
					System.out.print("정수값 입력: ");
					number = input.nextInt();    
					stack.push(number);
					break;

				case 2:
					System.out.println("스택에서 삭제합니다.");
					System.out.println(stack.pop()); 
					break;

				case 3:
					System.out.println("스택을 조회 합니다.");
					System.out.println(stack.peek());                        
					break;

				case 4:
					System.out.println("스택이 텅 빌 때까지 모두 삭제하여 합계를 출력합니다.");
					if (!stack.isEmpty()) {
						while(!stack.isEmpty()) {
							sum += stack.pop();
						}
					}
					System.out.println(sum);
					break;


				case 5:
					System.out.println("종료합니다.");   
					break;

				default:
					System.out.println("메뉴 선택 오류: 다시 선택하세요.");

				}
			} catch (EmptyStackException e) {
				System.out.println("스택이 비어있는 상태입니다.");
			}
		} while(menu != 5);


	}
}
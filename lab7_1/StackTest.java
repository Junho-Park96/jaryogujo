//***************************
// 파일명: lab7_1.java
// 작성자: 박준호
// 작성일: 2018.10.11
// 설명: Stack 클래스를 이해한다.
//***************************
package lab7_1;

import java.util.Scanner;
import java.util.Stack;


public class StackTest {
	public static void main (String[] args) {
		System.out.println("lab7_1: 박준호 \n");
		Scanner input = new Scanner(System.in);

		Stack<Integer> stack = new Stack<Integer>();

		int menu = 0;
		int number = 0;
		int element = 0;

		do {
			System.out.println("1:삽입 2:삭제 3:조회 4:합계 5:종료");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println("스택에 삽입합니다.");
				System.out.print("정수값 입력: ");
				element = input.nextInt();    
				number = stack.push(element);
				break;

			case 2:
				System.out.println("스택에서 삭제합니다.");
				System.out.println(stack.pop()); 
				break;

			case 3:
				System.out.println("스택을 조회 합니다.");
				System.out.println(stack.peek());                         ; 
				break;

			case 4:
				System.out.println("스택이 텅 빌 때까지 모두 삭제하여 합계를 출력합니다.");
				int sum = 0;
				while(!stack.empty()) 
					sum += stack.pop();
				System.out.println(sum);

			case 5:
				System.out.println("종료합니다.");   
				break;

			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		} while(menu != 5);


	}
}

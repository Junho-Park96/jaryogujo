package hw7_3;

import java.util.EmptyStackException;
import java.util.Scanner;

public class MyCharacterStackTest {

	public static void main(String[] args) {
		System.out.println("hw 7_3: 박준호 \n");
		Scanner scan = new Scanner(System.in);
		MyCharacterStack stack = new MyCharacterStack();
		System.out.println("수식 입력: ");
		String str = scan.nextLine();

		try {
			for(int i = 0; i < str.length(); i++ ) {
				if (str.charAt(i) == '(' || str.charAt(i) == '<') {

					stack.push(str.charAt(i));

				} 
				else if ((str.charAt(i) == ')'&&stack.peek()=='(') ||
						(str.charAt(i) == '>'&&stack.peek()=='<')) {
					stack.pop();
				}
			}
			if (stack.isEmpty()) {
				System.out.println("올바른 괄호 수식입니다.");

			} else {
				System.out.println("잘못된 괄호 수식입니다.");

			}

		} catch (EmptyStackException e) {
			// TODO: handle exception
			System.out.println("잘못된 괄호 수식입니다.");

		}
		scan.close();
	}
}

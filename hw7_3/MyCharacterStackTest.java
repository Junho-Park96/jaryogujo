package hw7_3;

import java.util.EmptyStackException;
import java.util.Scanner;

public class MyCharacterStackTest {

	public static void main(String[] args) {
		System.out.println("hw 7_3: ����ȣ \n");
		Scanner scan = new Scanner(System.in);
		MyCharacterStack stack = new MyCharacterStack();
		System.out.println("���� �Է�: ");
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
				System.out.println("�ùٸ� ��ȣ �����Դϴ�.");

			} else {
				System.out.println("�߸��� ��ȣ �����Դϴ�.");

			}

		} catch (EmptyStackException e) {
			// TODO: handle exception
			System.out.println("�߸��� ��ȣ �����Դϴ�.");

		}
		scan.close();
	}
}

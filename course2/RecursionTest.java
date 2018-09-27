package course2;

import java.util.Scanner;
public class RecursionTest {
	public static void main(String[] args) {
		System.out.println("course2 : ����ȣ \n");

		Scanner input = new Scanner(System.in);
		System.out.print("���� ���� �Է�: \n");
		int number = input.nextInt();

		System.out.println("1���� 4������ ��(�ݺ�) = " + iterativeSum(number));

		System.out.println("1���� 4������ ��(���) = " + sum(number));

		System.out.println("1���� 4������ ��(�ݺ�) = " + iterativeFactorial(number));

		System.out.println("1���� 4������ ��(���) = " + factorial(number));

		
		f(number);
		System.out.println();

		g(number);
		System.out.println();
	}

	// (1) �ݺ� �˰����� �̿��Ͽ� 1���� n������ ���� ���ϴ� �޼ҵ�
	private static int iterativeSum(int n) {
		int iterativeSum = 0;
		for (int i = 0; i <= n; i++) {
			 iterativeSum += i ;
		}
		return iterativeSum;
	}

	// ��� �˰����� �̿��Ͽ� 1���� n������ ���� ���ϴ� �޼ҵ�
	private static int sum(int n) {
		if(n <= 0)
			return 0;
		else
			return n + sum(n-1);
	} 
	// �ݺ� �˰����� �̿��Ͽ� 1���� n������ ���� ���ϴ� �޼ҵ�
	private static int iterativeFactorial(int n) {
		int result = 1;
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	// (2) ��� �˰����� �̿��Ͽ� 1���� n������ ���� ���ϴ� �޼ҵ�
	private static int factorial(int n) {

		if(n <= 0)
			return 1 ;
			
		else
			return n * factorial (n-1);
	}

	// ��� �˰����� �̿��Ͽ� n ���� 1���� ����ϴ� �޼ҵ�
	private static void f(int n) {
		if(n > 0) {
			System.out.print(n + " ");
			f(n-1);
		}
	}

	// (3) ��� �˰����� �̿��Ͽ� 1 ���� n���� ����ϴ� �޼ҵ�
	private static void g(int n) {
		if(0 < n) {
			g(n-1);
			System.out.print(n + " ");

		}
	}

}
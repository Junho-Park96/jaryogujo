//***************************
 // ���ϸ�: RandomNumber.java
 // �ۼ���: ����ȣ
 // �ۼ���: 18.09.04
 // ����: ���� �ѹ� ������ �ݺ����� �����Ѵ�.
 //***************************
package lab1_3;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {

		System.out.println("lab1_3: ����ȣ");

		int a=0;
		int b=0;
		int c=0;
		int d=0;

		System.out.print("\n���� �ѹ� = ");
		for (int i = 0; i < 10; i++) {
			Random generator = new Random();
			int number = generator.nextInt(4)+1;
			System.out.print(number + " " );

			if (number == 1) {
				a++;
			}
			else if (number == 2) {
				b++;
			}
			else if (number == 3) {
				c++;
			}
			else {
				d++;
			}

		}
		System.out.println("\n1�� ����= " + a );
		System.out.println("2�� ����= " + b );
		System.out.println("3�� ����= " + c );
		System.out.println("4�� ����= " + d );
	}
}


/*
1~4 ������ ���� �ѹ� 10���� �����Ͽ� �� �ѹ��� ��� �����Ǿ��°��� ���� ���α׷��� �ۼ��Ͻÿ�.

- �Է�: ����
- ���: 10���� ���� �ѹ�, �� �ѹ��� ����

- ���� ��
lab1_3: ȫ�浿

���� �ѹ� = 4 1 2 3 1 2 3 3 4 2
 1�� ���� = 2
 2�� ���� = 3
 3�� ���� = 3
 4�� ���� = 2

 */
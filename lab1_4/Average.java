//***************************
 // ���ϸ�: Average.java
 // �ۼ���: ����ȣ
 // �ۼ���: 18.09.04
 // ����: �޼ҵ� �ۼ��� ȣ���� �����Ѵ�.
 //***************************
package lab1_4;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		
		System.out.println("lab1_4:����ȣ\n");
		
		Scanner scan = new Scanner(System.in);
		
	
		System.out.print("���� ���� �Է�: ");
		int num = scan.nextInt();
		
		
		System.out.print(num + "���� ���� �Է�: ");
		int[] arr = new int[num];
		
		for (int i = 0; i < arr.length; i++) {
			int num2 = scan.nextInt();
			arr[i] = num2;
		}
		System.out.println("���= " + getAverage(arr));
	}

	static double getAverage(int[] arr) {
		
		double sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += (double) arr[i];
		}

		return sum / arr.length;
	}

}

package lab1_2;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		System.out.println("lab1_2:����ȣ");
		Scanner input = new Scanner(System.in);

		int[] array = new int [10];
		System.out.println("������ 10�� �Է�: ");
		for (int i = 0; i < array.length; i++) {
			array[i]=input.nextInt();
		}

		System.out.println("�˻��� ������ �Է�:");
		int num = input.nextInt();

		System.out.println(find(array,num));

	}
	public static int find(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if(array[i]==num) {
				return i;
			}
		}
		return -1;
	}
}


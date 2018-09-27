//***************************
 // 파일명: Average.java
 // 작성자: 박준호
 // 작성일: 18.09.04
 // 설명: 메소드 작성과 호출을 연습한다.
 //***************************
package lab1_4;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		
		System.out.println("lab1_4:박준호\n");
		
		Scanner scan = new Scanner(System.in);
		
	
		System.out.print("정수 개수 입력: ");
		int num = scan.nextInt();
		
		
		System.out.print(num + "개의 정수 입력: ");
		int[] arr = new int[num];
		
		for (int i = 0; i < arr.length; i++) {
			int num2 = scan.nextInt();
			arr[i] = num2;
		}
		System.out.println("평균= " + getAverage(arr));
	}

	static double getAverage(int[] arr) {
		
		double sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += (double) arr[i];
		}

		return sum / arr.length;
	}

}

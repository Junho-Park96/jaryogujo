
//***************************
//파일명: hw5_2.java
//작성자: 박준호
//작성일: 2018.09.18
//설명: 순차 자료구조 사용을 익힌다.
//***************************

package hw5_2;

public class MyMatrixService {
	public static int[][] multiply(int[][] x, int[][] y) {
		
		int[][] z = new int[x.length][y[0].length];
		
		for (int i = 0; i < x.length; i++) {
			
			for (int j = 0; j < y[0].length; j++) {
				
				for (int k = 0; k < y.length; k++) {
					
					z[i][j] += x[i][k] * y[k][j];
					
				}
			}
		}

		return z;
	}

	// (1) 정적 메소드 multiply를 작성하시오.
	// 이차원 정수 배열로 표현된 두개의 행렬을 매개변수로 받아 곱을 구해 결과를 이차원 정수 배열로 표현하여 리턴
	// 매개변수로 받은 두 행렬은 곱을 구하기에 타당한 크기라고 가정해도 됨
	public static void print(int[][] z) {
		
		for (int i = 0; i < z.length; i++) {
			
			for (int j = 0; j < z[0].length; j++) {
				
				System.out.print(z[i][j] + " ");
				
			}
			
			System.out.println();
		}
	}
	// (2) 정적 메소드 print를 작성하시오.
	// 이차원 정수 배열로 표현된 하나의 행렬을 매개변수로 받아 한 줄에 한 행씩 출력

}
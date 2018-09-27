//***************************
 // 파일명: RandomNumber.java
 // 작성자: 박준호
 // 작성일: 18.09.04
 // 설명: 랜덤 넘버 생성과 반복문을 연습한다.
 //***************************
package lab1_3;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {

		System.out.println("lab1_3: 박준호");

		int a=0;
		int b=0;
		int c=0;
		int d=0;

		System.out.print("\n랜덤 넘버 = ");
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
		System.out.println("\n1의 갯수= " + a );
		System.out.println("2의 갯수= " + b );
		System.out.println("3의 갯수= " + c );
		System.out.println("4의 갯수= " + d );
	}
}


/*
1~4 범위의 랜덤 넘버 10개를 생성하여 각 넘버가 몇개씩 생성되었는가를 세는 프로그램을 작성하시오.

- 입력: 없음
- 출력: 10개의 랜덤 넘버, 각 넘버의 갯수

- 실행 예
lab1_3: 홍길동

랜덤 넘버 = 4 1 2 3 1 2 3 3 4 2
 1의 갯수 = 2
 2의 갯수 = 3
 3의 갯수 = 3
 4의 갯수 = 2

 */
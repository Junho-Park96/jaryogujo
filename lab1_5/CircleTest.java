//***************************
// 파일명: lab1_5.java
// 작성자: 박준호
// 작성일: 2018.09.06
// 설명:반지름 속성을 갖는 Circle 클래스를 작성하고 사용하는 프로그램을 다음과 같이 작성
//***************************
package lab1_5;

public class CircleTest {
	public static void main(String[] args) {
		System.out.println("lab1_5 : 박준호 \n");
		
		Circle circle = new Circle(2);
		
		Circle circle2 = new Circle((int)(Math.random()*4)+1);
		
		System.out.println(circle.toString());
		
		System.out.println(circle2.toString());
	
		System.out.println(circle.equals(circle2));
	
		System.out.println(circle.hashCode());
		
		System.out.println(circle2.hashCode());
		
		System.out.println(circle.extent());
		
		System.out.println(circle2.extent());		
	}
}
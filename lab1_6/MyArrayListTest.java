//***************************
// 파일명: lab1_6.java
// 작성자: 박준호
// 작성일: 2018.09.06
// 설명:클래스 작성, 객체 생성과 사용을 연습한다.
//***************************

package lab1_6;

public class MyArrayListTest {
	
	public static void main (String[] args) {
		System.out.println("lab1_6 : 박준호\n");
	
		MyArrayList list = new MyArrayList();
		
		System.out.println("list = " + list.toString());
		
		list.add(2);
		list.add(-3);
		list.add(0);
		
		System.out.println("list = " + list.toString());

	}

}

//***************************
// ���ϸ�: lab1_5.java
// �ۼ���: ����ȣ
// �ۼ���: 2018.09.06
// ����:������ �Ӽ��� ���� Circle Ŭ������ �ۼ��ϰ� ����ϴ� ���α׷��� ������ ���� �ۼ�
//***************************
package lab1_5;

public class CircleTest {
	public static void main(String[] args) {
		System.out.println("lab1_5 : ����ȣ \n");
		
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
//***************************
// ���ϸ�: lab1_6.java
// �ۼ���: ����ȣ
// �ۼ���: 2018.09.06
// ����:Ŭ���� �ۼ�, ��ü ������ ����� �����Ѵ�.
//***************************

package lab1_6;

public class MyArrayListTest {
	
	public static void main (String[] args) {
		System.out.println("lab1_6 : ����ȣ\n");
	
		MyArrayList list = new MyArrayList();
		
		System.out.println("list = " + list.toString());
		
		list.add(2);
		list.add(-3);
		list.add(0);
		
		System.out.println("list = " + list.toString());

	}

}

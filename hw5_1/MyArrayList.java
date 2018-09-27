//***************************
// 파일명: hw5_1.java
// 작성자: 박준호
// 작성일: 2018.09.13
// 설명: 순차자료구조 연산 구현을 연습한다.
//***************************
package hw5_1;

public class MyArrayList {

	private int[] array;
	private int number;
	private int arraySize = 10;

	public MyArrayList() {
		array = new int[arraySize];
		number = 0;

	}

	public boolean add (int i) {
		if (number<arraySize) {
			this.array[number] = i;
			number++;
			return true;
		}
		else
		{
			return false;
		}
	}


	@Override
	public String toString() {
		String s1 = new String();
		for (int i=0; i < number; i++) {
			s1 += array[i] + " ";
		}
		return s1;
	}

	public int get(int index) {
		if(index >= 0&& index < number) {
			int i=array[index];
			return i;
		}
		else {
			return 0;
		}
	}

	public int size() {

		return number;
	}

	public int remove(int index) {
		int point = array[index];
		if(index < number) {
			for(int j = index; j < number; j++) {
				array[j] = array[j+1];
			}
			number--;
		}
		else if(index == number) {
			--number;
		}
		else {
			System.out.println("다시 인덱스 번호를 입력 : ");
		}
		return point;
	}

}




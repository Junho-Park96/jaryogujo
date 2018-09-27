package lab1_6;

import java.util.Arrays;

public class MyArrayList {

	private int[] array;
	private int number;

	public MyArrayList() {
		array = new int[10];
		number = 0;

	}

	public boolean add (int i) {
		if (number<10) {
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
		String s1 = " ";
		for (int i=0; i < number; i++) {
			s1 += array[i] + " ";
		}
		return s1;
	}

}


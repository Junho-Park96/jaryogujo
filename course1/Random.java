
package course1;

public class Random {

	public static void main(String[] args) {

		System.out.println("course1: ����ȣ\n");

		int array[] = new int[10];

		int min = 101;
		int minIndex = 0; 
		
		int total = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			int j = (int) (Math.random() * 101);
			if ((0 <= j) && (j <= 100)) {
				array[i] = j;
				System.out.print(array[i] + " ");
			}
			
			if(array[i] < min)
				min = array[i]; 
		}
		for (int j = 0; j < array.length; j++) {
			
			if (array[j] == min) {
				total = j;
				
				break;
			}

		}
		
		System.out.println("\n�ּҰ�: " + min);
		System.out.println("�ּҰ� �ε���: " + total);

	}

}


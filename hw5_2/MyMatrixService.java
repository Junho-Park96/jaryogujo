
//***************************
//���ϸ�: hw5_2.java
//�ۼ���: ����ȣ
//�ۼ���: 2018.09.18
//����: ���� �ڷᱸ�� ����� ������.
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

	// (1) ���� �޼ҵ� multiply�� �ۼ��Ͻÿ�.
	// ������ ���� �迭�� ǥ���� �ΰ��� ����� �Ű������� �޾� ���� ���� ����� ������ ���� �迭�� ǥ���Ͽ� ����
	// �Ű������� ���� �� ����� ���� ���ϱ⿡ Ÿ���� ũ���� �����ص� ��
	public static void print(int[][] z) {
		
		for (int i = 0; i < z.length; i++) {
			
			for (int j = 0; j < z[0].length; j++) {
				
				System.out.print(z[i][j] + " ");
				
			}
			
			System.out.println();
		}
	}
	// (2) ���� �޼ҵ� print�� �ۼ��Ͻÿ�.
	// ������ ���� �迭�� ǥ���� �ϳ��� ����� �Ű������� �޾� �� �ٿ� �� �྿ ���

}
package ch23_2�����迭;

public class TwoArrayList {

	public static void main(String[] args) {

		
		
		int[][] arr= {{1,2,3}, {1,2,3,4}};
		
		
		int i,j;
							//length�� ���Ǳ��̸� ��Ÿ��.
		for(i=0; i<arr.length; i++) {   //�ٱ��� ��
			for(j=0; j<arr[i].length; j++) {//i���� ����ü ��� (ù��°��),(�ι�°��)
			System.out.print(arr[i][j]+ ",");	
			}
			//������ ������ i���� ���
			
			
			System.out.println("\t"+arr[i].length);
			
		}
	}

}

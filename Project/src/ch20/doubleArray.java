package ch20;

public class doubleArray {

	public static void main(String[] args) {

		
		
		double[] dArr=new double[5];
		int count=0;
		dArr[0]=1.1;	count++;    //요소의 개수에대한 변수를 따로유지
		dArr[1]=2.1;	count++;	 //요소의 개수에대한 변수를 따로유지
		dArr[2]=3.1; count++;	 //요소의 개수에대한 변수를 따로유지
		
		double mtotal=1;
		
		for(int i=0; i<count; i++) {
			mtotal*=dArr[i];
		}
		
		
		System.out.println(mtotal);
	}

}

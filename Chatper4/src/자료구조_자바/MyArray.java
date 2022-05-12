package 자료구조_자바;

public class MyArray {

	int[] intArr;	  //int Array
	int count;		//개수
	
	public int ARRAY_SIZE;
	public static final int ERROR_NUM=-99999999;
	
	
	public MyArray(int size) {
		count=0;
		ARRAY_SIZE=10;
		intArr=new int[ARRAY_SIZE];
		
	}
	
	public MyArray() {
	}

	public void addElement(int num)
	{
		if(count>=ARRAY_SIZE) {
			System.out.println("not enough memory");
			return;
		}
		intArr[count++]=num;
	}
	
	public void insertElement(int position,int num)
	{
		
		int i;
		if(position<0 || position>count) {
			
			return;
		}
		
		if(count>=ARRAY_SIZE) {
			return;
		}
		
		for(i=count-1; i>=position; i++) {
			intArr[i+1]=intArr[i];
		}
		
		intArr[position]=num;
		count++;
		
	}
	
	public  int removeElement(int position) {
	
		
		int ret=ERROR_NUM;
		
		if(isEmpty()) {
			System.out.println("출력할 내용이 없습니다.");
			return ret;
			
		}
		
		if(position<0 || position>count-1) {
			return ret;
		}
		
		ret=intArr[position];
		
		for(int i=position; i<count-1; i++) {
			intArr[i]=intArr[i+1];
		}
		count--;
		
		return ret;
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
			
		for(int i=0; i<count; i++){
			System.out.println(intArr[i]);
		}
		
	}
	


	
}

package 자료구조_자바_ch04;

import 자료구조_자바.MyArray;
public class myArrayStack {
	
	
	MyArray arrayStack;
	int top;
	
	
	public myArrayStack() {
		top=0;
		arrayStack=new MyArray();
	}
	
	
	public myArrayStack(int size) {
		top=0;
		arrayStack=new MyArray(size);
	}
	
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("stack is full");
			return;
		}
		arrayStack.addElement(data);
		top++;
		
	}
	
	public int pop() {
		if(isEmpty()) {
			
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
			
		}
		
		return arrayStack.removeElement(--top);
	}
	
	public boolean isFull() {
		
		if(top==arrayStack.ARRAY_SIZE) {
			return true;
		}
		else return false;
	
	}
	
	public boolean isEmpty() {	
		
		if(top==0) {
			System.out.println("stack is empty");
			return true;
		}
		else return false;
	}
	
	public void printAll()
	{
		arrayStack.printAll();
	}
	
	

	

}

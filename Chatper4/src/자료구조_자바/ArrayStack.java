package 자료구조_자바;

import java.util.Stack;

public class ArrayStack   {

	  
	int top;
	int size;
	int []Stack;
	
	public ArrayStack(int size) {
		this.size=size;
		top=-1;
		Stack=new int[size];
	}
	
	public void push(int num) {
		Stack[++top]=num;
		System.out.println("Push body"+Stack[top]);
	}
	
	
	public void pop(int num) {
		
		 num=Stack[top];
		 Stack[top--]=0;
		
		
		
		
	}
	
	

	public static void main(String[] args) {
			
	
		
		
		
	
	}

	

}

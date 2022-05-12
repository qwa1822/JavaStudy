package 자료구조_자바_ch04;

public class myArrayStackTest {

	public static void main(String[] args) {

		myArrayStack stack=new myArrayStack(3);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		
		stack.printAll();
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("=====================");
		stack.printAll();
		
		
	
	}

}

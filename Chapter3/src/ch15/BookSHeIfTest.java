package ch15;

public class BookSHeIfTest {

	public static void main(String[] args) {

		
		Queue bookQueue=new BooksheIf();
		bookQueue.enQueue("����1");
		bookQueue.enQueue("����2");
		bookQueue.enQueue("����3");
		bookQueue.enQueue("����4");
		bookQueue.enQueue("����5");
		
		
		System.out.println(bookQueue.getSize());
		System.out.println(bookQueue.deQue());
		System.out.println(bookQueue.deQue());
		System.out.println(bookQueue.deQue());
		System.out.println(bookQueue.deQue());
		System.out.println(bookQueue.deQue());
		
	}

}

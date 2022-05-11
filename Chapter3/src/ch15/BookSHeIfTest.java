package ch15;

public class BookSHeIfTest {

	public static void main(String[] args) {

		
		Queue bookQueue=new BooksheIf();
		bookQueue.enQueue("토지1");
		bookQueue.enQueue("토지2");
		bookQueue.enQueue("토지3");
		bookQueue.enQueue("토지4");
		bookQueue.enQueue("토지5");
		
		
		System.out.println(bookQueue.getSize());
		System.out.println(bookQueue.deQue());
		System.out.println(bookQueue.deQue());
		System.out.println(bookQueue.deQue());
		System.out.println(bookQueue.deQue());
		System.out.println(bookQueue.deQue());
		
	}

}

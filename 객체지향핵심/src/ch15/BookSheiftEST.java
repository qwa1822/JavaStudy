package ch15;

public class BookSheiftEST {
	
	
	public static void main(String[] args) {

	
	Queue bookQueue=new BookSheIf();
	bookQueue.enQueue("����1");
	bookQueue.enQueue("����2");
	bookQueue.enQueue("����3");
	bookQueue.enQueue("����4");
	bookQueue.enQueue("����5");
	
	
	System.out.println(bookQueue.getSize());
	System.out.println(bookQueue.deQueue());
	System.out.println(bookQueue.deQueue());
	System.out.println(bookQueue.deQueue());
	System.out.println(bookQueue.deQueue());
	System.out.println(bookQueue.deQueue());
	
	}
}

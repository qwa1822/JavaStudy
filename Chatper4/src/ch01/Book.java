package ch01;

public class Book {
	
	private String title;
	private String author;
	
	
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
	}
	
	
	
	
	@Override
	public String toString() {
		return title+","+author;
	}




	public static void main(String[] args) {
		
		
		Book book=new Book("���̾�", "�츣�� �켼");
		
		
		System.out.println(book.toString());
	
		String str=new String("test");
		System.out.println(str.toString());
	}
	

}

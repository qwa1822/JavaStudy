package ch01;

class BooK{
	private String title;
	private String author;
	
	public BooK(String title,String author) {
		this.title=title;
		this.author=author;
	}
	@Override
	public String toString() {
		
		return title+","+author;
	}
}


public class BookTest {

	public static void main(String[] args) {

		BooK book=new BooK("데미안", "헤르만 헤세");
		
		System.out.println(book.toString());
		
		String str=new String("test");
		System.out.println(str.toString());
	}

	

}

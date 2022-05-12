package 자료구조_자바;

public class MyLinkedTest {

	public static void main(String[] args) {

		MyLinkedList list=new MyLinkedList();
		list.addElement("A");
		list.addElement("B");
		list.addElement("C");
		
		
		list.printAll();
		list.insertElement(3, "0");
		list.printAll();
		list.removElement(0);
		list.printAll();
		list.removElement(1);
		list.printAll();
		
		
		
		list.insertElement(0, "A-1");
		list.printAll();
		
		
	}

}

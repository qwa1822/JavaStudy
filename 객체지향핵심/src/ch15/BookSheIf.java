package ch15;

public class BookSheIf extends SheIf implements Queue {

	@Override
	public void enQueue(String title) {

		sheIf.add(title);
	}

	@Override
	public String deQueue() {
		
		return sheIf.remove(0);
	}

	@Override
	public int getSize() {
		
		return getCount();
	}

}

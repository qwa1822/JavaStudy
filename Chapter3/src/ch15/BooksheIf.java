package ch15;

public class BooksheIf extends SHeIf implements Queue {

	@Override
	public void enQueue(String title) {

		sheIf.add(title);
	}

	@Override
	public String deQue() {
		return sheIf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

}

package ch07_GenericTest;

public class GenericPrinter<T> extends Material {   //T��� Ÿ������ �����ؼ� ���ڴ�.
	
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	
	public String toString() {
		return material.toString();
	}
	
	
	
	
}

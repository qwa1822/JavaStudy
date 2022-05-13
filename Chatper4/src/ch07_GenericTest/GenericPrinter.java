package ch07_GenericTest;

public class GenericPrinter<T> extends Material {   //T라는 타입으로 대입해서 쓰겠다.
	
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

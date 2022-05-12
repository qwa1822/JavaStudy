package ch06;

public class ThreeDPrinterTest {

	public static void main(String[] args) {

		Powder powder=new Powder();
		ThreeDPrint3 printer=new ThreeDPrint3();
		
		printer.setMaterial(powder);
		
		Powder p=(Powder)printer.getMaterial();   
	}

}

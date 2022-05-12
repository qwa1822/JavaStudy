package ch06;

public class GenericPrinterTest {

	public static void main(String[] args) {

		Powder powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); // 어떤자료형을 쓸지 지정
		// powder 타입으로 하기떄문에 //오브젝트와 달리 형변환을 할필요가 없음.
		powderPrinter.setMaterial(powder);

		Powder p = powderPrinter.getMaterial(); // 형변환을 할필요없음
		// 원래는 다운캐스팅을 해야하지만. 제네릭은 ㄴㄴ


		System.out.println(powderPrinter.toString());
		
		//오브젝트는 이렇게
		GenericPrinter powderPrinter2 = new GenericPrinter<>();

		powderPrinter.setMaterial(powder);

		Powder p2 = (Powder) powderPrinter2.getMaterial(); // 오브젝트는 이렇게

		System.out.println(powderPrinter2.toString());
	}

}

package ch06;

public class GenericPrinterTest {

	public static void main(String[] args) {

		Powder powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); // ��ڷ����� ���� ����
		// powder Ÿ������ �ϱ⋚���� //������Ʈ�� �޸� ����ȯ�� ���ʿ䰡 ����.
		powderPrinter.setMaterial(powder);

		Powder p = powderPrinter.getMaterial(); // ����ȯ�� ���ʿ����
		// ������ �ٿ�ĳ������ �ؾ�������. ���׸��� ����


		System.out.println(powderPrinter.toString());
		
		//������Ʈ�� �̷���
		GenericPrinter powderPrinter2 = new GenericPrinter<>();

		powderPrinter.setMaterial(powder);

		Powder p2 = (Powder) powderPrinter2.getMaterial(); // ������Ʈ�� �̷���

		System.out.println(powderPrinter2.toString());
	}

}

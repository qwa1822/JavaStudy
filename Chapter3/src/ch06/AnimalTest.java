package ch06;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
	
	public void eating() {
		
	}
	
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("����� �� �� �ο����Դϴ�.");
	}
	
	public void readBooK() {
		System.out.println("����� å�� �н��ϴ�.");
	}
	
}

class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("ȣ���̰� �� �� �ο����Դϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
	
}
class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���� �ٴմϴ�.");
	}
	
	public void flying() {
		System.out.println("�������� �糯���� �� ��� ���ƴٴմϴ�.");
	}
}
	


public class AnimalTest {

	public static void main(String[] args) {

		Animal hAnimal=new Human();
		Animal tAnimal=new Tiger();
		Animal eAnimal=new Eagle();
		
//		AnimalTest test=new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);

		
		
		ArrayList<Animal> animalList=new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(eAnimal);
		animalList.add(tAnimal);
		
		
		for(Animal animal: animalList) {
			animal.move();
		}
		
	}
	
	public void moveAnimal(Animal animal) {  //������ ����
		animal.move();				//�ٸ�Ŭ�������� �Ѳ����� ������ Ÿ���ΰ�ó�� ��������
									//���� �ٸ��� ����.
	}

}

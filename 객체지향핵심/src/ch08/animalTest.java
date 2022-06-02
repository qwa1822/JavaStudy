package ch08;

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
		System.out.println("����� �ι߷ΰȽ��ϴ�..");
		
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
	
}

class Tiger extends Animal{

	@Override
	public void move() {

	System.out.println("ȣ���̰� �� �߷� �ݴϴ�/.");
	}
	
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
	
}


class Eagle extends Animal{
	
	public void move() {
		System.out.println("�������� �ϴ��� ���ƴٴմϴ�.");
	}
	
	public void flying() {
		System.out.println("�������� �糯���� �� ��� ���ƴٴմϴ�.");
	}
}



public class animalTest {

	public static void main(String[] args) {

		
		Animal hAimal=new Human();
		Animal TAnimal=new Tiger();
		Animal eAnimal=new Eagle();
		
		animalTest test=new animalTest();
//		test.moveAnimal(eAnimal);
//		test.moveAnimal(hAimal);
//		test.moveAnimal(hAimal);
		
		ArrayList<Animal> animalList=new ArrayList<>();
		animalList.add(eAnimal);
		animalList.add(TAnimal);
		animalList.add(hAimal);
		
		
		for(Animal animal:animalList) {
			animal.move();
		}	
		test.testDownCasting(animalList);
	
	}
	
	
	public void testDownCasting(ArrayList<Animal> list) {
		
		for(int i=0; i<list.size(); i++) {
			Animal animal=list.get(i);
			
			if(animal instanceof Human) {
				Human human=(Human)animal;
				human.readBook();
			}
			
			else if(animal instanceof Tiger) {
				Tiger tiger=(Tiger)animal;
				tiger.hunting();
			}
			else if(animal instanceof Eagle) {
				Eagle eagle=(Eagle)animal;
				eagle.flying();
			}
			
			else {
				System.out.println("unsupported type");
			}
		}
	}
	
	
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}

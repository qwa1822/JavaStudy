package ch06;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
	public void eating() {
		
	}
	
	
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람이 두발로걷습니다..");
		
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Tiger extends Animal{

	@Override
	public void move() {

	System.out.println("호랑이가 네 발로 뜁니다/.");
	}
	
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}


class Eagle extends Animal{
	
	public void move() {
		System.out.println("독수리는 하늘을 날아다닙니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 양날개를 쭉 펴고 날아다닙니다.");
	}
}



public class animalTest {

	public static void main(String[] args) {

		
		Animal hAimal=new Human();
		Animal TAnimal=new Tiger();
		Animal eAnimal=new Eagle();
		
//		animalTest test=new animalTest();
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
	
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}

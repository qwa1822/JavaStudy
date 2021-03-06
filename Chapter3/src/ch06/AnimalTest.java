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
		System.out.println("사람이 두 발 로움직입니다.");
	}
	
	public void readBooK() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("호랑이가 네 발 로움직입니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}
class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아 다닙니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 양날개를 쭉 펴고 날아다닙니다.");
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
	
	public void moveAnimal(Animal animal) {  //다형성 구현
		animal.move();				//다른클래스들이 한꺼번에 동일한 타입인것처럼 쓰이지만
									//각각 다르게 쓰임.
	}

}

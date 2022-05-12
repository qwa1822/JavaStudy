package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

		
		
		Class c1=Class.forName("ch04.Person");
		
		Person person=(Person)c1.newInstance();   //인스턴스 생성
		
		
		person.SetName("Lee");
		System.out.println(person);
		
		
		Class c2=person.getClass();   //person이 생겼다면 가져와라 
									//getclass를 쓸라면 인스턴스가 있어야한다.
		
		
		
		Person p=(Person)c2.newInstance();
		System.out.println(p);
		
		
		
		
		Class[] parameterTypes= {String.class};
		Constructor cons=c2.getConstructor(parameterTypes);
		
		
		Object[] initargs= {"Kim"};
		Person kim=(Person)cons.newInstance(initargs);
		System.out.println(kim);
		
	}

}

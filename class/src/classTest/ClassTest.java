package classTest;

//	동물(Animal)
//	이름(name), 나이(age), 종류(species)

//	추상화 시킴
class Animal {
	String name;
	int age;
	String species;
	
//	클래스를 만들면 기본 생성자를 만들자!!!
	
//	1. 기본 생성자 : 자바가 자동으로 만들어줌 
	public Animal() {;}
	
//	2. 초기화 생성자 (this로 넣을려는 값을 초기화 시킨다.)
	public Animal(String name, int age, String species) {
		this.name = name;
		this.age = age;
		this.species = species;
	}
}

// 토끼, 강아지, 고양이
public class ClassTest {
	public static void main(String[] args) {
//		메모리에 할당 -> new
		Animal rabbit = new Animal("토깽이",20,"토끼"); // new에 있는 Animal <- 생성자
		Animal cat = new Animal("치즈",3,"고양이"); // new에 있는 Animal <- 생성자
		System.out.println(rabbit.name); // rabbit은 객체라고 할 수 있다.
		System.out.println(cat.name);
		
//		rabbit.name = "토꺵이";
//		rabbit.age = 20;
//		rabbit.species = "토끼";
		
	}
	
}

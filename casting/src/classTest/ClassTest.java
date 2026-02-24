package classTest;

// 부모
class Car{
	public Car() {;}
	
// 부모의 코드
	void engineStart() {
		System.out.println("열쇠로 시동을 킴");
	}


}

// 자식
class SuperCar extends Car{
	public SuperCar() {;}
	
//	부모의 코드
	@Override
	void engineStart() {
		System.out.println("음성으로 시동을 킴");
	}
	
	void openRoof() {
		System.out.println("뚜껑 오픈!");
	}
	
}


public class ClassTest {
	public static void main(String[] args) {
		Car matiz = new Car();		
		SuperCar ferrari = new SuperCar();

//		upCasting
		Car noOptionFerrari = new SuperCar(); // 자식의 객체를 부모에게 넣음
		
//		upCasting 객체와 부모의 객체는 다르다.
//		오버라이딩된 메서드의 결과가 다르다.
		matiz.engineStart();
		noOptionFerrari.engineStart(); // 이미 부모의 코드로 오버라이딩 되어서 업캐스팅이 되어도 자식의 코드로 오버라이딩 된 값이 호출이 됨
		
		
//		error
//		SuperCar fullOptionOnFerrari = new Car();
		
//		downCasting
		SuperCar fullOptionOnFerrari = (SuperCar)noOptionFerrari;
		fullOptionOnFerrari.openRoof();
		
		
//		instanceof : 타입을 비교하는 연산자
		System.out.println(matiz instanceof Car);
		System.out.println(matiz instanceof SuperCar);
		System.out.println(noOptionFerrari instanceof Car);
		System.out.println(noOptionFerrari instanceof SuperCar); // Car로 upCasting했지만 타입은 바뀌지 않으므로 true
		System.out.println(fullOptionOnFerrari instanceof Car);	// Car가 부모 객체이므로 당연히 true
		System.out.println(fullOptionOnFerrari instanceof SuperCar); // SuperCar로 downCasting해서 당연히 true 
		
		
		
	}
}

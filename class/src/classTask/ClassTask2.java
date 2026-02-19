package classTask;

import java.util.Scanner;

class SuperCar{
	static int errorPasswordCount;
	String brand;
	String color;
	int price;
	boolean engine;
	String password;
	
	
	public SuperCar() {;}


	public SuperCar(String brand, String color, int price, boolean engine, String password) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.engine = engine;
		this.password = password;
		this.errorPasswordCount = errorPasswordCount;
	}
	static {
		System.out.println("비밀번호을 입력하세요");
	}
	{
		this.password = "123456";
		errorPasswordCount++;
	}
	
	void value() {
		if(password != this.password) {
			errorPasswordCount++;
			if(errorPasswordCount >= 3) {
				System.out.println("비밀번호 3회 오류입니다. 경찰이 출동하무니다.");
			}
		}else {
			System.out.println("엔진 시동을 킬까요?");
		}
	}
}
			
		
	
// 슈퍼카(SuperCar) 클래스 생성
// 브랜드, 색상, 가격, 엔진(boolean), 비밀번호, 비밀번호의 오류횟수, 엔진을 킴, 엔진을 끔
public class ClassTask2 {
   
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   String message = "비밀번호를 입력하세요.",password = null;
	   System.out.println(message);
	   password = sc.next();
	   SuperCar supercar = new SuperCar("벤츠","red",50000,true,password);
	   
	   supercar.value();
	   
//   1. 슈퍼차 객체화
//   2. 비밀번호를 입력, 비밀번호가 일치한다면 엔진의 시동 여부를 제어(킴 or 끔)
//   3. 비밀번호 3회 오류시 경찰 출동
   }

}

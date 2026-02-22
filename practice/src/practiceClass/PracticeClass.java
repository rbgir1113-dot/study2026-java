package practiceClass;

import practiceClass.Bank;
import practiceClass.Person;

//Person, Bank

// Bank 클래스 생성
class Bank{
	String bankName;
	long bankMoney;

	
//	Bank 기본 생성자
	public Bank() {;}
	
//	Bank 초기화 생성자
	public Bank(String bankName) { // money를 미리 입력하지 않을것이므로 money는 배제
		this.bankName = bankName;
	}

	
//	사용자의 돈을 입금하는 메서드	
//	수수료 1000원
	void deposit(int money, Person person) {
		this.bankMoney += money + 1000;
		person.personMoney -= money + 1000;
	}
	
//	사용자의 돈을 출금하는 메서드
//	수수료 5000원
	void withdraw(int money, Person person) {
		this.bankMoney -= money - 5000;
		person.personMoney += money - 5000;
	}
	
	
	
}

// Person 클래스 생성
class Person{
	String personName;
	int personMoney;

//	Person 기본 생성자
	public Person() {;}
//	Person 초기화 생성자
	public Person(String personName, int personMoney) {
		this.personName = personName;
		this.personMoney = personMoney;
	}
	
	
}


public class PracticeClass {
	public static void main(String[] args) {
		Bank kb = new Bank("국민은행");
		Person gildong = new Person();
		
//		kb.deposit(10000, gildong);
//		System.out.println("내 돈 : " +gildong.personMoney);
//		System.out.println("은행 돈 : " + kb.bankMoney);
		
		kb.withdraw(10000, gildong);
		System.out.println("내 돈 : " +gildong.personMoney);
		System.out.println("은행 돈 : " +kb.bankMoney);
		
	}
}

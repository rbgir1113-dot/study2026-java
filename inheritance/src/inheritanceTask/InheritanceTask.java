package inheritanceTask;

//   상속 및 분리 실습
//   
//   PersonTask
//   이름, 나이, 주소, 핸드폰
//   각 메서드 출력
//   work 일을 한다
//   sleep 잠을 잔다
//   eat 세 끼를 먹는다
class PersonTask {
	String name;
	int age;
	String address;
	String phoneNumber;
	
	public PersonTask() {;}
	
	public PersonTask(String name, int age, String address, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	void work() {
		System.out.println("일을 한다");
	}
	void sleep() {
		System.out.println("잠을 잔다");
	}
	void eat() {
		System.out.println("세 끼를 먹는다");
	}
	
	
}
//   StudentTask
//   인스타아이디
//   각 메서드 출력
//   work 아르바이트를 한다
//   sleep 수업 시간에 잠을 잔다
//   eat 아침을 거른다

class StudentTask extends PersonTask{
	String instaId;
	
	public StudentTask() {;}
	
	public StudentTask(String name, int age, String address, String phoneNumber, String instaId) {
		super(name, age, address, phoneNumber);
		this.instaId = instaId;
		
	}
	
	@Override
	void work() {
		System.out.println("아르바이트를 한다");
	}
	
	@Override
	void eat() {
		System.out.println("아침을 거른다");
	}	
	
	@Override
	void sleep() {
		System.out.println("수업 시간에 잠을 잔다");
	}
}
//   EmployeeTask
//   비상금
//   각 메서드 출력
//   work 하루 종일 일을 한다
//   sleep 잠을 설친다
//   eat 야식을 먹는다
class EmployeeTask extends PersonTask{
	int hiddenMoney;
	
	public EmployeeTask() {;}

	public EmployeeTask(String name, int age, String address, String phoneNumber, int hiddenMoney) {
		super(name, age, address, phoneNumber);
		this.hiddenMoney = hiddenMoney;
	}
	
	@Override
	void eat() {
		System.out.println("야식을 먹는다");
	}

	@Override
	void sleep() {
		System.out.println("잠을 설친다");
	}
	
	@Override
	void work() {
		System.out.println("하루 종일 일을 한다");
	}
	
}





//   
//   InhertanceTask에서
//   사람, 학생, 직장인 객체화 후 각 메서드 출력하기

public class InheritanceTask {
   public static void main(String[] args) {
      PersonTask person1 = new PersonTask("홍길동", 20, "서울시 강남구", "010-1234-1234");
      StudentTask person2 = new StudentTask("이순신", 25, "경기도 성남시", "010-5678-5678", "test123");
      EmployeeTask person3 = new EmployeeTask("김유신", 30, "경기도 하남시", "010-1245-1245", 50_000);
      
      System.out.println(person1.age);
      System.out.println(person2.instaId);
      System.out.println(person3.hiddenMoney);
      
      System.out.println("person");
      person1.eat();
      person1.work();
      person1.sleep();
      System.out.println("student");
      person2.eat();
      person2.work();
      person2.sleep();
      System.out.println("employee");
      person3.eat();
      person3.work();
      person3.sleep();
      
   }
}

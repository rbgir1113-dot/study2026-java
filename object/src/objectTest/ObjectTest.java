package objectTest;

public class ObjectTest {
//	1. private : 접근 X , 화면에 사용
	private String name;
	

//	2. 기본 생성자 : 컴파일러가 자동적으로 만들어줌
	public ObjectTest() {;}

//	3. 초기화 생성자
	public ObjectTest(String name) {
		super();
		this.name = name;
	}
		
		
//	4. getter
//	5. setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	6. toString() : 해당 객체의 필드를 확인하기 위한 용도
	@Override
	public String toString() {
		return "ObjectTest [name=" + name + "]";
	}
	

	public static void main(String[] args) {
		ObjectTest ot = new ObjectTest();
		System.out.println(ot);
		System.out.println(ot.toString());
		
		
		User user1 = new User(1L, "홍길동");
		
//		도서관 책을 대여
		if(user1.equals (new User(1L, "홍길동"))) {
			System.out.println("책 대여 완료");
		}else {
			System.out.println("도난 신고");
		}
		
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
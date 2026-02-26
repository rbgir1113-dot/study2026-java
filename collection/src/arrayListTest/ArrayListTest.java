package arrayListTest;

import java.util.ArrayList;

public class ArrayListTest<T> {
	
//	<?> : 제네릭 - 포괄적인 즉 이름이 없는이라는 뜻
//	지금 당장 무슨 타입일 지 알 수 없을 대 사용한다
//	또한 사용자가 어떤 타입의 데이터를 넣을 지 모르기 떄문에
//	객체화를 시킬 때 정해준다.
	
	T data;
	
	
	public static void main(String[] args) {
		ArrayList<String> datas = new ArrayList<String>();

//		CRUD
//		C : create(추가)
//		R : read(읽기) == Get 
//		U : update(수정)
//		D : delete(삭제)
		
		datas.add("홍길동");
		datas.add("김유신");
		datas.add("이순신");
		
		System.out.println(datas); // -> datas 필드를 보여줌
		
		System.out.println(datas.get(2)); // datas에 있는 방 2번 값을 불러옴
		
		String prev = datas.set(2, "박혁거세"); // 바꿀려는 값 추출 
		System.out.println(datas); // 바꾼 값으로 출력
		
		
		String removed = datas.remove(0); // 0번쨰 방 값 존재
		System.out.println(removed); // 0번쨰 방 값 출력
		System.out.println(datas); // 기존 0번째 방 삭제 후 출력
		
	}
}

package streamTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

// JDK 8 API
// map
// filter
// forEach
public class StreamTest {
	public static void main(String[] args) {
//		IntStream : 숫자를 이용한 Steam 문법을 사용할 수 있게 제공해주는 인터페이스(객체)
//		.range() : 반복할 수 있는 횟수(범위)를 만들어주는 메서드
//		IntStream.range(0, 10).forEach((number) -> {System.out.println(number);});

//		ArrayList 1 ~ 10 까지 값을 추가 
//		ArrayList<Integer> numbers = new ArrayList<Integer> ();
//		IntStream.rangeClosed(1, 10).forEach((number) -> {numbers.add(number);});
//		System.out.println(numbers);
		
//		forEach : 빠른 for 문과 같은 형식.	
//		numbers.forEach((num) -> {System.out.println(num);});
	
	
//      .forEach()
//      1. numbers2를 ArrayList 생성
//      2. 1~50까지 짝수만 numbers2에 추가하고 모두 출력하기
//		ArrayList<Integer> numbers2 = new ArrayList<Integer> ();
//		IntStream.rangeClosed(1, 50).forEach((num) -> {
//			if(num % 2 == 0) {
//				numbers2.add(num);
//			}
//		});
//		System.out.println(numbers2);
		
		
//		참조형
//		.(클래스형::메서드명)
		
//		numbers2.forEach(System.out::println);
//		==================위 아래가 같은 코드====================
//		numbers2.forEach((num) -> {System.out.println(num);});
	
//      ArrayList numbers3를 생성하고
//      참조형으로 numbers3에 1~10까지 값을 추가하기
		
//		ArrayList<Integer> numbers3 = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(numbers3::add);
//		System.out.println(numbers3);
		
//		문자열 stream
//		.chars()
//		String data = "ABCDEF";
		
//		참조를 하면 안되는 순간
//		1. 문자형 출력이 불가능 -> 목적에 맞지 않음
//		data.chars().forEach(System.out::println); // 아스키코드 숫자가 나옴
//
//		data.chars().forEach((c) -> {System.out.println((char)c);});
		
//		2. 0삭제 -> 1번째 인덱스가 0번째 인덱스를 갖게된다.
//		즉 삭제를 할 때 값을 건너뛰게 되어 참조형 사용이 불가능하다.
//		ArrayList<Integer> numbers4 = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(numbers4::add);
//		System.out.println(numbers4); // 12345의 값을 지우고 싶음
//		IntStream.range(0, 5).forEach(numbers4::remove);
//		System.out.println(numbers4); // 짝수 번만 출력
		
		
		
//		.map() : 기존 값을 다른 값으로 변경할 때 사용하는 메서드
//		※ return이 반드시 필요하다.
//		1 ~ 10 까지 추가
//		ArrayList<Integer> numbers5 = new ArrayList<Integer>();
//		IntStream.range(0, 10).map((n) -> n + 1).forEach(numbers5::add); // 리턴 타입 보면서 변수에 담을수 있는지 없는지 확인 -> void는 변수에 못 담는다(<->타입이 있으면 변수에 담을수 있음)
//		System.out.println(numbers5);
		
//      data를 "abcdefg"로 변경하여 출력
		String data = "ABCDEFG";
		int diff = 'a' - 'A';
		data.chars().map((c) -> c + diff).forEach((c) -> System.out.print((char)c));

		
		
		
	}
}

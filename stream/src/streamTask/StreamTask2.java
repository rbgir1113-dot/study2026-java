package streamTask;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask2 {
	public static int add97(int num) {
		return num + 97;
	}
	
	public static boolean isOdd(int num) {
		return num % 2 != 0;
	}
	
	public static char valueOf(int num) {
		return (char)num;
	}
	
	public static void main(String[] args) {
//      a...z까지 ArrayList에 담고
//      "acegi..." 문자열로 출력
	   
//	  String alphabet = IntStream.range(0, 26)
//		  .map((n) -> ('a' + n))
//		  .filter((n) -> n % 2 == 1)
//		  .mapToObj((n)-> (char)n)
//		  .map(String::valueOf)
//		  .collect(Collectors.joining(","));
//	  
//	  System.out.println(alphabet);
		
		
//      String result = IntStream
//      .rangeClosed(0, 25)
//      .map(n -> n + 97)
//      .filter(n -> n % 2 != 0)
//      .mapToObj(n -> (char)n)
//      .map(String::valueOf)
//      .collect(Collectors.joining(""));
//   
//   System.out.println(result);
	   
		
//	  String alphabet = IntStream.range(0, 26)
//			  .map(StreamTask2::add97)
//			  .filter(StreamTask2::isOdd)
//			  .mapToObj(StreamTask2::valueOf)
//			  .map(String::valueOf)
//			  .collect(Collectors.joining(","));
//	  
//	  System.out.println(alphabet);
	  
      
//	  IntStream -> ArrayList
//	  1. List를 다운캐스팅해서 사용하는 방법
//	  ArrayList<Integer> datas = (ArrayList)IntStream
//	  	.range(0, 10)
//	  	.mapToObj((n) -> Integer.valueOf(n))
//	  	.collect(Collectors.toList());

	  
//	  2. boxed 메서드를 이용해서 바꾸는 방법
	  List<Integer> datas = IntStream
		  .range(0, 10)
		  .boxed()
		  .collect(Collectors.toList());

//	  형변환 후 map 사용 방법
	  IntStream					// 70 ~ 73 번째 줄까지 List라는 하나의 타입
	      .range(0, 10)			// .map이라는 메서드를 사용 못 함으로 
	      .boxed()				// .stream()을 붙여줘서 사용한다
	      .collect(Collectors.toList())  // ex) new ArrayList.map() -> 사용불가
	      .stream()						 // new ArrayList.stream().map() -> 사용 가능
	      .map((n) -> n + 1)
	      .forEach(System.out::println);
	  
   }
}

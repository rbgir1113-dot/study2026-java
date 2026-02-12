package arrayTest;

public class ArrayTest {
	public static void main(String[] args) {
		
		// 자바 배열은 크기가 고정
		// JAVA는 실제 메모리에 주소값을 가져오는것이 아닌 JVM이 관리하는 해시 주소에서 들고온다
//		int[] arData = new int[5];
//		ardata[0] = 10;
		
//		String[] arData2 = new String[3];
//		System.out.println(arData2[0]);
//		
//		boolean[] arData3 = {false,false, true};
//		arData3[3] = false; // java의 배열은 크기가 정해져 있어서 추가로 못들어온다.
		
		int[] arData1 = {10,3,9,6,7};
		System.out.println(arData1[0]);
		System.out.println(arData1[1]);
		System.out.println(arData1[2]);
		System.out.println(arData1[3]);
		System.out.println(arData1[4]);
		// . = 주소의 접근하는 연산자
		// java의 length는 arData1의 ***필드***를 들고온다
		for(int i=0; i< arData1.length; i++) {
			System.out.println(arData1[i]);
		}
		
//		char[] chars = {'A','B','C','D','E'};
//		for(int i =0; i< chars.length; i++) {
//			System.out.println(chars[i]);
//		}
		char[] chars = {'A', 'B', 'C', 'D', 'E'};
	      
	      chars[0] = 97;// 컴파일러가 자동 형변환
	      for(int i = 0; i < chars.length; i++) {
	         System.out.print(chars[i] + " ");
	      }
	}
}

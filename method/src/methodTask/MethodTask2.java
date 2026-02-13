package methodTask;

import java.util.Scanner;

public class MethodTask2 {
//   배열 응용
//		1.
//	void determine(char text) {
//		if(text >= 'a' && text <='z') {
//			System.out.println("소문자입니다.");
//		}else if(text >= 'A' && text <= 'Z') {
//			System.out.println("대문자입니다.");
//		}else {
//			System.out.println("일반 문자입니다.");
//		}
//	}
	
	String checkChar(char c) {
	      String result = "";
	      
	      if(c >= 65 && c <= 90) {
	         result = "대문자";
	      }else if(c >= 97 && c <= 122) {
	         result = "소문자";
	      }else {
	         result = "일반 문자";
	      }
	      return result;
	   };
//		2.
//	int add(int num1, int num2 ) {
//		return num1 + num2;
//	}
//	
//	int diff(int num1, int num2 ) {
//		return num1 - num2;
//	}
//	
//	double devide(int num1, int num2 ) {
//		return (double)num1 / num2;
//	}
//	
//	int multiple(int num1, int num2 ) {
//		return num1 * num2;
//	}
//	
	int[] calc(int num1, int num2) {
	      int[] result = new int[4];
	      
	      result[0] = num1 + num2;
	      result[1] = num1 - num2;
	      result[2] = num1 * num2;
	      result[3] = num1 / num2;
	      return result;
	   }
	
//		3.
//	void minMax(int[] data) {
//	    for (int num : data) {
//	    	
//	    }
//	}
	
	
	
   public static void main(String[] args) {

//      1. 글자 하나를 전달하면 글자가 대문자인지, 소문자인지, 일반문자인지 알려주는 메서드
	   MethodTask2 mt = new MethodTask2();
//	   mt.determine('A');
	   
//      2. 두 정수를 더하면 사칙연산의 결과를 반환해주는 메서드(+, -, /, *)
//	   int add = mt.add(10,20);
//	   int diff = mt.diff(10,20);
//	   double devide = mt.devide(10,20);
//	   int multiple = mt.multiple(10,20);
//	   
//	   System.out.println(add);
//	   System.out.println(diff);
//	   System.out.printf("%.2f\n",devide);
//	   System.out.println(multiple);
	   

	   
//      3. 5개의 정수를 전달하면 가장 큰 값과 작은 값을 알려주는 메서드
	   
	   
	   
   }
}

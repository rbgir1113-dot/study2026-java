package forTask;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
//		1 ~ 10까지 반복 후 5 ~ 8 을 제외하고 출력
		
//		for(int i = 0; i < 10; i++) {
//			if(i + 1 > 4 && i + 1 <9) {
//				continue;
//			}
//			System.out.println(i+1);
//		}
//		 for(int i = 0; i < 6; i++) {
//	         int value = i + 1;
//	         System.out.println(value > 4 ? value + 4 : value);
//	}
		 
//	      브론즈
//	      1. 1~100까지 출력

//		for(int i = 0; i<100; i++) {
//			 System.out.println(i + 1);
//		 }
		 
//	      2. 100~1까지 출력
		
//	    for(int i = 0; i < 100; i++) {
//	    	System.out.println(100 - i);
//	    }
		
//	      골드
//	      1. 1~10까지 누적합을 출력
//		int value = 0, i = 0;
//		for(i = 0; i< 10; i++) {
//			value += i + 1;
//			System.out.println(value);
//		}
		
		
//	      2. 1~n까지 누적합 출력
//	    Scanner sc = new Scanner(System.in);  
//	    String message = "누적합 할 숫자를 입력하세요 \n ex)1~123456789";
//	    int  n = 0, value = 0;
//	    System.out.println(message);
//	    n = sc.nextInt();
//    	for(int i = 0 ; i< n; i++) {
//    		value += i + 1;
//    		System.out.println(value);
//    	}
	
	    	
	    		
		
//	      플레티넘
//	      1. A~F까지 출력
//		for(int i = 0; i < 6; i++) {
//			System.out.println((char)('A'+ i));
//		}
		
//	      2. A~F까지 중 C를 제외하고 출력
//		for(int i = 0; i < 6; i++) {
//			if(i == 2) {
//				continue;
//			}
//			System.out.println((char)('A'+ i));
//		}
	      
//	      다이아
//	      1. aBcDeFg...Z 출력
//			for(int i = 0; i < 26; i++) {
//				if(i%2 == 1) {
//					System.out.println((char)('A' + i));
//				}else {
//					System.out.println((char)('a' + i));
//				}
//			}
//		
//	      2. 별찍기 
//	        *
//	       ***
//	      *****
//	      for(int i=0; i < 3; i++) {
//	    	  String line = "";
//	    	  for(int j = 0; j< 3 - i - 1; j++){
//	    		    line += " ";
//	    		  }
//	    	  for(int k = 0; k < 2*i+1; k++){
//	    		    line += "*";
//	    	  }
//	    	  System.out.println(line);
//	      }
	      
//	      마스터
//	      1. 해당 문자와 반복할 횟수를 입력하면 문자를 만들어주는 프로그램 
//	      단 반복할 횟수는 1~9까지만 입력할 수 있다.
//	      입력 예시) a1b3c2
//	      출력 예시) abbbcc
//	      Scanner sc = new Scanner(System.in);
//	      String message = "문자와 반복할 횟수를 작성하세요(최대 반복 9번)\nex) 입력 : a1b3c2 -> 출력 : abbbcc",
//	    		  text = "",
//	    		  result = "";
//	      
//	      System.out.println(message);
//	      text = sc.nextLine();
//	      for(int i = 0; i < text.length(); i +=2) {
//	    	  int count = text.charAt(i+1) -'0';
//	    	  result = String.valueOf(text.charAt(i)) * count;
//	    	  }
//	      }
		
		Scanner sc = new Scanner(System.in);
	    String message = "문자와 반복할 횟수를 붙여서 입력하세요.\nex)a1b2c5",
            input = null, result = "";
	      
	    System.out.println(message);
	    input = sc.next();
	      
	    for(int i = 0; i < input.length(); i++) {
		     if(i % 2 == 0) {
		        char c = input.charAt(i);
		        int count = input.charAt(i + 1) - 48;
		        for(int j = 0; j < count; j++) {
		           result += c;
		        }}
//	      2. 사용자가 입력한 횟수가 얼마인지 모르고,
//	      입력한 횟수 만큼 문자를 만들어주는 프로그램
//	      입력 예시) a1b22c357
//	      출력 예시) abbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccccccc...
}
	    }
	    }

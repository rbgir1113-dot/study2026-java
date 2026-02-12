package arrayTask;

import java.util.Scanner;

public class ArrayTask03 {
   public static void main(String[] args) {
//      플레티넘
//      1. 사용자의 입력값을 변환
//      사용자에게 입력 받은 문자열 중 소문자는 대문자로, 대문자는 소문자로 변환하여 모두 배열에 담고 출력
//      입력 예시) 안녕hi!
//      출력 예시) 안녕HI!
//	   Scanner sc = new Scanner(System.in);
//	   String text = "", message = "문자열을 입력하세요\n예시) 안녕hi", change= "";
//	   String[] arData1 = null;
//	   int diff = 'a'-'A';
//	   
//	   System.out.println(message);
//			   
//	   text = sc.nextLine();
//	   arData1 = new String[text.length()];
//	   for(int i = 0; i < text.length(); i++) {
//		   if((int)text.charAt(i) >= 'a' && (int)text.charAt(i)<='z') {
//			   change = String.valueOf((char)((int)text.charAt(i) - diff));
//		   }else if((int)text.charAt(i) >= 'A' && (int)text.charAt(i)<='Z'){
//			   change = String.valueOf((char)((int)text.charAt(i) + diff));
//		   }else {
//			   change = String.valueOf(text.charAt(i));
//		   }
//		   arData1[i] = change;
//		   System.out.print(arData1[i]);
//	   }
	   
	   
//      2. 사용자가 입력한 모든값을 반대로 뒤집어주는 결과를 출력
//      입력 예시) apple
//      출력 예시) elppa
	   
      Scanner sc = new Scanner(System.in);
      String inputText = "", message = "입력한 값의 반대로 뒤집혀요!", reverse = "";
      String[] arData2 = null; 
      
      System.out.println(message);
      inputText = sc.nextLine();
      arData2 = new String[inputText.length()];
      
      for(int i = 0; i < inputText.length(); i++) {
    	  arData2[i] = String.valueOf(inputText.charAt(inputText.length() - i - 1));
    	  System.out.print(arData2[i]);
      }
      
      
      
      

   
   
   
   
   }
   
}
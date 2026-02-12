package arrayTask;

import java.util.Scanner;

public class ArrayTask01 {
   public static void main(String[] args) {
//      브론즈
//      1. 1~100까지 배열에 담은 후 홀수만 출력
//	   int[] result_1 = new int[100];
//	   for(int i = 0; i<result_1.length; i++) {
//		   result_1[i] += i + 1;
//		   if(result_1[i] % 2 == 0) {
//			   System.out.println(i);
//		   }
//		   }
	   
//      2. 10~1까지 중 짝수만 배열에 담고 출력
	   int[] result_2 = new int[10];
	   int num = 0;
	   for(int i = 0; i < result_2.length; i++) {
		   num = 10 - i;
		   if(num % 2 == 0) {
			   result_2[i] = num;
			   System.out.println(result_2[i]);
		   }
	   }
   
//      3. 1~77까지 중 짝수만 배열에 담고 출력
//	   int[] result_3 = new int[77];
//	   for(int i = 0; i < result_3.length; i++) {
//		   result_3[i] = i + 1;
//		   if(result_3[i] % 2 == 1) {
//			   System.out.println(result_3[i]);
//		   }
//	   }
      
//      실버
//      A~F까지 배열에 담고 출력
//	   char[] chars = new char[6];
//	   for(int i =0; i < chars.length; i++) {
//		   chars[i] = (char)('A' + i);
//		   System.out.println(chars[i]);
//	   }
	   
//      5개의 정수를 입력 받고 배열에 담은 후 최댓값과 최솟값을 출력
	   String message = "번 째 정수를 입력하세요.\n";
		  Scanner sc = new Scanner(System.in);
		  int[] arData4 = new int[5];
		  int count = 0, min = 0, max = 0;
		  
		  while(true) {
		     System.out.print(count + 1 + message);
		     arData4[count] = sc.nextInt();
		     count++;
		     if(count > 4) {
		        break;
		     }
		  }
		  
		  min = arData4[0];
		  max = arData4[0];
		  
		  for(int i = 1; i < arData4.length; i++) {
		     if(min > arData4[i]) { min = arData4[i]; }
		     if(max < arData4[i]) { max = arData4[i]; }
		  }
		  
		  System.out.println("최댓값: " + max);
		  System.out.println("최솟값: " + min);
    		  
}
}
package arrayTask;

import java.util.Scanner;

public class ArrayTask02 {
   public static void main(String[] args) {
//      int[] result_1 = {};
//      골드
//      1. 사용자가 몇 개를 입력할 지 모를 때,
//      입력한 모든 값을 배열에 담은 후 최댓값과 최솟값을 출력
//	   String message = "번 째 정수를 입력하세요.\n", result = "";
//	   Scanner sc = new Scanner(System.in);
//	   result_1 = null;
//	   int count = 0, min = 0, max = 0;
//	   
//	   while(true) {
//		   System.out.println(count + 1 + message);
//		   int value = sc.nextInt();
//		   if(value == -1) {
//			   break;
//		   }
//		   int[] add = new int[count+1];
//		   if (result_1 != null) {
//               for (int i = 0; i < count; i++) {
//                   add[i] = result_1[i];
//               }
//           }
//		   add[count] = value;
//		   result_1 = add;
//		   
//		   for (int i = 0; i < result_1.length; i++) {
//			    result += (i == 0 ? "" : ", ") + result_1[i];
//			}
//
//		   count++;
//
//	   }
//		  
//	   
//	   min = result_1[0];
//	   max = result_1[0];
//  
//	   for(int i = 0; i < result_1.length; i++) {
//		   if(min > result_1[i]) { min = result_1[i]; }
//		   if(max < result_1[i]) { max = result_1[i]; }
//	   }
//		  System.out.println(result);
//		  System.out.println("최댓값: " + max);
//		  System.out.println("최솟값: " + min);
//	   }
//	   Scanner sc = new Scanner(System.in);
//	      int[] arData1 = null;
//	      int count = 0, min = 0, max = 0;
//	      String message1 = "배열의 길이를 입력하세요.";
//	      
//	      System.out.println(message1);
//	      count = sc.nextInt();
//	      arData1 = new int[count];
//	      
//	      for(int i = 0; i < count; i++) {
//	         System.out.println(i + 1 + "번 째 정수를 입력하세요.\nex)10");
//	         arData1[i] = sc.nextInt();
//	      }
//	      
//	      min = arData1[0];
//	      max = arData1[0];
//	      
//	      for(int i = 0; i < arData1.length; i++) {
//	         if(min > arData1[i]) { min = arData1[i]; };
//	         if(max < arData1[i]) { max = arData1[i]; };
//	      }
//	      
//	      System.out.printf("최솟값: %d 최댓값: %d", min, max);
	   
//      2. 사용자가 몇 개를 입력할 지 모를 때,
//      입력한 모든 값을 배열에 담고, 실수와 정수의 개수를 출력
//      입력예시) "10", "10.7", "2", "3.6"
//      출력예시) 실수 2개, 정수 2개
	      Scanner sc = new Scanner(System.in);
	      String[] arData2 = null;
	      int arData2Length = 0, integerCount = 0, floatCount = 0;
	      String message1 = "배열의 길이를 입력하세요.";
	      
	      System.out.println(message1);
	      arData2Length = sc.nextInt();
	      arData2 = new String[arData2Length];
	      
	      for(int i = 0; i < arData2Length; i++) {
	         
	         System.out.println(arData2Length + 1 + "번 째 값을 입력하세요\nex)10 or 11.2");
	         
	         String input = sc.next();
	         arData2[i] = input;
	         
	         if(input.contains(".")) {
	            floatCount++;
	         }else {
	            integerCount++;
	         }
	      }
	      
	      System.out.printf("실수: %d개, 정수: %d개", floatCount, integerCount);
   
   
   
   
   
   
   }
   }


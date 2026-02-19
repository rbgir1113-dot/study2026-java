package methodTask;

import java.util.Scanner;

public class MethodTask5 {
//      1. 두 정수를 전달하면 몫과 나머지를 배열로 전달하는 메서드
//	int[] divide(int dividend, int divisor) {
//        if (divisor == 0) {
//            System.out.println("0으로 나눌수 없습니다.");
//        }
//        
//        int quotient = dividend / divisor; 
//        int remainder = dividend % divisor; 
//
//        return new int[]{quotient, remainder};
//	}	
	
//	int[] getDivide(int data1, int data2) {
//	      return new int[] {data1 / data2, data1 % data2};
//	   };
//	
//	
//	String integerValue(String inputText) {
//		if (inputText == null) {
//            return "";
//        }
//
//        String result = "";
//        for (int i = 0; i < inputText.length(); i++) {
//            char ch = inputText.charAt(i);
//
//            if (ch >= '0' && ch <= '9') {
//                result += ch; 
//            }
//        }
//        return result;
//    }
//	
//	 String getIntegerString(String input) {
//	      String result = "";
//	      for(int i = 0; i < input.length(); i++) {
//	         int c = input.charAt(i) - 48;
//	         if(c >= 1 && c <= 9) {
//	            result += (char)(c + 48);
//	         }
//	      }
//	      return result;
//	   }
//
//
//	int getCount(String expression, char c) {
//		int count = 0;
//		for(int i =0; i< expression.length(); i++) {
//			if(expression.charAt(i) == c) {
//				count++;
//			}
//		}
//		return count;
//	}
//	
//	
//	 int getTotalOdd(int[] datas) {
//	      int result = 0;
//	      for(int i = 0; i < datas.length; i++) {
//	         if(datas[i] % 2 == 1) {
//	            result += datas[i];
//	         }
//	      }
//	      return result;
//	   }
//	   
//	 
//	 int[] getMinArray(int[] datas) {
//	      int[] minArray = new int[2];
//	      int min1 = datas[0], min2 = datas[1];
//	      for(int i = 0; i < datas.length; i++) {
//	         if(min1 > datas[i]) {
//	            min1 = datas[i];
//	         }else if(datas[i] > min1 && min2 >= datas[i]){
//	            min2 = datas[i];
//	         }
//	      }
//	      minArray[0] = min1;
//	      minArray[1] = min2;
//	      return minArray;
//	   }
//	
//	
//	
//	
	String getRemoveString(String input) {
	      String result = "";
	      for(int i = 0; i < input.length(); i++) {
	         char c = input.charAt(i);
	         if(!result.contains(String.valueOf(c))) {
	            result += c;
	         }
	      }
	      return result;
	   }
	
	
	
	
   public static void main(String[] args) {
	   MethodTask5 mt5 = new MethodTask5();
	   Scanner sc = new Scanner(System.in);
//	   System.out.println("정수 두개를 입력하세요.");
//	   int value1 = sc.nextInt();
//	   int value2 = sc.nextInt();
//	   int[] result = mt5.divide(value1, value2);
//       System.out.println("몫: " + result[0]);
//       System.out.println("나머지: " + result[1]);
	   
	   
	   
	   
	   
	   
	   
//      2. 사용자가 입력하는 값중 정수 분리하기
//      입력 예시)
//      안1녕2하3세4요
//      출력 예시)
//      1234
//	   String[] value = null;
//	   String inputText = "", message = "글자 사이에 숫자를 찾아서 숫자만 작성합니다.\nex)안1녕2하3세4요 -> 1234";
//	   System.out.println(message);
//	   inputText = sc.next();
//	   String result = mt5.integerValue(inputText);
//
//       System.out.println("입력: " + inputText);
//       System.out.println("숫자만 추출: " + result);
//	   
	   
//      3. 사용자가 입력한 글자와 찾을 글자를 입력하면 글자의 개수를 반환해주는 메서드
//      입력 예시) apple
//      찾을 글자 p
//      반환 2
	   
//       String input = null;
//       input = sc.next();
//       int count = mt5.getCount(input, 'a');
//       System.out.println(count);
       
//      4. 5개 정수를 배열로 마구잡이로 전달할 때 가장 작은 2개의 숫자를 배열에 담아 전달하는 메서드

//     int[] datas = {10, 40, 1, 10};
//     System.out.println(mt.getMinArray(datas)[0]);
//     System.out.println(mt.getMinArray(datas)[1]);
     
       
//      5. 랜덤한 값을 100칸 배열에 담은 후 배열 안의 값 중 홀수의 합만 출력
//       int[] datas = new int[100];
//     int result = 0;
//     for(int i = 0; i < datas.length; i++) {
//        datas[i] = (int)(Math.random() * 100);
//     }
//     
//     System.out.println(mt5.getTotalOdd(datas));
      
//      6. 연속된 중복 문자 제거하기
//      입력 예시1)
//      abbbbacda
//      출력 예시1)
//      aacda
      
//      입력 예시2)
//      aabbccccd
//      출력 예시2)
//      abcd
	
//	   Scanner sc = new Scanner(System.in);
       String input = null, message = "중복을 제거할 문자를 입력하세요.\naabbccccd", result = "";
	      
       System.out.println(message);
       input = sc.next();
	      
       System.out.println(mt5.getRemoveString(input));
	      
      
   }
}












package methodTask;

import java.util.Scanner;

public class MethodTask3 {
//	   	단 반드시 배열을 사용해야 함
//      1. 한글을 정수로 바꿔주는 메서드(일공이사 -> 1024)
//	String changeInt(String[] arrText) {
//		String result = "";
//		for(int i = 0; i< arrText[0].length(); i++) {
//			if(arrText[0].charAt(i) == '일') {
//				result += "1";
//			}
//			if(arrText[0].charAt(i) == '이') {
//				result += "2";
//			}
//			if(arrText[0].charAt(i) == '삼') {
//				result += "3";
//			}
//			if(arrText[0].charAt(i) == '사') {
//				result += "4";
//			}
//			if(arrText[0].charAt(i) == '오') {
//				result += "5";
//			}
//			if(arrText[0].charAt(i) == '육') {
//				result += "6";
//			}
//			if(arrText[0].charAt(i) == '칠') {
//				result += "7";
//			}
//			if(arrText[0].charAt(i) == '팔') {
//				result += "8";
//			}
//			if(arrText[0].charAt(i) == '구') {
//				result += "9";
//			}
//			if(arrText[0].charAt(i) == '공') {
//				result += "0";
//			}
//		}
//		return result;
//	}
////      2. 정수를 한글로 바꿔주는 메서드(1024 -> 일공이사)
//	
//	String changeHangle(int[] arrNum) {
//		String num = String.valueOf(arrNum[0]),
//					result = "";
//			for(int i = 0; i < num.length(); i++) {
//				switch((int)num.charAt(i) - '0') {
//				case 1:
//					result += "일";
//					break;
//				case 2:
//					result += "이";
//					break;
//				case 3:
//					result += "삼";
//					break;
//				case 4:
//					result += "사";
//					break;
//				case 5:
//					result += "오";
//					break;
//				case 6:
//					result += "육";
//					break;
//				case 7:
//					result += "칠";
//					break;
//				case 8:
//					result += "팔";
//					break;
//				case 9:
//					result += "구";
//					break;
//				case 0:
//					result += "공";
//					break;
//				}
//			}
//			return result;
//		}			
//		
		
		
		
		
		
		
	
			
   public static void main(String[] args) {
	   MethodTask3 mt3 = new MethodTask3();
//	   String[] arrText = {"일공이사"};
//	   String result = mt3.changeInt(arrText);
//	   System.out.println(result);
	   
	   
//	   int[] arrNum = {1024};
//	   String result = mt3.changeHangle(arrNum);
//	   System.out.println(result);
	   
	   
//	   번외 로또 추첨하기
//	   로또 번호 5개를 배열에 담아서 결과를 반환해주는 메서드
	   int[] lotto = new int[6];
	   for(int i = 0; i < 6; i++) {
		   lotto[i] = (int)Math.floor(Math.random() * 45);
		   System.out.print(lotto[i] + " ");
	   }
	   
//	   1.한글을 정수로 바꿔주는 메서드(일공이사 -> 1024)
	   Scanner sc = new Scanner(System.in);
	   String message = "정수로 바꿀 글자를 입력하세요.\nex)일공이사",
			   hangles = "공일이삼사오육칠팔구", result = "";
	   String[] hangle = null;
     
	   System.out.println(message);
	   hangle = sc.nextLine().split("");
     
	   for(int i = 0; i < hangle.length; i++) {
		   result += hangles.indexOf(hangle[i]);
	   }
     
	   System.out.println(result);
	   
//	   2. 정수를 한글로 바꿔주는 메서드(1024 -> 일공이사)
//	      Scanner sc = new Scanner(System.in);
//	      String message = "한글로 바꿀 정수를 입력하세요.\nex)1024",
//	            hangles = "공일이삼사오육칠팔구", result = "";
//	      String[] hangle = null;
//	      
//	      System.out.println(message);
//	      hangle = sc.nextLine().split("");
//	      for(String s: hangle) {
//	         result += hangles.charAt(Integer.parseInt(s));
//	      }
//	      
//	      System.out.println(result);
   }
}

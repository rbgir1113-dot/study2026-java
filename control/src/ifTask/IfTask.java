package ifTask;

import java.util.Scanner;

public class IfTask {
   public static void main(String[] args) {
//      거스름돈 계산하기
//      1번 상품: 코카콜라 - 2000원
//      2번 상품: 팹시 - 1500원
//      3번 상품: 맥콜 - 1000원

//      가진돈은 10000
//      사용자가 상품과 구매개수를 입력해서
//      거스름돈을 계산하는 로직을 완성하시오
//      출력 예시)
//      구매상품: 콜라 2개
//      판매가격: 4000원
//      거스름돈: 6000원
//	   Scanner sc = new Scanner(System.in);
//	   
//	   String message = "상품과 갯수를 고르시오\nex)\n코카콜라\n팹시\n맥콜",
//			   item = "",
//			   result = "";
//	   int count = 0, 
//			   coca_cola = 2000, 
//			   pepsi = 1500, 
//			   mac_col = 1000,
//			   price = 0,
//			   money = 10000;
//	   System.out.println(message);
//	   item = sc.nextLine();
//	   count = sc.nextInt();
//	   
//	   int choseItemPrice = item.equals("코카콜라") ? coca_cola 
//			   :item.equals("팹시") ? pepsi 
//					   :item.equals("맥콜") ? mac_col : -1,
//							   cashBack = money - price; 
//	   
//	   price = count * choseItemPrice;
//	   
//	   result = "구매 상품 : %s %d개 \n개당 판매 가격 : %d원\n총 판매 가격 : %d원\n거스름돈 %d원";
//	   
//	   if(money >= price) {
//		   System.out.printf(result, item, count, choseItemPrice, price, cashBack);
//	   }else {
//		   System.out.println("가진 돈이 부족합니다.");
//	   }
	   Scanner sc = new Scanner(System.in);
	      int cocaColaPrice = 2000, pepsiPrice = 1500, mcColPrice = 1000, money = 10000,
	            choice = 0, stock = 0, totalPrice = 0;
	      
	      String coca = "코카콜라", pepsi = "팹시", mcCol = "맥콜", choiceDrink = "",
	            exampleMessage1 = "상품을 고르세요.\n1. 코카콜라\n2. 팹시\n3. 맥콜",
	            exampleMessage2 = "구매 수량을 입력하세요.\nex)10",
	            result = "구매상품: %s %d개\n"
	                  + "판매가격: %d원\n"
	                  + "거스름돈: %d원";
	      
	      System.out.println(exampleMessage1);
	      choice = sc.nextInt();
	      
	      System.out.println(exampleMessage2);
	      stock = sc.nextInt();
	      
	      if(choice == 1) {
	         choiceDrink = coca;
	         totalPrice = cocaColaPrice * stock;
	      }else if(choice == 2) {
	         choiceDrink = pepsi;
	         totalPrice = pepsiPrice * stock;
	      }else if(choice == 3) {
	         choiceDrink = mcCol;
	         totalPrice = mcColPrice * stock;
	      }else {
	         System.out.println("잘못 입력하셨습니다.");
	      }
	      
	      money -= totalPrice;
	      
	      System.out.printf(result, choiceDrink, stock, totalPrice, money);
   }
}

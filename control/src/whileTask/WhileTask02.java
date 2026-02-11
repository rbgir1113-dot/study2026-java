package whileTask;

import java.util.Scanner;

// 사용자에게 무한 입력 상태로 
// 입력 받은 모든 값의 합이 100 이상되면 프로그램이 종료된다.
// 그리고 입력 받은 모든 값은 순서대로 출력한다
// ex)
// 10
// 50
// 30
// -20
// 10
// 20

// 프로그램 종료
// 입력값: 10, 50, 30, -20, 10, 20
public class WhileTask02 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String message = "정수 값을 입력하세요\n누적 합이 100이상 되면 종료된다.",
    		  inputValues = "" ;
      int inputValue = 0, totalValue = 0;
      while(true) {
    	  System.out.println(message);
    	  inputValue = sc.nextInt();
    	  totalValue += inputValue;
    	  System.out.println(totalValue);
    	  if(inputValues.equals("")) {
    		  inputValues = "" + inputValue;
    	  }else {
    		  inputValues = inputValues + " , " + inputValue;
    	  }
    	  if(totalValue >= 100) {
    		  System.out.println("누적합 100이상이므로 프로그램 종료");
    		  break;
    	  }
      }
      System.out.println("입력한 값 : " + inputValues);
      System.out.println("총 결과 값 : " + totalValue);
   }
}

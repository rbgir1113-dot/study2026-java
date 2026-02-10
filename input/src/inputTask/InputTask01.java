package inputTask;

import java.util.Scanner;

public class InputTask01 {
   public static void main(String[] args) {
      // Scanner를 사용하여, 두 정수를 입력 받고,
      // 덧셈 결과를 출력하시오.
      // 단 next()만 사용
	   
	  Scanner sc = new Scanner(System.in);
	  String message = "두 정수를 입력하세요",
			  firstNum = null,
			  secondNum = null,
			  result = "%d + %d = %d";
	  
	  System.out.println(message);
	  
	  firstNum = sc.next();
	  secondNum = sc.next();
	  
	  int num_1 = Integer.parseInt(firstNum),
			  num_2 = Integer.parseInt(secondNum);
	  
	  int total = num_1 + num_2;
	  
	  System.out.printf(result, num_1, num_2 , total);
	  
	  
	  
			  
   }
}

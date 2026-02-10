package operTask;

import java.util.Scanner;

public class OperTask {
   public static void main(String[] args) {
      // 사용자에게 수학점수, 영어점수, 국어점수를 입력 받고,
      // 총점과 평균을 구한다.
      // 평균이 60점 초과면 합격, 60점 미만이면 불합격, 60점이면 재평가를 출력
      // 단 if문을 사용하지 않는다.
      // 평균은 소수점 2번째 자리까지만 표기한다.
      
//	   Scanner sc = new Scanner(System.in);
//	   
//	   int math = 0, kor = 0, eng = 0, total = 0;
//	   double avg = 0.0;
//	   
//	   String message = "이름과 점수를 입력하시오. \nex) 홍길동 20 30 40",
//			   name = null,
//			   result = "이름 : %s\n수학점수 : %d점\n국어점수 : %d점\n영어점수 : %d점\n총점 : %d점\n평균 : %.2f점\n결과 : %s입니다.",
//			   isPass = null;
//	   System.out.println(message);
//	   
//	   name = sc.next();
//	   math = sc.nextInt();
//	   kor = sc.nextInt();
//	   eng = sc.nextInt();
//	   
//	   total = math + kor + eng;
//	   avg = (double)total / 3;
//	   
//	   isPass = avg > 60 ? "합격" : avg < 60 ? "불합격" : "재평가";
//	   
//	   System.out.printf(result, name, math, kor, eng, total, avg, isPass);
	   Scanner sc = new Scanner(System.in);
	      String message = "수학, 영어, 국어 점수를 차례대로 입력하세요.\nex)70 80 80", result = "";
	      int mathScore = 0, engScore = 0, korScore = 0, totalScore = 0;
	      double average = 0.0;
	      System.out.println(message);
	      
	      mathScore = sc.nextInt();
	      engScore = sc.nextInt();
	      korScore = sc.nextInt();
	      
	      totalScore = mathScore + engScore + korScore;
	      average = totalScore / 3.0;
	      
	      result = average > 60 ? "합격" 
	            : average < 60 ? "불합격" : "재평가"; 
	      
	      System.out.println(result);
			   
   }
}

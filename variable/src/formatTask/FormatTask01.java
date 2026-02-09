package formatTask;

public class FormatTask01 {
	public static void main(String[] args) {
//		식을 완성시키시오 (format으로 출력하기)
//		10 + 20 = 30
//		7 * 8 = 56
//		6 * 4 = 24
		
		
		int numOfTen = 10;	
		int numOfTwenty = 20;
		int numOfSeven = 7;
		int numOfEight = 8;
		int numOfSix = 6;
		int numOfFour = 4;
		
		System.out.printf("%d + %d = %d\n" , numOfTen, numOfTwenty, numOfTen+numOfTwenty );
		System.out.printf("%d * %d = %d\n" , numOfSeven, numOfEight, numOfSeven*numOfEight );
		System.out.printf("%d * %d = %d\n" , numOfSix, numOfFour, numOfSix*numOfFour );
		
		int num1 = 10, num2 = 20, num3 = 7, num4 = 8, num5 = 6, num6 = 4;
	      String result1 = "%d + %d = %d\n", result2 = "%d * %d = %d\n";
	      
	      System.out.printf(result1, num1, num2, num1 + num2);
	      System.out.printf(result2, num3, num4, num3 * num4);
	      System.out.printf(result2, num5, num6, num5 * num6);
	}
}

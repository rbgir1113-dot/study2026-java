package lambdaTask4;

public class LambdaTask4 {
   public static void main(String[] args) {
//      1. 정수를 입력하면 정수에 해당하는 구구단을 출력해주는 람다
//      입력 예시)
//      3
//      출력 예시)
//      3 x 1 = 3
//      ...
//      3 x 9 = 27 
	   GuGuDan dan = (int num) -> {
		   String result = "";
		   for(int i = 0; i < 9; i++) {
			   result += num + " X " + (i+1) + " = " + num*(i+1) + "\n";
		   }
		   return result;
	   };
	   
	   System.out.println(dan.gugudan(5));
	   
//      2. 두 개의 정수와 연산자를 전달하면 식을 완성시켜주는 람다
//      입력 예시1)
//      10, 20, "+"
//      
//      출력 예시1)
//      30
      
//      입력 예시2)
//      10, 20, "-"
//      
//      출력 예시2)
//      -10
	   
	   Calc calc = (num1, num2, sign) -> {
		   int result = 0;
		 if(sign == "+") {
			 result = num1 + num2;
		 }else if (sign == "-") {
			 result = num1 - num2;
		 }
		 return result;
	   };
	   
	   System.out.println(calc.AddOrSubtract(10, 20, "+"));
	   
	   
//      3. 배열에 10개의 무작위 정수를 전달하면,
//      큰수부터(내림차순) 정렬하여 배열에 담아 리턴(반환)해주는 메서드
//      입력 예시)
//      {10, 3, 7, 8, 0, 9}
      
//      출력 예시)
//      {10, 9, 8, 7, 3, 0}
      
	   OrderBy sort = (arr) -> {
		   for(int i = 0; i< arr.length; i++) {
			   int maxIndex = i;
			   
			   for(int j = i+1; j < arr.length; j++) {
				   if(arr[j] > arr[maxIndex]) {
					   maxIndex = j;
				   }
			   }
			   int temp = arr[i];
			   arr[i] = arr[maxIndex];
			   arr[maxIndex] = temp;
			   
		   }
		   return arr;
	   };
	   
	   
	   int[] result = {10,3,7,8,9,0};
	   
	   result = sort.OrderBy(result);
	   for(int number : result) {
		   System.out.print(number + " ");
		   
	   }
	   
	   
	   
	   
	   
	   
	   
   }
}










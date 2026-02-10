package castingTask;

// 심화
public class CastingTask04 {
   public static void main(String[] args) {
//       (심화)      
//       "0.12346", "0.5130", "78", "9.133";
//      4개 값을 더해서 123456789를 출력하기
//	   double num_1 = Double.parseDouble("0.12346"), 
//			   num_2 = Double.parseDouble("0.5130"),
//			   num_3 = Double.parseDouble("9.133");
//	   
//	   int intNum_1 = (int)(num_1 * 100000) - 1,
//			   intNum_2 = (int)(num_2 * 10) + 1,
//			   intNum_3 = (int)num_3,
//	   
//	   String result_1 = String.valueOf(intNum_1),
//			   result_2 = String.valueOf(intNum_2),
//			   result_3 = "78",
//			   result_4 = String.valueOf(intNum_3),
//			   totalResult = "%s%s%s%s\n",
//	   			
//	   System.out.printf(totalResult, result_1,result_2,result_3,result_4);
//	   
//	   
	   String data1 = "0.12346", data2 = "0.5130", data3 = "78", data4 = "9.133", 
	            numResult = "", result = "정답: %s";
	      int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
	      double double1 = 0.0, double2 = 0.0, double3 = 0.0;
	      
	      double1 = Double.parseDouble(data1);
	      double2 = Double.parseDouble(data2);
	      double3 = Double.parseDouble(data4);
	      
	      num1 = (int)(double1 * 10000);
	      num2 = (int)(double2 * 10);
	      num3 = (int)((Double.parseDouble(data1) + Double.parseDouble(data2)) * 10);
	      num3 = data1.indexOf("6");
	      num4 = Integer.parseInt(data3);
	      num5 = (int)double3;
	      
	      numResult = "" + num1 + num2 + num3 + num4 + num5;
	      System.out.printf(result, numResult);
   }
}

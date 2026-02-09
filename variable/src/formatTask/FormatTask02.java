package formatTask;

public class FormatTask02 {
	public static void main(String[] args) {
//		%자릿수d
//		%5d
		
//		국어점수, 영어점수, 수학점수를 받아서 서식에 맞게 출력
		
//		이름 : 
//		수학 : 20점
//		국어 : 40점
//		영어 : 15점
//		총점 : 115점
		
//		int math = 20, kor = 40, eng = 15;
//		String name = "김세학",
//				resultName = "이름 : %5s\n",
//				resultMath = "수학 : %5d점\n",
//				resultKor = "국어 : %5d점\n",
//				resultEng = "영어 : %5d점\n",
//				resultTotal = "총점 : %5d점\n",
//				resultAvg = "평균 : %5d점\n";
//		
//		System.out.printf(resultName, name);
//		System.out.printf(resultMath, math);
//		System.out.printf(resultKor, kor);
//		System.out.printf(resultEng, eng);
//		System.out.printf(resultTotal, math+kor+eng);
//		System.out.printf(resultAvg, (math+kor+eng)/3);
	
		int mathScore = 0, korScore = 0, engScore = 0, totalScore = 0;
	      String name = "",
	            kor = "국어:", 
	            eng = "영어:", 
	            math = "수학:", 
	            score = "%6d점\n",
	            total = "총점:",
	            nameResult = "이름: %5s\n",
	            korResult = kor + score,
	            engResult = eng + score,
	            mathResult = math + score,
	            totalResult = total + score,
	            result = nameResult + mathResult + korResult + engResult + totalResult;
	      
	      name = "이규학";
	      mathScore = 20;
	      korScore = 15;
	      engScore = 10;
	      totalScore = mathScore + korScore + engScore;
	      
	      System.out.printf(result, name, mathScore, korScore, engScore, totalScore);
	      
	}
}

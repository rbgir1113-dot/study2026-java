package castingTask;

public class CastingTask03 {
	public static void main(String[] args) {
//		'a','j','k'를 연산하여 'A','J','K' 출력하기
//		
		
		int diff = (int)'a' - (int)'A';
		
		char char_a = 'a',
				char_j = 'j', 
				char_k = 'k';
		
		int result_1 = (int)char_a - diff, 
				result_2 = (int)char_j - diff,
				result_3 = (int)char_k - diff;
		
		String result = "%c - %d = %d -> %c\n";
		
		char result_A = (char)result_1,
				result_J = (char)result_2,
				result_K = (char)result_3;
		
		System.out.printf(result, char_a, diff, result_1, result_A);
		System.out.printf(result, char_j, diff, result_2, result_J);
		System.out.printf(result, char_k, diff, result_3, result_K);
	}
}

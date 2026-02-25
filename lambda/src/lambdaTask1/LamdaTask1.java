package lambdaTask1;

public class LamdaTask1 {
   public static void main(String[] args) {
//      1~10까지 출력해주는 메서드
	   Repetition rep = (num) -> {
		   String result = "";
		   for(int i = 0; i< num; i++) {
			  result += (i + 1) + " ";
	   }
		   return result;
	   };
	   
	   System.out.println(rep.repetition(10));

//      문자열, 문자형, 인덱스를 전달하면 해당 인덱스에 값을 전달한 문자형으로 바꿔주는 메서드 
	   Modify modify = (content, c, index) -> {
		   String result = "";
		   char[] chars = content.toCharArray();
		   for(int i= 0; i< chars.length; i++) {
			   if(index == i) {
				   result += c;
			   }else {
				   result += chars[i];
			   }
		   }
		   return result;
	   };
   
	   System.out.println(modify.replace("abcd", 'A', 0));
	   
   
   
   
   
   
   }
}

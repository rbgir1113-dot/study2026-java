package hashSet.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest2 {
	public static void main(String[] args) {
		HashSet<String> mbtiType = new HashSet<String>();
		
		mbtiType.add("ESTJ");
		mbtiType.add("ISTJ");
		mbtiType.add("ESTJ");
		mbtiType.add("ISTJ");
		mbtiType.add("ISTP");
		mbtiType.add("ISTP");
		mbtiType.add("INFJ");
		mbtiType.add("ESFP");
		mbtiType.add("ENFJ");
		mbtiType.add("ENTJ");
		mbtiType.add("ISTp");
		
//		System.out.println(mbtiType);
		
//		문법 or iterator
//		빠른 for문으로 순회하면서 출력한다. 빠른 for문 -> 향상된 for문
//		for(String mbti : mbtiType) {
//			System.out.println(mbti);
//		}
//		
		
//		순서가 없을 때 순서를 붙여주는 인터페이스
		Iterator<String> iter = mbtiType.iterator();
		
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//			
//			iter.next(); // 이렇게 자용 불가
//		}
		
//		while(iter.hasNext()) {
//			String mbti = iter.next(); // -> 이렇게는 사용가능
//			System.out.println(mbti);
//			
//		}
		
//		ESTJ를 출력 할때 방법
//		while(iter.hasNext()) {
//			String mbti = iter.next();
//			if(mbti.equals("ESTJ")) {
//				System.out.println(mbti);
//				
//			}
//		}
			
//	      중복된 데이터 삭제 
		      ArrayList<Integer> datas =new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 10, 20, 30, 40));
		      datas = new ArrayList<Integer>(new HashSet<Integer>(datas));
		      System.out.println(datas);
			
			
			
			
			
		
		
	}
}

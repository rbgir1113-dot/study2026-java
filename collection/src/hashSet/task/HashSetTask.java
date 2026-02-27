package hashSet.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTask {
   public static void main(String[] args) {
//      "banana", "apple", "orange", "apple", "banana"
//      문자열 ArrayList가 존재할 때 중복이 되지 않는 글자만 연결하여 출력하기
//      ex) 출력 결과: banpleorg
      
      ArrayList<String> datas = new ArrayList<String>(Arrays.asList("banana", "apple", "orange", "apple", "banana"));
      System.out.println(datas);
      
//      for(String data : datas) {
//		  System.out.println(data.charAt(1));
//    		  
//    	  }
//    	  
//      }
//      Iterator<String> iter = datas.iterator();
//      
//      while(iter.hasNext()) {
//    	  	String data = iter.next();
//    	  	for(int i = 0; i < data.length(); i++) {
//    	  		char c = data.charAt(i);
//    	  		ArrayList<String> result =new ArrayList<String>(Arrays.asList(data));
//    	  		result = new ArrayList<String>(new HashSet<String>(result));
//    	  		System.out.println(result);
//    	  	}
//      }
      
      Dedupe dedupe = (expression) -> {
    	  HashSet<String> dedupeHashSet = new HashSet<String>(expression);
    	  HashSet<Character> charHashSet = new HashSet<Character>();
    	  String result = "";
    	  
    	  for(String str : dedupeHashSet) {
    		  for(char c : str.toCharArray()) {
    			  charHashSet.add(c);
    		  }
    	  }
    	  
    	  
    	  
    	  for(char c : charHashSet) {
    		  result += c;
    	  }
    	  
    	  return null;
      };
      
      String result = dedupe.dedupe(datas);
      System.out.println(result);
      
      
      
      
      
      
      
      
      
      
      
      }
   
  }

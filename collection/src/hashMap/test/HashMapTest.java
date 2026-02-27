package hashMap.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public interface HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("name", "홍길동");
		userMap.put("age", 20);
		userMap.put("address", "서울시 강남구");
		userMap.put("name", "김길동"); // 중복 사용시 전에 썼던 값에 덮어쓰기가 됨

		System.out.println(userMap); // 순서가 없음
		
//		userMap.get("name") -> return 값
		System.out.println(userMap.get("name"));
		
		System.out.println(userMap.size()); // 중복 값이 있어도 크기는 제외 됨
		
//		향상된 for 문 (빠른 for 문) 사용 불가
//		for(Object user : userMap) {
//			System.out.println(user);
//		}
		
		
//		HashSet
//		.iterator()
		Set<String> keys = userMap.keySet(); // key 만 나옴
		Set<Entry<String, Object>> users = userMap.entrySet(); // key: value로 나옴 (순서가 없음)
		
		Iterator<Entry<String, Object>> userIter = userMap.entrySet().iterator(); // key: value로 나옴
		
		System.out.println(keys);
		
		System.out.println(users);

		while(userIter.hasNext()) {
			Entry<String, Object> userData = userIter.next();
//			System.out.println(userData);
			

			
			
//			이름을 들고 옴
			
			if(userData.getKey().equals("name")) {
				System.out.println(userData.getValue());
			}
		}
		
		
	}
}

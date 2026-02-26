package arrayListTest;

import java.util.ArrayList;

public class ArrayListTask1 {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();
		
		for(int i = 0; i< 10; i++) {
			datas.add((i+1) * 10);
		}
		
		
		if(datas.contains(50)) {
			datas.add(datas.indexOf(50)+1, 500);
		}
		
		if(datas.contains(80)) {
			datas.remove(datas.indexOf(80));
		}

		
			
		try {
			if(datas.contains(60)) {
//			Wrapper Class
//				datas.remove(Integer.valueOf(60)); // -> int -> Integer 로 업캐스팅 함
				datas.remove(60); 
			}
			
			
			System.out.println(datas);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스 범위 초과");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}

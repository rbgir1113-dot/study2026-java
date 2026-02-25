package anonymousTest;

public class AnonymousTest {

	
	public static void main(String[] args) {
		
		
//		익명 내부 클래스 (new Study() == 생성자 그 뒤에 이름이 없음)
//		객체화 시킨 것
//		1회성 사용
		Study study = new Study() {
			
			@Override
			public void setTopic(String topic) {
				System.out.println("주제: " + topic );
			}
		};
		study.setTopic("화학");
	}
	
	
}

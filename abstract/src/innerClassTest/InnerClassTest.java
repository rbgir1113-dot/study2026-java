package innerClassTest;

public class InnerClassTest {
	
	class InnerClass {
		int value;
		{
			this.value = 20;
		}

		public InnerClass() {;}
		public InnerClass(int value) {
			this.value = value;
		
		}
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		public void printValue() {
			System.out.println(this.getValue());
		}
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		InnerClassTest it = new InnerClassTest();
		InnerClass in = it.new InnerClass();
//		InnerClassTest.InnerClass inner = new InnerClassTest().new InnerClass();  == 위 코드와 같은 뜻	
		
		in.printValue(); // 이래야 내부 클래스에 코드를 사용 가능
		
	}
}

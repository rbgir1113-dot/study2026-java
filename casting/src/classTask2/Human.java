//package classTask2;
//
//public class Human extends Monster{
//	public int level;
//
//	public Human() {;}
//	public Human(int level) {
//		this.level = level;
//	}
//
//
//
//	{
//		level = 70;
//	}
//	
//	
//	public void gainItem() {
//		System.out.println("강제로 갑옷을 약탈했습니다.");
//	}
//	
//	public void action() {
//		System.out.println("인간이 숨습니다\n");
//	}
//}
package classTask2;

public class Human extends Monster {
   public Human() {;}
   
   @Override
   public void dropItem() {
      System.out.println("갑옷을 떨군다.");
   }
   
   public void hidding() {
      System.out.println("휴먼이 숨는다");
   }
}



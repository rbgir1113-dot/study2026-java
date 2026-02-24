//package classTask2;
//
//public class Orc extends Monster{
//	public int level;
//	
//	
//	public Orc() {;}
//	public Orc(int level) {
//		this.level = level;
//	}
//
//	{
//		level = 30;
//	}
//	
//	public void gainItem() {
//		System.out.println("가르친 예절 대가로 가죽을 얻었습니다.");
//	}
//	
//	public void action() {
//		System.out.println("오크가 달려듭니다.\n");
//	}
//}
package classTask2;

public class Orc extends Monster {
   public Orc() {;}
   
   @Override
   public void dropItem() {
      System.out.println("가죽을 떨군다.");
   }
   
   public void attack() {
      System.out.println("오크가 달려든다");
   }
}

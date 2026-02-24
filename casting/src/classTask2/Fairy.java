//package classTask2;
//
//public class Fairy extends Monster{
//	public int level;
//	
//	
//	public Fairy() {;}
//	public Fairy(int level) {
//		this.level = level;
//	}
//
//	{
//		level = 50;
//	}
//	
//	
//	public void gainItem() {
//		System.out.println("교육 해준 대가로 날개를 얻었습니다.");
//	}
//
//	public void action() {
//		System.out.println("요정이 마법을 사용합니다\n");
//	}
//}
package classTask2;

public class Fairy extends Monster {
   public Fairy() {;}
   
   @Override
   public void dropItem() {
      System.out.println("날개를 떨군다.");
   }
   
   public void magicAttact() {
      System.out.println("마법으로 공격한다.");
   }
}

//package classTask2;
//
//public class Character {
//	
//	public void huntMonster(Monster monster) {
//		if(monster instanceof Orc) {
//			Orc orc = (Orc)monster;
//			orc.action();
//			System.out.println("오크한테 예절을 가르쳐줍니다.\n");
//			orc.gainItem();
//			
//		}else if(monster instanceof Fairy) {
//			Fairy fairy = (Fairy)monster;
//			fairy.action();
//			System.out.println("마법을 쓴 요정을 교육해줍니다.\n");
//			fairy.gainItem();
//			
//		}else if(monster instanceof Human) {
//			Human human = (Human)monster;
//			human.action();
//			System.out.println("숨은 인간을 때립니다.\n");
//			human.gainItem();
//		}
//	
//	}
//	
//	}
package classTask2;

public class Character {
//   이름, 레벨, 체력, 직업
   private String name;
   private int level;
   private int hp;
   private String job;
   
   {
      this.hp = 10;
      this.level = 1;
   }
   
//   기본 생성자, 초기화 생성자
   public Character() {;}
   public Character(String name, String job) {
      this.name = name;
      this.job = job;
   }
   
//   getter, setter
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getLevel() {
      return level;
   }
   public void setLevel(int level) {
      this.level = level;
   }
   public int getHp() {
      return hp;
   }
   public void setHp(int hp) {
      this.hp = hp;
   }
   public String getJob() {
      return job;
   }
   public void setJob(String job) {
      this.job = job;
   }
   
//   사냥 메서드
   public void hunt(Monster monster) {
      monster.dropItem();
      
       if(monster instanceof Orc) {
          Orc orc = (Orc)monster;
          orc.attack();
       }else if(monster instanceof Fairy) {
          Fairy fairy = (Fairy)monster;
          fairy.magicAttact();
       }else if(monster instanceof Human) {
          Human human = (Human)monster;
          human.hidding();
       }
   }
}













//package classTask2;
//
//import java.util.Scanner;
//
//public class ClassTask2 {
//
////   게임 시스템
////   캐릭터는 몬스터를 사냥할 수 있다.
//	
////   몬스터
////   오크, 요정, 휴먼
////   오크를 사냥하면 
////   "오크가 달려든다!"를 출력 +@
////   "가죽 얻는다"를 출력
//   
////   요정을 사냥하면
////   "요정이 마법을 사용한다"를 출력 +@
////   "날개를 얻는다"를 출력
//   
////   휴먼을 사냥하면
////   "휴먼이 숨는다"를 출력 +@
////   "갑옷을 얻는다"를 출력
//	
//	public static void main(String[] args) {
//		Character character = new Character();
//		Scanner sc = new Scanner(System.in);
////		이름, 직업 선택
//		String message1 = "닉네임을 작성해주세요.\nex)타락파워전사",
//		message2 = "직업을 선택해주세요.\nex)1. 전사 2. 마법사 3. 모험가",
//				name = "", job = "", place = "";
//
//		int choiceJob = 0, choicePlace = 0;
//		
//		System.out.println(message1);
//		
//		name = sc.nextLine();
//		System.out.println("==========================");
//		System.out.println(name + "님\n" + message2);
//		choiceJob = sc.nextInt();
//		
//		switch(choiceJob) {
//		case 1 :
//			System.out.println("전사 선택");
//			job = "전사";
//			break;
//			
//		case 2 : 
//			System.out.println("마법사 선택");
//			job = "마법사";
//			break;
//			
//		case 3 : 
//			System.out.println("모험가 선택");
//			job = "모험가";
//			break;
//			
//		default :
//			System.out.println("잘못 선택하였습니다.");
//			break;
//		}
//		
////		사냥터 분류 작업
//		System.out.println("==========================");
//		System.out.println("이름 : " +name + "\n직업 : "+ job +"\n어떤 몬스터를 사냥할까요?\nex) 1. 오크 2. 요정 3. 인간");
//	
//		choicePlace = sc.nextInt();
//		switch(choicePlace) {
//		case 1 :
//			place = "오크";
//			break;
//			
//		case 2 : 
//			place = "요정";
//			break;
//			
//		case 3 : 
//			place = "인간";
//			break;
//			
//		default :
//			System.out.println("잘못 선택하였습니다.");
//			break;
//		}
//		System.out.println(place + "을(를) 사냥합니다");
//		
//		
//		if(place == "오크") {
//			System.out.println("==========================");
//			character.huntMonster(new Orc());
//		}else if(place == "요정") {
//			System.out.println("==========================");
//			character.huntMonster(new Fairy());
//		}else if(place == "인간") {
//			System.out.println("==========================");
//			character.huntMonster(new Human());
//		}
//		
//}
//}
package classTask2;

public class ClassTask2 {

//   게임 시스템
//   캐릭터는 몬스터를 사냥할 수 있다.
//  몬스터
//   오크, 요정, 휴먼
//   오크를 사냥하면 
//   "오크가 달려든다!"를 출력 +@
//   "가죽 얻는다"를 출력
   
//   요정을 사냥하면
//   "요정이 마법을 사용한다"를 출력 +@
//   "날개를 얻는다"를 출력
   
//   휴먼을 사냥하면
//   "휴먼이 숨는다"를 출력 +@
//   "갑옷을 얻는다"를 출력
   public static void main(String[] args) {
      Character hgd = new Character("홍길동", "도적");
      Monster[] monsters = {new Fairy(), new Orc(), new Human()};
      
      for(Monster monster: monsters) {
         hgd.hunt(monster);
      }
      
   }
   
}

















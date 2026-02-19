package classTask;

// 1. 스포츠(Sports) 추상화
// 2. 농구(BasketBall), 야구(BaseBall), 축구(Soccer) 객체 
// 3. 기본 생성자, 초기화 생성자 생성 후 초기화

class Sports{
	int player;
	String ball;
	int playtime;

	public Sports() {;}
	
//	초기화 생성자 
//	단축키 shift + alt + s -> alt + o
	public Sports(int player, String ball, int playtime) { 
		this.player=player;
		this.ball = ball;
		this.playtime = playtime;

	}


}

public class ClassTask {
	public static void main(String[] args) {
		Sports basketBall = new Sports(5, "농구공", 40);
		Sports baseBall = new Sports(9, "야구공", 180);
		Sports soccer = new Sports(11, "축구공", 90);

		System.out.println(basketBall.ball);
		System.out.println(baseBall.player + "명");
		System.out.println(soccer.playtime + "분");
	}
}

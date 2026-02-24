package inheritanceTask;

// 10분
class AA {
   public void paint() {
      System.out.print("A");
      draw();
   }
   public void draw() {
      System.out.print("B");
   }
   
}

class BB extends AA {
   public void paint() {
      super.draw();		// B
      System.out.print("C"); // C
      this.draw();		//D
   }
   public void draw() {
      System.out.print("D"); //D
   }
}

public class InheritanceTask2 {
   public static void main(String[] args) {
      BB b = new BB(); // 객체화
//      b 자식
      b.paint(); //BCD
      b.draw();	// D
      
//    print 이므로 결과는 -> BCDD
   }
   }
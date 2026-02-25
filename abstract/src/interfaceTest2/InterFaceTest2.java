package interfaceTest2;



public class InterFaceTest2 {
	public void checkAnimal(Animal animal) {
		if(animal instanceof HerbivoreMarker) {
			this.feedHerbivore((HerbivoreMarker)animal);
		}else if(animal instanceof CarnivoreMarker) {
			this.feedCarnivore((CarnivoreMarker)animal);
		}
	}
	
	public void feedCarnivore(CarnivoreMarker canivore) {
		System.out.println("고기를 던짐");
	}
	
	public void feedHerbivore(HerbivoreMarker hervivore) {
		System.out.println("채소를 던짐");
	}


	public static void main(String[] args) {
		InterFaceTest2 lab = new InterFaceTest2();
		

		Bear bear = new Bear();
		Deer deer = new Deer();
		
		lab.checkAnimal(deer);
		lab.checkAnimal(bear);
		
	}


}



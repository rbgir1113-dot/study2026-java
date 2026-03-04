package streamTask;

import java.util.Objects;

public class Fruit {
	private String fruit;
	
	public Fruit() {;}

	public Fruit(String fruit) {
		super();
		this.fruit = fruit;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fruit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(fruit, other.fruit);
	}

	@Override
	public String toString() {
		return "Fruit [fruit=" + fruit + "]";
	}
	
}

package streamTask;

import java.util.Objects;

public class ColorText {
	private String color;
	
	public ColorText() {;}
	public ColorText(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "ColorText [color=" + color + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ColorText other = (ColorText) obj;
		return Objects.equals(color, other.color);
	}
	
}

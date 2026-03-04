package streamTask;

import java.util.Objects;

public class ChangeNumText {
	private String num;
	
	public ChangeNumText() {;}
	public ChangeNumText(String num) {
		this.num = num;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "ChangeNumText [num=" + num + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(num);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChangeNumText other = (ChangeNumText) obj;
		return Objects.equals(num, other.num);
	}
	
}

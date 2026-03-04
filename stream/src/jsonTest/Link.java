package jsonTest;

import java.util.Objects;

public class Link {
	private String link;
	
	public Link() {;}
	public Link(String link) {
		this.link = link;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	@Override
	public String toString() {
		return "Link [link=" + link + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(link);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Link other = (Link) obj;
		return Objects.equals(link, other.link);
	}
	

	
}

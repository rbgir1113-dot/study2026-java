package jsonTest;

import java.util.ArrayList;
import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonTask {
	
	public static String addRoot(String link) {
		return "/app" + link;
	}
	
   public static void main(String[] args) {
//      "/news", "/game", "/brand", "/rank"
//      위 4개 경로를 모두 ArrayList에 추가하고,
//      경로 앞에 "/app"을 붙인 뒤
//      JSONArray로 변경하기

	   ArrayList<Link> links = new ArrayList<Link>(
			   Arrays.asList(
					   new Link("/news"),
					   new Link("/game"),
					   new Link("/brand"),
					   new Link("/rank")
					   ));
	   
	   JSONArray linksJSON = new JSONArray();
	   
//	   links
//	   	.stream()
//	   	.map(link -> {
//	   		link.setLink(addRoot)
//	   	})
//	   	.map(JSONObject::new)
//	   	.
//	   
//	   System.out.println(linksJSON);
	   
	   
	   
	   
   }
}

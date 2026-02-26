package sms;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class SmsTest {
   public static void main(String[] args) {
      String api_key = "NCSMX5RUW6ELKOX6";
      String api_secret = "A3GEYLJQDCSI2FGXGTIJZRFWNQHT5MEG";
      Message coolsms = new Message(api_key, api_secret);
      
      // 4 params(to, from, type, text) are mandatory. must be filled
      HashMap<String, String> params = new HashMap<String, String>();
      params.put("to", "01063076244");
      params.put("from", "01035059904");
      params.put("type", "SMS");
      params.put("text", "친구비를 입금해주세요"
    		  + "우리은행 1002460279552" 
    		  + "미입금시 버스터콜 갑니다.");
      params.put("app_version", "text app 1.2"); // application name and version

      try {
         JSONObject obj = (JSONObject) coolsms.send(params);
         System.out.println(obj.toString());
      } catch (CoolsmsException e) { 
         System.out.println(e.getMessage());
         System.out.println(e.getCode());
      }
      
   }
}

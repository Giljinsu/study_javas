import java.util.Map;

import com.google.gson.Gson;

import beans.MemberBean;

public class ConvertJsonWithGson {
    //문자열 Json
    public static void main(String[] args) {
        // 문자열 Json -> Map
        Gson gson = new Gson();
        String jsonStr = "{id: 1, name: jinsu, habits: [fitness,reading, game]}";
        Map jsonMap = gson.fromJson(jsonStr, Map.class); //자기가 바꾸려는 형태 Map.class를 넣음
        
        // Map -> 문자열 Json
        String mapStr = gson.toJson(jsonMap);
        
        // 문자열 Json -> Object(bean, model, vo)
        String jsonStrBean = "{firstName: gil, secondName: jin, handleName:su}";
        MemberBean bean = gson.fromJson(jsonStrBean, MemberBean.class);
        
        // Object Json -> 문자열 Json
        String memberBeanStr = gson.toJson(bean);
        System.out.println(memberBeanStr);
        int i = 9;
    }
}

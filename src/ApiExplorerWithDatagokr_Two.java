import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class ApiExplorerWithDatagokr_Two {
    public static void main(String[] args) throws UnsupportedEncodingException {
 
        /*
        https://apis.data.go.kr/1741000/TsunamiShelter3/getTsunamiShelter1List
        ?serviceKey=g%2FF2l2m%2FAvNycT8bXjhCgioX0PwrxgQAzt5gL3DFxLBXzwpTXyHZ%2FyFZqGy7OH14DFXaHvf0PN5PD92Nu8IV8A%3D%3D
        &pageNo=1
        &numOfRows=10
        &type=xml
        */

        
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1741000/TsunamiShelter3/getTsunamiShelter1List");
        // https로 보내면 javax.net.ssl.SSLHandshakeException 발생
        // 2. 오픈 API의요청 규격에 맞는 파라미터 생성, 발급받은 인증키.
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=").append("g%2FF2l2m%2FAvNycT8bXjhCgioX0PwrxgQAzt5gL3DFxLBXzwpTXyHZ%2FyFZqGy7OH14DFXaHvf0PN5PD92Nu8IV8A%3D%3D");
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8"));
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8"));
        urlBuilder.append("&" + URLEncoder.encode("type","UTF-8") + "=" + URLEncoder.encode("xml", "UTF-8")); 

        
        URL url;
        HttpURLConnection connection=null;
        try {
            url = new URL(urlBuilder.toString());
            connection =  (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("GET");
            // connection.setRequestProperty(null, null);
            System.out.println("Response code : "+connection.getResponseCode());

            BufferedReader reader;
            if(connection.getResponseCode()>= 200 && connection.getResponseCode() <=300) { // 보통 코드가 200~ 300 사이면 정상이다
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            } else { // 비정상
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
            }

            StringBuffer stringBuffer = new StringBuffer(); 
            String line = "";
            while((line = reader.readLine()) != null) {
                stringBuffer.append(line);
            }
            int i =1;
            reader.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            connection.disconnect();
        }
    }    
}

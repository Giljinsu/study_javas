package test;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Atest {

    public ArrayList<HashMap<String,Object>>  getRows(){
        String url = "jdbc:oracle:thin:@192.168.10.3:1521:xe​";
        String user = "kh";
        String password = "*kh!";

        Statement statement = null;
        HashMap<String, Object> hashMap = new HashMap<>();
        ArrayList<HashMap<String,Object>> arrayList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            String query = "SELECT * FROM TEST";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()) {
                hashMap.put("SEQ", resultSet.getInt("SEQ"));
                hashMap.put("WRITER", resultSet.getString("WRITER"));
                hashMap.put("TITLE", resultSet.getString("TITLE"));
                hashMap.put("CONTENT", resultSet.getString("CONTENT"));
                hashMap.put("REGDATE", resultSet.getString("REGDATE"));
                arrayList.add(hashMap);
            }
            

        } catch (SQLException e) {

            e.printStackTrace();

        }
        return arrayList;

    }
}

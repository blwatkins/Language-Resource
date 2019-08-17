// Testing JSON Parser

import org.json.*;

public class JSONTest {

    public static void main(String[] args) {
        String j1 = "{\"id\": 1, \"name\": \"Bob\"}";
        String j2 = "{\"id\": 2, \"name\": \"Bill\"}";
        parseJSON(j1);
        parseJSON(j2);
    }

    public static void parseJSON(String jsonString) {

        try {
            JSONObject json = new JSONObject(jsonString);
            int id = json.getInt("id");
            String name = json.getString("name");
            System.out.println("ID: " + id + ", Name: " + name);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
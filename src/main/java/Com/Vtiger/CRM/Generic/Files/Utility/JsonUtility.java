package Com.Vtiger.CRM.Generic.Files.Utility;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JsonUtility {
    public String getDataFromJSON(String Key) throws ParseException, IOException {
        FileReader file=new FileReader("src/main/resources/CommonData.JSON");
        JSONParser parser=new JSONParser();
       Object obj= parser.parse(file);
        JSONObject JsonObj=(JSONObject) obj;
        return JsonObj.get(Key).toString();
    }
}

package Com.Vtiger.CRM.Generic.Files.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
    public String getDataFromPropertiesFile(String Key) throws IOException {
        FileInputStream Data = new FileInputStream("src/main/resources/Vtiger_Resource/CommonData.properties");
        Properties properties = new Properties();
        properties.load(Data);
        return properties.getProperty(Key);
    }

}

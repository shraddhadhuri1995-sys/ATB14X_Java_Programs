package ex_37_CollectionFramework.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab290_Hashmap_Real_Example {
    public static void main(String[] args) {
        Map<String,String> envConfig=new HashMap<String,String>();
        envConfig.put("Production","https://prod.api.com");
        envConfig.put("Staging","https://stg.api.com");
        envConfig.put("Dev","https://dev.api.com");
        System.out.println(envConfig);

        Map<String,String> UserCredentials=new HashMap<String,String>();
        UserCredentials.put("Username","admin");
        UserCredentials.put("Password","admin");
        UserCredentials.put(null,"admin1");
        UserCredentials.put("Password1",null);
        System.out.println(UserCredentials);

    }
}

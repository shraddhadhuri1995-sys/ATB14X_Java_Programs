package ex_33_ENUM;

public class Lab237_Enum_Real_Automation_Example2 {
    public static void main(String[] args) {
        System.out.println(Environment.PROD.getBaseUrl());
        System.out.println(Environment.DEV.getBaseUrl());
    }
}

enum Environment{
    DEV("https://www.dev.myapps.com"),
    STAGE("https://www.stg.myapps.com"),
    PROD("https://www.prod.myapps.com");

    private final String baseUrl;

    public String getBaseUrl() {
        return baseUrl;
    }

        Environment(String baseUrl) {
            this.baseUrl = baseUrl;
        }
}




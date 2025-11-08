package ex_33_ENUM;

public class Lab236_Enum_Real_Automation_Example {
    public static void main(String[] args) {
        System.out.println(Locators.page_input_email.getLocator());
    }
}


enum Locators{
    page_input_email("//*[@id=\"login-username\"]"),
    page_input_password("//*[@id=\"login-password\"]"),
    page_input_button("//*[@id=\"btn\"]");


    private String locator;

    Locators(String locator) {
        this.locator = locator;
    }

    public String getLocator() {
        return locator;
    }

}

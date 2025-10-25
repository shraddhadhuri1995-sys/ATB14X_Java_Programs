package ex_22_Polymorphism_MethodOverloading;

public class Lab192_WebUIAutomation {
    public static void main(String[] args) {
        Browser b1=new Browser();
        b1.startBrowser();
        b1.startBrowser("chrome");
    }
}


class Browser
{
void startBrowser()
{
    System.out.println("Default browser started");
}

void startBrowser(String browser)
{
    System.out.println("Starting Browser"+browser);
}
}

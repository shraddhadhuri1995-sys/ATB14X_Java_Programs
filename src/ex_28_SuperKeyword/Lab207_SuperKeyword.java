package ex_28_SuperKeyword;

public class Lab207_SuperKeyword {
    public static void main(String[] args) {

    }
}


class baseClass
{

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    private String browser;

baseClass()
{
    System.out.println("DC-default Constructor");
}

baseClass(String browser)
{
    this.browser=browser;
    System.out.println("Parameterized Constructor");
}

void OpenBrowser()
{
    System.out.println("Opening browser");
}

void openBrowser(String browserName)
{
    System.out.println("Opening browser"+browserName);
}

void closeBrowser()
{
    System.out.println("Closing Browser");
}
}

class testCase extends baseClass{

    void test()
    {

    }

    testCase()
    {
       // super();
        super("chrome");
        super.openBrowser("chrome");
        super.OpenBrowser();
        super.closeBrowser();
        System.out.println(super.getBrowser());
        super.setBrowser("firefox");
    }
}
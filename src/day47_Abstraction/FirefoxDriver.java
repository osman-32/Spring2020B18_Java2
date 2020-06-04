package day47_Abstraction;

public class FirefoxDriver extends RemoteWebDriver {
    String URL="https://www.google.com";

    @Override
    public void get(String URL) {
        System.out.println("Opening "+URL+" in Firefox browser");
    }

    @Override
    public void quit() {
        System.out.println("Closing the Firefox browser");
    }
}

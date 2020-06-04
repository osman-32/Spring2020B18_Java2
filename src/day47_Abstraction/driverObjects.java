package day47_Abstraction;


public class driverObjects {
    public static void main(String[] args) {
        String URL= "https://www.google.com";
        ChromeDriver driver=new ChromeDriver();
        driver.get(URL);
        driver.quit();

        FirefoxDriver driver1= new FirefoxDriver();
        driver1.get(URL);
        driver1.quit();

        OperaDriver driver2=new OperaDriver();
        driver2.get(URL);
        driver2.quit();



    }
}

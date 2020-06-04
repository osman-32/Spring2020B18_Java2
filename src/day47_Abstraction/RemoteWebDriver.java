package day47_Abstraction;

public abstract class RemoteWebDriver {
    public abstract void get(String URL); // abstract method cannot be private, static, final.
                                          // There is no way to override these three kinds of methods

    public abstract void quit();
}

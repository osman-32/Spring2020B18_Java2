package day42_inheritance;

public class Data {
    public static String publicData="public";
    protected static String protectedData="protected";
    static String defaultData="default";
    private static String privateData="private";
}

class testing extends Data{
    /*
    public, defauld, and protected datum can be inherited, but private never be inherited
     */
    public static void main(String[] args) {
        System.out.println(TestData.publicData);
        System.out.println(TestData.protectedData);
        System.out.println(TestData.defaultData);
        //System.out.println(TestData.privateData);
    }
}

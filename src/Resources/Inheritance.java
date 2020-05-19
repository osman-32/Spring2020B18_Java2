package Resources;

import day42_inheritance.Data;
import day42_inheritance.TestData;

public class Inheritance extends Data {
    /*
    public: accessible at everywhere, visible to the world
    protected: visible in same package, visible in sub class outside package
    default: only visible in the same package
    private: only visible within the same class
     */

    public static void main(String[] args) {
        System.out.println(TestData.publicData);
        System.out.println(TestData.protectedData);
        //System.out.println(TestData.defaultData);
        // System.out.println(TestData.privateData);
    }
}

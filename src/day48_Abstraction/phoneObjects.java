package day48_Abstraction;

public class phoneObjects {
    public static void main(String[] args) {
        iPhone iPhone1=new iPhone("X",1000,"10 inches");
        System.out.println(iPhone1);
        iPhone iPhone2=new iPhone("9",900,"8 inches");
        System.out.println(iPhone2);

        iPhone1.faceTiming(4_843_406);
        iPhone2.texting(223423);
        iPhone2.calling(832322);

        System.out.println("===================================================");

        Samsung samsung1=new Samsung("Note10 Plus", 1200, "Large");

        System.out.println(samsung1);

        samsung1.calling(23534);

    }
}

package day02_Variables;

public class EscapeSquences {
    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println("\tHello!");
        System.out.println("\t\tHello!");
        System.out.println("\t\t\tHello!"); //\t means a tab space.

        System.out.println("\nCybertek School");
        System.out.println("\nCybertek \nSchool");
        System.out.println("\nMy\nname\nis\nOsman"); //\n means a new line, start with a new line.

        //print My favorite tv show is "Game of Thrones".
        System.out.println("\nMy favorite tv show is \"Game of Thrones\".");
        //\" prints to the console ".

        System.out.println("\\");
        //\\ prints \ on console.
        System.out.println("/");
                // / prints /


        System.out.println("My favorite book is 'Java'"); // ' prints '
        System.out.println("My favorite book is \'Java\'"); //\'prints '


    }
}

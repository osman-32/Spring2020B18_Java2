package day36_StaticBlock;
//we can have mulitiple classes in a same java file, as long as there is only one public class
// public classes name MUST be same with the file name
class Tester{
    public static void main(String[] args) {
        System.out.println("Tester Class");
    }
}

class Developer{
    public static void main(String[] args) {
        System.out.println("Developer Class");
    }
}

class scrumTeam{
    public static void main(String[] args) {
        System.out.println("Scrum Team Class");
    }
}

public class MultiClasses {
    public static void main(String[] args) {
        System.out.println("public class");
    }
}

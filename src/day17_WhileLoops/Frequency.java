package day17_WhileLoops;

public class Frequency {
    public static void main(String[] args) {
        /*
       String str="Java Java Java Java"; //is fun is cool
        int count=0;
        while (str.contains("Java")){
            count++;
            str=str.replaceFirst("Java", "");
        }
        System.out.println(count);

         */

        String str="EEee".toLowerCase(); //
        int count=0;
        String word="E".toLowerCase();
        while (str.contains(word)){
            count++;
            str=str.replaceFirst(word, "");
        }
        System.out.println(count);
    }
}

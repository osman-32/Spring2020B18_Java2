package Turtles_Practice;
import java.util.ArrayList;
import java.util.Arrays;

public class _187CombinaAL {
    public static void main(String[] args) {
        ArrayList<String> wordList1=new ArrayList<>(Arrays.asList("milk","coffee","water"));
        ArrayList<String> wordList2=new ArrayList<>(Arrays.asList("bread","cake","baklava"));


        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < wordList1.size(); i++) {
            result.add(wordList1.get(i));
        }

        for (int i = 0; i < wordList2.size(); i++) {
            result.add(wordList2.get(i));
        }
        System.out.println(result);

    }
}


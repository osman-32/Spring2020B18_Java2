package day23_Methods;

public class UniquesValues {
    public static void main(String[] args) {
        String [] arr={"A","B","A"};

       for (String each2:arr){
           int count=0;
           for (String each:arr){
               if (each.equals(each2)) {
                   count++;
               }
           }
           if (count == 1) {
               System.out.println(each2);
           }
       }
    }
}

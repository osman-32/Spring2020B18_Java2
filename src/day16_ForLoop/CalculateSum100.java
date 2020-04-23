package day16_ForLoop;

public class CalculateSum100 {
    /*
    3. write a program that can calculate the sum of all the even numbers between 1 ~ 100
	4. write a program that can calculate the sum of all the odd numbers between 1 ~ 100;
     */
    public static void main(String[] args) {
        int sumOfEven=0;
        int sumOfOdd=0;
        for (int i=0; i<=100; i++){
            if (i%2==0){
                sumOfEven+=i;
            } else{
                sumOfOdd+=i;
            }
        }
        System.out.println("the sum of all the even numbers between 1 ~ 100 is "+sumOfEven);
        System.out.println("the sum of all the odd numbers between 1 ~ 100 is "+sumOfOdd);

    }
}

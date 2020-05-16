package day40_Encapsulation;

public class CredentialsObjects {
    public static void main(String[] args) {
        Credentials facebook=new Credentials();

        facebook.setUserName("A.paulura");
        facebook.setPassWord("12345667");

        System.out.println(facebook.getUserName());
        System.out.println(facebook.getPassWord());

    }
}

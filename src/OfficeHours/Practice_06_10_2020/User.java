package OfficeHours.Practice_06_10_2020;

public class User {
    public static void main(String[] args) {
        facebookUser user= new facebookUser("java5","kesjava5da");
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());

        facebookUser user2=new facebookUser("JamesB","pass007","James Bond");

        System.out.println(user2.getUsername());
        System.out.println(user2.personalUrl);
        System.out.println(user2.accountLength);
        user2.getFullName();
        System.out.println(user2.getFullName());



    }
}

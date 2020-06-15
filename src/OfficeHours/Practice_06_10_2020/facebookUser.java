package OfficeHours.Practice_06_10_2020;
/*
Facebook User:
(*) Create a class for a facebook user which inherits the Social Media class and
additional instance variables: username, password, full name, age, and number of friends
(*) Encapsulate all the variables.
(*) Create a constructor which will create a facebook user by taking username and password.
    - If the password contains the username then it is not a valid password and should not be saved.
    In this case Print “Password contained username.
    Default password created: ‘password’” and set the password for the user to the default value.
    - Create and assign the the user's person url by taking 'facebook.com/' and adding their username
    - Set the account length to 0
    - Set the platform for "Facebook" using static block
(*) Overload the constructor to accept username, password, and the user’s name.
    - If the name entered has any characters that are not letters from the alphabet, then the name is invalid.
     In this case print “invalid name” and assign the name value to be ‘no name’
(*) Overload the constructor to accept username, password, the user’s name, age and number of friends.
    - Only store the age and number of friends into the variables if they are valid numbers ( No negative numbers ).
    If they are invalid print “Invalid (age/number of friends) and keep the values as the default of 0.
 */

import java.util.ArrayList;

import static java.lang.Character.*;

public class facebookUser extends SocialMedia implements Groups {
    private String username;
    private String password;
    private String fullName;
    private int age;
    private int numberofFriends;
    private int numberOfGroups;
    private ArrayList<Post> allPosts;

    static {
        platform="Facebook";
    }

    public ArrayList<Post> getAllPosts() {
        return allPosts;
    }

    public void setAllPosts(ArrayList<Post> allPosts) {
        this.allPosts = allPosts;
    }

    public facebookUser(String username, String password){
        setUsername(username); //java5
        setPassword(password); // kesda
        personalUrl="Facebook.com/"+username;
        accountLength=0;
        allPosts=new ArrayList<>();
    }

    public facebookUser(String username, String password, String fullName){
        this(username,password);
        setFullName(fullName);
    }

    public facebookUser(String username, String password, String fullName, int age, int numberofFriends){
        this(username,password,fullName);
        setAge(age);
        setNumberofFriends(numberofFriends);
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.contains(username)){
            System.out.println("Password contained username. Default password created: ‘password’");
            password="password";
        }
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        boolean isValid = true;
        String check = fullName.replace(" ", "");
        for (int i = 0; i < check.length(); i++) {
            if (!Character.isLetter(check.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            this.fullName = fullName;
        }else{
            System.out.println("not a valid name");
            this.fullName="no name";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if(age<0){
            System.out.println("Invalid age");
            age=0;
        }
        this.age = age;
    }

    public int getNumberofFriends() {
        return numberofFriends;
    }

    public void setNumberofFriends(int numberofFriends) {
        if (numberofFriends>=0){
            this.numberofFriends=numberofFriends;
        }else {
            this.numberofFriends=0;
        }
    }

    public int getNumberOfGroups() {
        return numberOfGroups;
    }

    public void setNumberOfGroups(int numberOfGroups) {
        this.numberOfGroups = numberOfGroups;
    }

    @Override
    public boolean directMessage(String username, String message) {
        if(message.isEmpty()) return false;

        System.out.println("Sent "+message+" to "+username);
        return true;
    }

    @Override
    public boolean createPost(String body) {
        allPosts.add(new Post(body));
        return true;
    }

    @Override
    public void notification(int time) {

    }

    @Override
    public boolean joinGroup(String name) {
        System.out.println(fullName+" welcome to "+name);
        numberOfGroups++;
        return true;
    }


    @Override
    public boolean leaveGroup(String name) {
        System.out.println(fullName+" do you really want to leave? "+name);
        numberOfGroups--;
        return true;
    }
}

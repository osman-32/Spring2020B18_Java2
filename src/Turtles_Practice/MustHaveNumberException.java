package Turtles_Practice;

public class MustHaveNumberException extends Exception{

    private String password;
    public MustHaveNumberException(String password){
        this.password=password;
    }

    public String toString(){
        return "Your username must contain at least one number "+password;
    }
}

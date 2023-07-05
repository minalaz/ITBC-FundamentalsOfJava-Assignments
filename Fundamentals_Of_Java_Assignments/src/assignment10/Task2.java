package assignment10;

import java.util.Scanner;

public class Task2 {public static void main(String[] args) {

    String username = "kokasnelajaje@gmail.com";
    String password = "123mama!";
    Scanner input = new Scanner(System.in);

    System.out.println("Enter username: ");
    String enteredUsername = input.nextLine();

    System.out.println("Enter password: ");
    String enteredPassword = input.nextLine();

    if(enteredUsername.equals(username) && enteredPassword.equals(password)){
        System.out.println("You are succsesfully logged in! ");
    }
    else{
        System.out.println("Wrong username or password! ");
    }
    input.close();

}
}

package assignment9;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String name = input.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();
        System.out.println("Enter the year of your birth: ");
        int yearOfBirth = input.nextInt();
        int yourAge = 2023 - yearOfBirth;
        System.out.println("Your first and last name is: " + name +" " + lastName + " and you are " + yourAge + " years old" );
        input.close();
    }
}

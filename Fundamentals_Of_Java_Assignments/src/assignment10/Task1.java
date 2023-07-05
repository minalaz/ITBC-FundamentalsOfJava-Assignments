package assignment10;

import java.util.Scanner;

public class Task1 {public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the year: ");
    int year = input.nextInt();
    if (year % 4 ==0 && (year % 100 !=0 || year % 400 ==0)){
        System.out.println("The year is leap year! ");
    }
    else{
        System.out.println("The year is not leap year! ");
    }
    input.close();
}
}

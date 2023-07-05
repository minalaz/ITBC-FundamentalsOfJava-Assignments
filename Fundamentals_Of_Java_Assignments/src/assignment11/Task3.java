package assignment11;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        int sum = 0;
        do{
            System.out.println("Enter number: ");
            i = input.nextInt();
            sum = sum + i;}
        while (i > 0);
        System.out.println("Sum of entered numbers is: " + sum);
        input.close();
    }
}

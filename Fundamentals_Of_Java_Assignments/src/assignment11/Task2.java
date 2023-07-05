package assignment11;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i = 1;
        int sum = 0;
        while (i != 0) {
            System.out.println("Enter number: ");
            i = input.nextInt();
            if (i == 0) {
                break;
            }
            sum = sum + i;
        }
        System.out.println("Sum of entered numbers is: " + sum);
        input.close();
    }
}


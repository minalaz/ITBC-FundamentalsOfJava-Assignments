package assignment9;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in degrees Celsius: ");
        int c = input.nextInt();
        double f = c * 1.8 + 32;
        System.out.printf(c + "C = %.1fF ", f);
        input.close();
    }
}
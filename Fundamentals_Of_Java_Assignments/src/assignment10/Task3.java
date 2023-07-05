package assignment10;

import java.util.Scanner;

public class Task3 {public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the month of birth(no.1-12): ");
    int month = input.nextInt();
    System.out.println("Enter the day of birth: ");
    int day = input.nextInt();
    switch(month) {
        case 1:
            if (day > 0 && day < 20) {System.out.println("Capricorn!");}
            else if(day >= 20 && day <= 31) {System.out.println("Aquarius! ");}
            else{System.out.println("This date doesn't exist! ");}
            break;
        case 2:
            if (day > 0 && day < 19) {System.out.println("Aquarius! ");}
            else if(day >=19 && day <= 28) {System.out.println("Pisces! ");}
            else {System.out.println("This date doesn't exist! ");}
            break;
        case 3:
            if (day > 0 && day < 21) {System.out.println("Pisces! ");}
            else if( day >= 21 && day <= 31){System.out.println("Aries! ");}
            else{System.out.println("This date doesn't exist! ");}
            break;
        case 4:
            if (day > 0 && day < 20) {System.out.println("Aries! ");}
            else if (day >= 20 && day <= 30) {System.out.println("Taurus! ");}
            else{System.out.println("This date doesn't exist! ");}
            break;
        case 5:
            if (day > 0 && day < 21) {System.out.println("Taurus! ");}
            else if (day >= 21 && day <= 31) {System.out.println("Gemini! ");}
            else {System.out.println("This date doesn't exist! ");}
            break;
        case 6:
            if (day > 0 && day < 21) {System.out.println("Gemini! ");}
            else if (day >=21 && day <=30 ){System.out.println("Cancer! ");}
            else {System.out.println("This date doesn't exist! ");}
            break;
        case 7:
            if (day > 0 && day < 23) {System.out.println("Cancer! ");}
            else if(day >= 23 && day <= 31){System.out.println("Leo! ");}
            else {System.out.println("This date doesn't exist! ");}
            break;
        case 8:
            if (day > 0 && day < 23) {System.out.println("Leo! ");}
            else if (day >= 23 && day <=31) {System.out.println("Virgo! ");}
            else {System.out.println("This date doesn't exist! ");}
            break;
        case 9:
            if (day > 0 && day < 23) {System.out.println("Virgo! ");}
            else if (day >= 23 && day <=30){System.out.println("Libra! ");}
            else {System.out.println("This date doesn't exist! ");}
            break;
        case 10:
            if (day > 0 && day < 23) {System.out.println("Libra! ");}
            else if (day >=23 && day <=31){System.out.println("Scorpio! ");}
            else {System.out.println("This date doesn't exist! ");}
            break;
        case 11:
            if (day > 0 && day < 22) {System.out.println("Scorpio! ");}
            else if (day >=22 && day <=30) {System.out.println("Sagittarius! ");}
            else {System.out.println("This date doesn't exist! ");}
            break;
        case 12:
            if (day > 0 && day  < 22) {System.out.println("Sagittarius! ");}
            else if (day >= 22 && day <=31){System.out.println("Capricorn! ");}
            else {System.out.println("This date doesn't exist! ");}
            break;
        default:
            System.out.println("This date doesn't exist! ");
    }
    input.close();
}
}

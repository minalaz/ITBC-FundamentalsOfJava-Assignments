package assignment14;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

            Scanner input=new Scanner(System.in);
            int[]array1 = new int[5];
            for(int i = 0; i < array1.length; i++){
                System.out.print("Enter " + (i + 1) + ". element of array: ");
                int element = input.nextInt();
                array1[i] = element;}
            arrayOfMaximumNumbers(array1);
            int[]array2={5,4,6,7,8,9,10};
            arrayOfMaximumNumbers(array2);
            int[]array3={80,900,880,400};
            arrayOfMaximumNumbers(array3);
            int[]array4={1000, 2000, 3000};
            arrayOfMaximumNumbers(array4);
        }
        public static void arrayOfMaximumNumbers(int[]array){
            int max = array[0];
            for(int i=0; i<array.length; i++){
                if(array[i]>max){
                    max=array[i];}
            }
            for(int i=0; i<array.length; i++){
                array[i]=max;
            }
            System.out.print("Array: ");
            for(int i = 0; i<array.length; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println("\n");
        }
    }


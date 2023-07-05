package assignment12;

public class Task2 {
    public static void main(String[] args) {
        int[]array={15,67,89,90,30,59};
        int multi = 0;

        for(int i = 0; i <= array.length; i++){

            multi = array[array.length - 1] * array.length;

        }
        System.out.println(multi);
    }
}

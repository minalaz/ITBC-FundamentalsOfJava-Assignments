package assignment13;

public class Task2 {
    public static void main(String[] args) {
        nameAndLastName("Mina","Lazicic");
        nameAndLastName("Marija", "Maric");
        nameAndLastName("Petar", "Petrovic");
    }
    public static void nameAndLastName(String text1, String text2){
        System.out.println("Name: " + text1.toUpperCase()+ " Last name: " + text2.toLowerCase());
    }
}

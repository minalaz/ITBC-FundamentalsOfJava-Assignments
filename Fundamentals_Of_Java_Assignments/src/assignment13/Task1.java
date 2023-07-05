package assignment13;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(oneAfterAnother(15,16));
        System.out.println(oneAfterAnother(10,12));
        System.out.println(oneAfterAnother(15,20));
        System.out.println(oneAfterAnother(12,13));
        System.out.println(oneAfterAnother(20,30));
    }
    public static boolean oneAfterAnother(int a,int b){
        return(a + 1 == b);
    }
}

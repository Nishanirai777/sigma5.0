import java.util.Scanner;

public class typecast {
    public static void main (String arg[]){
        Scanner sc= new Scanner(System.in);
        float marks= 99.99f;
        int marks2=  (int)marks;
        System.out.println(marks2);
        char ch1= 'a';
        char ch2= 'b';
        int number1= ch1;
        int number2= ch2;
        System.out.println(number1);
        System.out.println((number2));
        //type casting also known as narrowing or explict
    }
    
}

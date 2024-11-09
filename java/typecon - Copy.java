import java.util.Scanner;

public class typecon {
    public static void main(String arg[]){
        int a= 67;
        long b= a;
        System.out.println(a);
        Scanner sc= new Scanner(System.in);
        float number = sc.nextInt();
        System.out.println(number);
    }
 //byte>short >int >float>long>double
 //gitgub area typecon typecast   
 //type promation in expressions
 //wrong
 //byte  b= 5;
 //b= b*2;
 //write
 byte  b= 5;
 b=  (byte) (b*2);
}

import java.util.Scanner;

public class calculator {
    public static void main (String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a:");
        int a = sc.nextInt();
        System.out.println("enter b:");
        int b= sc.nextInt();
        ;System.out.println("enter operator:");
        char operation = sc.next().charAt(0);
        switch(operation){
            case '+': System.out.println(a+b);
            break;
            case '-': System.out.println(a-b);
            break;
            case '*': System.out.println(a*b);
            break;
            case '/': System.out.println(a/b);
            break;
            case '%': System.out.println(a%b);
            default: System.out.println("not avdanved");
        }
    }
    
}

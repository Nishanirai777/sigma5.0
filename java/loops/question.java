import java.util.Scanner;

public class question {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);

        do{
         System.out.println("enter a number:");
         int n =sc.nextInt();
         if(n % 10 == 0){
            break;
         }
         System.out.println(n);
        } while(true);
    }
    
}

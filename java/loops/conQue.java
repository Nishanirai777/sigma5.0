import java.util.Scanner;

public class conQue {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("enter a number:");
            int n= sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println("the number was" + n);
        }while(true);
    }
    
}

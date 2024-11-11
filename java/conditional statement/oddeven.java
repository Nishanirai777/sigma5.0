import java.util.Scanner;

public class oddeven {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println("the number is even");
        } else{
            System.out.println("the number is odd");
        }
    }
    
}

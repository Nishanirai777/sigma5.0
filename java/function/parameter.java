import java.util.Scanner;

public class parameter {
    public static int calculateSum(int num1, int num2){//parameter or formal parameters
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int sum = calculateSum(a, b);//arguments or actual parameters
        System.out.println("sum is :" + sum);


    }
    
}

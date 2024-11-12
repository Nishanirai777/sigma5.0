import java.util.Scanner;

public class ps {
    public static void main(String arg[]) {
        // Writeaprogramthatreadsasetofintegers,andthenprintsthesumoftheeven and odd
        // integers.Question 3 :Write a program to find the factorialof any number
        // entered by the
        // user.(Hint:factorialofanumbern=n*(n-1)*(n-2)*(n-3)*......*1andexistsforpositivenumbersonly.
        // We write factorial as n!So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! =
        // 24 and so on.Note - Please do not confuse factorial with NOT EQUAL TO
        // operator, they are not the
        // same)Question4:WriteaprogramtoprintthemultiplicationtableofanumberN,enteredbytheuser.Question
        // 5 :What is wrong in the following
        // program?publicclassSolution{publicstaticvoidmain(Stringargs[])
        // {for(inti=0;i<=5;i++ ) {System.out.println("i =
        // "+i);}baniyarajeshwari108@gmail.com

        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evensum=0;
        int oddsum;
        do{
            System.out.println("enter the number:");
            number = sc.nextInt();
            if(number % 2==0){
                evensum += number;
            } else {
                oddsum+= number;
            }
            System.out.println("do you want to continue then press 1");
            choice= sc.nextInt();
        } while(choice==1);
        System.out.println("sum of even numbers:"+ evensum);
        System.out.println("sum of odd numbers:" + oddsum);

    }

}

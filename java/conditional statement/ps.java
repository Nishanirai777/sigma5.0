import java.util.Scanner;

public class ps {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int x = sc.nextInt();
        
        if(x>0){
            System.out.println("the mumber is positive");
        }
        else {
            System.out.println("the number is negative");
        }
        //FinishthefollowingcodesothatitprintsYouhaveafeverifyourtemperatureis above 100 and otherwise prints You don't have a feve
         double  temp= 103.5;
         if(temp>100){
            System.out.println("you have a fever");
         }else {
            System.out.println("you don't have fever");
         }
         //WriteaJavaprogramtoinputweeknumber(1-7)andprintdayofweeknameusing switch case
         System.out.println("enter the ancharater if you want to know the weeks");
         int ch = sc.nextInt();
         switch (ch) {
            case 1:System.out.println("today is sunday");
                
                break;
                case 2:System.out.println("today is monday");
                break;
                case 3:System.out.println("today is tuesday");
                break;
                case 4:System.out.println("today is wednesday");
                break;
                case 5:System.out.println("today is thursday");
                break;
                case 6:System.out.println("today is friday");
                break;
                case 7:System.out.println("today is saturday");
                break;
            default:System.out.println("wrong");
                break;
         }
    }
    
}

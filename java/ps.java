import java.util.Scanner;

public class ps {
    public static void main(String arg[]) {
        /// VARIABLES & DATA TYPES
        /// QUESTIONSQuestion1:Inaprogram,input3numbers:A,BandC.Youhavetooutputtheaverageofthese
        /// 3 numbers.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = (a + b + c) / 3;
        System.out.println("the avaerage is:" + average);
        // uestion2:Inaprogram,inputthesideofasquare.Youhavetooutputtheareaofthesquare
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("the arear is:" + area);
        // ion3:Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandan
        // eraser. You have to output the total cost of the items back to the user as
        // their bill.(Add on : You can also try adding 18% gst tax to the items in the
        // bill as an advanced problem
        int pen = sc.nextInt();
        int pencil = sc.nextInt();
        int eraser = sc.nextInt();
        int total = pen +pencil+ eraser;
        System.out.println("the total bill is :" + total);
        //with tax
        float newTotal = total + (0.18f * total);
        System.out.println(newTotal);
    }

}

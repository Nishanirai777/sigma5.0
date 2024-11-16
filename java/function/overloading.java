public class overloading {
    public static int sum(int a, int b){
        return a+b;
    }
    //function to calc sum of 3 
    public static int sum(int a, int b, int c){
        return a+b+c;
    }



    public static void main(String arg[]){
    System.out.println(sum(5, 7));
    System.out.println(sum(8,9,7));
    }
    
}

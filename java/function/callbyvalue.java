public class callbyvalue {
   
        public static void  swap(int a, int b){
            int temp= a;
            a=b;
            b=temp;
            System.out.println("a=" +a);
            System.out.println("b=" +b);
        }
        public static void main(String arg[]){
            int a=8;
            int b=23;
            swap(a, b);

    }
}
    


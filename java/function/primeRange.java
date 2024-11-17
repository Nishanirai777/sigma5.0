public class primeRange {


    public static boolean isprime(int n){
        boolean isprime= true;
        for(int i=2;i<=n-1; i++){
            if(n%i==0){
                isprime= false;
                break;
            }
        }
        return isprime;
      }
 public static void range(int n){
for(int i=2;i<=n;i++){
    if(isprime(i)){
        System.out.println(i + " ");
    }
}
 }




    public static void main(String arg[]){
        System.out.println(isprime(20));

    }
    
}

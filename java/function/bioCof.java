public class bioCof {

    public static int factorial(int n){
        int f=1;
        for(int i=1; i<=n;i++){
            f= f*i;
        }
        return f;
    }
    public static int bf(int n,int r){
        int fact_n= factorial(n);
        int fact_r= factorial(r);
        int fact_nmr= factorial(n-r);
        int bf= fact_n/(fact_r*fact_nmr);
        return bf;
    }
    public static void main(String arg[]){
        System.out.println(bf(15, 5));

    }
    
}

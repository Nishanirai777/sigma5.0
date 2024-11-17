public class DtoB {
    public static void dectoB(int n){
        int  myNum =n;
        int pow =0;
        int binNum=0;
        while (n>0) {
            int rem = n%2;
            binNum = binNum +(rem * (int) math.pow(10, pow));
            pow++;
            n=n/2;
            
        }
        System.out.println("binary form of " + myNum  + " =" + binNum);
    }
    
}

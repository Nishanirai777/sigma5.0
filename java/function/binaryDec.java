public class binaryDec {
    public static void binToDec(int binNum){
        int pow=0;
        int decNum= 0;
        while (binNum>0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)math.pow(2,pow));
            pow++;
            binNum= binNum/10;
            
        }
        System.out.println(" the decimal of "+ binNum + " ="+ decNum);
    }
    public static void main (String arg[]){
        binToDec(101);

    }

    
}

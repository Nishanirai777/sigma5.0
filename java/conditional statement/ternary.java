public class ternary {

    public static void main(String arg[]){
        int number =8;
        String type = ((number%2)==0)? "even ":"odd";
        System.out.println(type);
        //check the student is pass or fail
        int marks =67;
        String  reportcard= marks >=33 ? "pass": "fail";
        System.out.println(reportcard);
    }
}
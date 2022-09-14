public class ArmstrongNumber {
    // 153  = 1^3 + 5^3 + 3^3 = 1+125+27 = 153
    public static void main(String[] args) {
        int num = 153;
        num = 370;

        /*
        * int a;       variable declaration -> a is a variable of integer datatype
        * int a = 10;  variable declaration + initialization -> a is a variable of integer datatype whose value is 10
        * */


        int power = Integer.toString(num).length();

        double sum = 0;
        int copy = num;
        while(copy != 0 ){
            int digit = copy % 10;
            sum = sum + Math.pow(digit, power);
            copy = copy/10;
        }

        if (num == sum){
            System.out.println(num + " is an Armstrong number");
        }
        else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}

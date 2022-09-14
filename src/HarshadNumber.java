public class HarshadNumber {
    // 18 = 1+8 = 9   18%9==0 -> Harshad Number
    public static void main(String[] args) {
        int num = 18;
        int sum = 0;
        int copy = num;
        while(copy != 0){
            int digit = copy % 10;
            sum = sum + digit;
            copy = copy / 10;
        }
        // num % sum of digits == 0
        if(num % sum == 0){
            System.out.println(num+"  is Harshad number");
        }
        else{
            System.out.println(num+"  is not Harshad number");
        }
    }
}

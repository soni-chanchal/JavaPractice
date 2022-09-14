public class FilzianNumber {
    // 135 = (1 + 3 + 5) * 1 * 3 * 5 = 135
    // sum of digits * product of digits = number : Filzian number
    public static void main(String[] args) {
        int num  = 135;
        int sum = 0;
        int product = 1;
        int copy = num;
        while(copy != 0 ){
            int digit = copy % 10;  // 135 % 10 = 5
            sum += digit; // sum  = sum + digit ->  5+3+1=9
            product *= digit; // product =  product * digit ->  5*3*1=15
            copy =  copy / 10; // 135/10 = 13/10 = 1/10 = 0
        }
        System.out.println(sum + " " + product);
        if(sum*product == num){
            System.out.println(num + " is Filzian number");
        }
        else{
            System.out.println(num + " is not Filzian number");
        }
    }

}

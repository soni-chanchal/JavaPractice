public class Factorial {
    // n!  = n(n-1) n->1 to n
    // 5! = 5*4*3*2*1 = 120
    // 5 4 3 2 1 = 1 2 3 4 5
    public static void main(String[] args) {

        int num = 5;
        if(num < 0){
            System.out.println("Enter a valid number");
        }
        if(num == 0){
            System.out.println("Factorial of 0 is 1");
            return;
        }
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact = fact*i;
        }
        System.out.println("Fcatorial of " + num + " = " + fact);
    }
}

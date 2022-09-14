public class Fibonacci {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21  . . .
        // 0 1 1 2 3
        int a=0; int b=1;
        int range = 10;

        if(range<1){
            System.out.println("Please enter a valid number");
        }
        else if(range==1){
            System.out.println(a);
        }
        else if(range == 2 ){
            System.out.print(a + " " + b);
        }
        else {
            System.out.print(a + " " + b + " ");
            int c = a+b;
            for (int i = 1; i <= range-2; i++) {
                System.out.print(c + " ");
                a = b;
                b = c;
                c = a+ b;
            }
        }
    }
}

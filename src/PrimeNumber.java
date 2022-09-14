public class PrimeNumber {
    public static void main(String[] args) {
       int num =  5;

       if(num == 0 || num == 1){
           System.out.println(num  + " is not prime");
       }
       else if (num == 2){
           System.out.println(num + " is only even prime number");
       }
       else {
           for(int i=2; i < num; i++){
               if(num % i == 0){
                   System.out.println(num + " is not prime");
                  return;
               }
           }
           System.out.println(num +  " is prime number");
       }
    }
}

public class PronicNumber {
    // 6 = 3*2
    public static void main(String[] args) {
        // sqrt * (sqrt+1)
        double num = 6;
        double sqrt = Math.floor(Math.sqrt(num));
        double product = sqrt*(sqrt+1);
        System.out.println(product);
        if (num == product){
            System.out.println(num + " is Pronic number");
        }
        else{
            System.out.println(num + " is not Pronic number");
        }
    }
}

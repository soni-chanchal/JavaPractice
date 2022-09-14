public class AgeProblem {
    public static void main(String[] args) {
        int age = 23;

        if (age< 0 || age > 100){
            System.out.println("Please enter a valid age");
        }
        if(age<13){
            System.out.println("You are a child.");
        } else if (age > 12 && age <20) {
            System.out.println("You are a teenager.");
        } else if (age > 19 && age < 26) {
            System.out.println("You are an young.");
        } else if (age > 26 && age < 56) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are old.");
        }
    }
}

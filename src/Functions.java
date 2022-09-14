public class Functions {
    /*
    A function is simply a “chunk” of code that you can use over and over again,
    rather than writing it out multiple times.
    Functions enable programmers to break down or decompose a problem into smaller chunks,
    each of which performs a particular task.

    A function is a block of organized, reusable code that is used to perform a single, related action.
     */
    static int sum(int a, int b){
        return a+b;
    }

    /*
    Steps:
        1. declare a function
        <return type> <function/method name> (<parameters>)
        2. function definition
         <return type> <function/method name> (<parameters>){
         // definition
         }
        3. function call
        function();

     */

    /*
    Types of functions:
    1. void function(void)-> no return no parameter   e.g. print();
    2. void function(string greet)
    3. <int/String/bool/float> function()
    4.<int/String/bool/float> function(<int/String/bool/float>)

    zero return with zero parameter
    zero return with parameter
    value return with zero parameter
    value return with parameter
    * */


    // NOTE: static keyword is used here to access a class method without making its object.
    //zero return with zero parameter
    static void hello(){
        System.out.println("Hello world!");
    }

    //zero return with parameter
    static void sayGoodMorning(String name, String name2){
        System.out.println("Good morning " + name + name2);
    }

    // value return with zero parameter
    static int getNumber(){
        return 56;
    }

    //value return with parameter
    static int add(int num1, int num2){
        return num1+num2;
    }

    public static void main(String[] args) {
        hello();
        sayGoodMorning("Cheeku", "Santosh");
        //int num = getNumber();
        System.out.println(getNumber());

        //int sum = add(11, 10);
        System.out.println(add(11, 10));
    }
}

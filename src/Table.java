public class Table {
    public static void main(String[] args) {
        // To print table in given range
        // 2*1=2
        //2*2=4
        int fromNum = 2;
        int toNum = 5;
        for (int i=fromNum; i<=toNum; i++){
            System.out.println("Table of " + i);
            for (int j=1; j<=10; j++){
                System.out.println(i + " * "+ j + "  = " + i*j);
            }
            System.out.println();
        }
    }
}

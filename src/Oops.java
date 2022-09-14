// It is a blueprint for the object. It is a logical entity that has attributes nad methods.
// methods are functions
// classes can be also called as User defined Datatype
class Car{
    // We are defining attributes of class
    String name;
    String model;
    int wheels;
    int brake;
    int steering;
    String color;

    // constructor
    Car(){

    }


    // methods
    void accelerate(){
        System.out.println("accelearte");
    }

    void run(){
        System.out.println("car is running");
    }

    void display(){
        System.out.println("I am " + this.name);
        System.out.println("brake: " + this.brake);
        System.out.println("color: " + this.color);
        System.out.println("wheels: " + this.wheels);
        System.out.println("steering: " + this.steering);
        System.out.println("model: " + this.model);
    }
}

public class Oops {
    public static void main(String[] args) {
        Car maruti = new Car();

        maruti.display();

//        maruti.brake = 2;
//        maruti.color = "red";
//        maruti.model = "800";
//        maruti.steering = 1;
//        maruti.wheels = 4;
//        maruti.display();
//
//        Car swift = new Car();
//        swift.brake = 1;
//        swift.wheels = 6;
//        swift.model = "2018";
//        swift.display();


    }

}

// It is a blueprint for the object. It is a logical entity that has attributes nad methods.
// methods are functions
// classes can be also called as User defined Datatype
class MyCar{
    // We are defining attributes of class
    String name;
    String model;
    int wheels;
    int brake;
    int steering;
    String color;

    // constructor
    //MyCar(){};
    MyCar(String name, String model, int wheel, String color){
        this.name = name;
        this.model = model;
        this.wheels = wheel;
        this.color = color;
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

public class Constructor {
    public static void main(String args[]) {
  //      MyCar = c1 = new MyCar();
        MyCar swift = new MyCar("swift", "2020", 4, "red");
        swift.display();
    }
}

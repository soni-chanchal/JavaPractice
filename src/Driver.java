class Vehicle {
    int wheels;
    String color;
    String model;
    int steering;
    int brakes;

    Vehicle(){

    }

    Vehicle(int wheels, int brakes, int steering, String color, String model){
        this.color = color;
        this.brakes = brakes;
        this.model = model;
        this.steering = steering;
        this.wheels = wheels;
    }

    void accelerate(){
        System.out.println("Accelerating");
    }

    void brake(){
        System.out.println("Brake");
    }

    void show(){
        System.out.println("brakes: " + this.brakes);
        System.out.println("color: " +  this.color);
        System.out.println("model" + this.model);
        System.out.println("steering" + this.steering);
    }

    public void setWheels(int wheels){
        this.wheels = wheels;
    }

    public int getWheels(){
     return this.wheels;
    }

    public String getColor() {
        return color;
    }
}


public class Driver{
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.show();
    }
}
package Implementaciones;
public class Car {
    String brand;
    int speed;

    void accelerate(){
        speed += 10;
        System.out.println(brand + " acelero a "+ speed + " km/h");
    }
    void brake(){
        speed -= 10;
        System.out.println(brand + "frenó a "+ speed + " km/h");
    }
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.speed = 0;

        car1.accelerate();
        car1.accelerate();
        car1.brake();
    }
}
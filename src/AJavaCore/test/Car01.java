package AJavaCore.test;

import  AJavaCore.dominio.Car;

public class Car01 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();

        car.name = "Mercedez-Benz ";
        car.model = "Sport ";
        car.year = 2013;

        car2.name = "Mustang-GT";
        car2.model = "Sport";
        car2.year = 2022;

        System.out.println("First car is " + car.name  + "-- Model: " + car.model + "-- Year: " + car.year);
        System.out.println("Second one is " + car2.name  + "-- Model: " + car2.model + "-- Year: " + car2.year);



    }
}

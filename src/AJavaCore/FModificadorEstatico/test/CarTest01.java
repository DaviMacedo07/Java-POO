package AJavaCore.FModificadorEstatico.test;

import AJavaCore.FModificadorEstatico.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car.setLimitSpeed(80);
        Car car1 = new Car("BMW", 255);
        Car car2 = new Car("Corsa", 160);
        Car car3 = new Car("Fusca",145);


        car1.print();
        car2.print();
        car3.print();

    }
}
/* Se o campo for estático então pertence à classe ;
Este modificador (static) indica que o assunto está vinculado à classe atual.
* */
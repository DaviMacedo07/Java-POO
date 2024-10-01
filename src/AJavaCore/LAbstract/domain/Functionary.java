package AJavaCore.LAbstract.domain;

public abstract class Functionary extends Person{
    protected  String name;
    protected double salary;

    public Functionary(String name, double salary) {
        this.name = name;
        this.salary = salary;
        bonusCalculator();
    }



    public void bonusCalculator () {
        this.salary = salary + salary * 0.2;
    }
}

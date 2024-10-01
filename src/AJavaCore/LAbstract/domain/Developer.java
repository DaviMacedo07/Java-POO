package AJavaCore.LAbstract.domain;

public class Developer extends Functionary{

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void bonusCalculator() {
        this.salary = this.salary + this.salary * 0.6;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Imprimindo Dev..");
    }
}

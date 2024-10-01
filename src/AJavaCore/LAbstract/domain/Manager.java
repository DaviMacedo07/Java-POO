package AJavaCore.LAbstract.domain;

public class Manager extends  Functionary{
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void print() {
        System.out.println("Imprimindo...");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

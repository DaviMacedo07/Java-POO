package AJavaCore.Bmetodos.dominio;

public class Functionary {
    public String name = null;
    public int age;
    public double[] salary;

    public void printStats() {
        System.out.println("Employee: " + this.name);
        System.out.println("Age: " + this.age);
        for (double money : salary) {
            System.out.println("Salary: " + money);
        }
        System.out.println("- - - - -- - - -");
    }

    public double totalSalary() {
        double total = 0;
        for (double money : salary) {
            total = total + money;
        }
        return total;
    }
}

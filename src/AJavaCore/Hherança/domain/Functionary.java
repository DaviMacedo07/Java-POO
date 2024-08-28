package AJavaCore.Hherança.domain;

public class Functionary extends  Pessoa {
    private double salary;

    static {
        System.out.println("Dentro do bloco static de inicialização func");
    }
    {
        System.out.println("Dentro do bloco de inicialização func 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização func 2");
    }

    public Functionary(String name) {
        super(name);
        System.out.println("Dentro do construtor func");
    }

    public void print(){
        super.print();
        System.out.println(this.salary);
    }
    public void print2() {
        System.out.println("Eu " + this.name + " recebi o salário total de: " + this.salary);
    }
   // public Functionary(double salary) {
     //   this.salary = salary;
 //   }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

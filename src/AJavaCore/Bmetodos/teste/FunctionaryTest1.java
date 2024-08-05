package AJavaCore.Bmetodos.teste;

import AJavaCore.Bmetodos.dominio.Functionary;

public class FunctionaryTest1 {
    public static void main(String[] args) {
        Functionary[] employees = new Functionary[3];

        employees[0] = new Functionary();
        employees[0].name = "David Macedo";
        employees[0].age = 19;
        employees[0].salary = new double[]{1350.00};

        employees[1] = new Functionary();
        employees[1].name = "Elizabeth Clark";
        employees[1].age = 26;
        employees[1].salary = new double[]{2500.00};

        employees[2] = new Functionary();
        employees[2].name = "Jackson Morgan";
        employees[2].age = 32;
        employees[2].salary = new double[]{3050.00};

        for (Functionary employee : employees) {
            employee.printStats();
        }

        double totalSalary = 0;
        for (Functionary employee : employees) {
            totalSalary += employee.totalSalary();
        }

        double avarageSalary = totalSalary / employees.length;
        System.out.println("Avarage salary of the compay is: " + avarageSalary);

    }
}

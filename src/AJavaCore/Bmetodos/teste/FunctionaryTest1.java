package AJavaCore.Bmetodos.teste;

import AJavaCore.Bmetodos.dominio.Functionary;

public class FunctionaryTest1 {
    public static void main(String[] args) {
        Functionary[] employees = new Functionary[3];
    // here I've declared a Functionary constructor on a 3-position array!
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
// Already defined , i had create the employees [0,1,2] 3 functionarys
        for (Functionary employee : employees) {
            employee.printStats();
        }
// ForEach that will run all the array using the method printStats (name,age and salary)

        double totalSalary = 0;
        for (Functionary employee : employees) {
            totalSalary += employee.totalSalary();
        }
//i've made a variable to save the totalSalary and here below i made a logic do split the
//salary in total of emplyees , so the avarageSalary came!
        double avarageSalary = totalSalary / employees.length;
        System.out.println("Avarage salary of the compay is: " + avarageSalary);

    }
}

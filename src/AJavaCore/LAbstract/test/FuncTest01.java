package AJavaCore.LAbstract.test;

import AJavaCore.LAbstract.domain.Developer;
import AJavaCore.LAbstract.domain.Functionary;
import AJavaCore.LAbstract.domain.Manager;
import org.w3c.dom.ls.LSOutput;

public class FuncTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("Elon Musk", 250000);
        Developer developer = new Developer("Davi Macedo", 1400);
        System.out.println(manager);
        System.out.println(developer);
        developer.print();
        manager.print();

    }

}

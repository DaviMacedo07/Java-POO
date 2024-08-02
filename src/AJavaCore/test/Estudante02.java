package AJavaCore.test;

import AJavaCore.dominio.Estudante;


public class Estudante02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante1 = new Estudante();

        estudante.name = "bernardo";
        estudante.sex = 'F';
        estudante.age = 24;
        System.out.println(estudante.name + "---" + estudante.age + " ----" + estudante.sex);
        System.out.println("==================");

        estudante1.name = "bernardo";
        estudante1.sex = 'F';
        estudante1.age = 24;
        System.out.println(estudante1.name + "---" + estudante1.age + " ----" + estudante1.sex);

    }


}

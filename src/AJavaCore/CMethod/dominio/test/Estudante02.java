package AJavaCore.CMethod.dominio.test;

import AJavaCore.CMethod.dominio.EstudanteBelow;


public class Estudante02 {
    public static void main(String[] args) {
        EstudanteBelow estudante = new EstudanteBelow();
        EstudanteBelow estudanteBelow = new EstudanteBelow();

        estudante.name = "bernardo";
        estudante.sex = 'F';
        estudante.age = 24;
        System.out.println(estudante.name + "---" + estudante.age + " ----" + estudante.sex);
        System.out.println("==================");

        estudanteBelow.name = "bernardo";
        estudanteBelow.sex = 'F';
        estudanteBelow.age = 24;
        System.out.println(estudanteBelow.name + "---" + estudanteBelow.age + " ----" + estudanteBelow.sex);

    }


}

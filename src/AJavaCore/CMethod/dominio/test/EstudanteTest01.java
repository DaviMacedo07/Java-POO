package AJavaCore.CMethod.dominio.test;

import AJavaCore.CMethod.dominio.EstudanteBelow;

public class EstudanteTest01 {
    public static void main(String[] args) {
        EstudanteBelow estudante = new EstudanteBelow();
        estudante.name = "Davi Macêdo";
        estudante.age = 19;
        estudante.sex = 'M';

        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.sex);
    }
}

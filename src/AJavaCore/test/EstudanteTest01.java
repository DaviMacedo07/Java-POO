package AJavaCore.test;

import AJavaCore.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "Davi Macêdo";
        estudante.age = 19;
        estudante.sex = 'M';

        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.sex);
    }
}

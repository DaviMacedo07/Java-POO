package AJavaCore.Bmetodos.teste;

import AJavaCore.Bmetodos.dominio.PrintStudent;
import AJavaCore.Bmetodos.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante1 = new Estudante();
        PrintStudent printStudent = new PrintStudent();

        estudante.name = "John";
        estudante.age = 23;
        estudante.sex = 'M';

        estudante1.name = "Patrick";
        estudante1.age = 33;
        estudante1.sex = 'M';

        printStudent.print(estudante);
        printStudent.print(estudante1);


    }
}

package AJavaCore.CMethod.dominio.test;

import AJavaCore.CMethod.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Davi Macêdo";
        professor.age = 19;
        professor.sex = 'M';
        professor.materia = "Geografia";

        System.out.println(professor.name);
        System.out.println(professor.age);
        System.out.println(professor.sex);
        System.out.println(professor.materia);
    }
}

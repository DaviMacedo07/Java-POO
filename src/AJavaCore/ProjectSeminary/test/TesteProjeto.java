package AJavaCore.ProjectSeminary.test;

import AJavaCore.ProjectSeminary.domain.Aluno;
import AJavaCore.ProjectSeminary.domain.Local;
import AJavaCore.ProjectSeminary.domain.Professor;
import AJavaCore.ProjectSeminary.domain.Seminario;
import java.util.Scanner;

public class TesteProjeto {
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);
        Local local = new Local("Rua Egídio de Oliveira 108");
        Aluno aluno = new Aluno("Davi Macêdo", 19);
        Professor professor = new Professor("Daiane Ribeiro", "Brazilian Jiu Jitsu");
        Aluno[] alunosParaSeminario = {};

        Seminario seminario = new Seminario(local, alunosParaSeminario, "A maestria da Guarda Fechada");
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.print();
    }
}

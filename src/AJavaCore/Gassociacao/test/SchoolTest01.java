package AJavaCore.Gassociacao.test;

import AJavaCore.Gassociacao.domain.School;
import AJavaCore.Gassociacao.domain.Teacher;

public class SchoolTest01 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Vandemberg");
        Teacher teacher2 = new Teacher("Maçal");
        Teacher[] teachers = {teacher1, teacher2};
        School school = new School("Colégio Militar de Fortaleza", teachers);

        school.print();
    }
}

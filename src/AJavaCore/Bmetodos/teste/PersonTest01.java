package AJavaCore.Bmetodos.teste;

import AJavaCore.Bmetodos.dominio.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Davi");
        person.setAge(18);
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}

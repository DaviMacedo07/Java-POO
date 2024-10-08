package AJavaCore.Bmetodos.dominio;

public class Person {
    private String name;
    private int age;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 18) {
            System.out.println("Underage!");
            return;
        }
        this.age = age;
    }

    public String getName() {
        return this.name;
    }


    public int getAge() {
        return this.age;
    }
}

/*
    Explaning the Set and Get !
    Set: The setter method receives a parameter and places it in the attribute
    Get: The getter method returns the value of the attribute
*/
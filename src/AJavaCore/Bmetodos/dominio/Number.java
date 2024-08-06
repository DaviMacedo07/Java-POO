package AJavaCore.Bmetodos.dominio;

public class Number {
    private int number;

    public void setNumber(int number) {
        if (number < 1 || number > 10) {
            System.out.println("sdfsdfsd");
            return;
        }
        this.number = number;
    }
}

package AJavaCore.Bmetodos.teste;
import AJavaCore.Bmetodos.dominio.Calculator;
public class CalculatorTest02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int n1 = 23;
        int n2 = 24;
        calculator.changeTwoNumbers(n1,n2);
        System.out.println("Outside changeTwo");
        System.out.println();
        System.out.println(n2);
    }
}

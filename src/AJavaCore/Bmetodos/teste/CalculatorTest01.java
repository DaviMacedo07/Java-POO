package AJavaCore.Bmetodos.teste;
import AJavaCore.Bmetodos.dominio.Calculator;
public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.sumTwoNumbers();
        System.out.println("Finalizado");
        calculator.multipliesTwoNumbers(2,5);

       double result = calculator.dividesTwoNumbers(4, 0);
        System.out.println(result + " Resultadooo");
    }


}

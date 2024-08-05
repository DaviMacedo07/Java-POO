package AJavaCore.Bmetodos.teste;

import AJavaCore.Bmetodos.dominio.Calculator;

public class CalculatorTest05 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] numeros = {1,2};
        calculator.somaArray(numeros);

        calculator.somaVarArgs(numeros);
        /*  public void somaVarArgs(int... numeros)
            só uma questão de sintaxe , nessa eu
            posso passar diretamente os números ao
            invés de ter que criar um array propriamente
            ou fazer do mesmo jeito de antes (criar um array
            de int numeros e passar como paramentro)
        */
    }
}

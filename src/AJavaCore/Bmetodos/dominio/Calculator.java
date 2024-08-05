package AJavaCore.Bmetodos.dominio;

public class Calculator {
    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    };

    public void multipliesTwoNumbers(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double dividesTwoNumbers(double n1, double n2) {
        if ( n2 == 0) {
            return 0;
        } else {
            return n1 / n2;
        }
    };

    public void changeTwoNumbers(int n1, int n2) {
        n1 = 99;
        n2 = 33;
        System.out.println("Inside changeTwo");
        System.out.println(n1);
        System.out.println(n2);
    };

    public void somaArray(int[] numeros) {
        int soma = 0;
        for(int num:numeros) {
            soma +=num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num:numeros) {
            soma +=num;
        }
        System.out.println(soma);
    }
}

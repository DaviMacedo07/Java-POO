package AJavaCore.EblocosInicialização.test;

import AJavaCore.FModificadorEstatico.domain.Counter;

public class ContTest01 {
    public static void main(String[] args) {
        Counter contador1 = new Counter();
        Counter contador2 = new Counter();
        System.out.println("Contador após criação de dois objetos: " + Counter.cont); // Deve imprimir 2

        Counter.cont = 5;
        System.out.println("Valor do contador após modificação direta: " + Counter.cont); // Deve imprimir 5
    }
}


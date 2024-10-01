package AJavaCore.Npolimorfismo.test;

import AJavaCore.Npolimorfismo.domain.Computador;
import AJavaCore.Npolimorfismo.domain.Tomate;
import AJavaCore.Npolimorfismo.servicos.CalculadoraImposto;

public class TEste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("ASUS410", 5300);
        Tomate tomate = new Tomate("Tomate Inglês", 4.50);

        CalculadoraImposto.calcularImpostoComputador(computador);
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}

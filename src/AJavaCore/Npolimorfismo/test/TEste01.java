package AJavaCore.Npolimorfismo.test;

import AJavaCore.Npolimorfismo.domain.Celular;
import AJavaCore.Npolimorfismo.domain.Computador;
import AJavaCore.Npolimorfismo.domain.Tomate;
import AJavaCore.Npolimorfismo.servicos.CalculadoraImposto;

public class TEste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("ASUS410", 5300);
        Tomate tomate = new Tomate("Tomate Inglês", 4.50);
        Celular celular = new Celular("Iphone 13", 4250);

        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(celular);
    }
}

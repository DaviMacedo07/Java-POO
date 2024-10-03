package AJavaCore.Npolimorfismo.servicos;

import AJavaCore.Npolimorfismo.domain.Computador;
import AJavaCore.Npolimorfismo.domain.Produto;
import AJavaCore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de Imposto! ");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getName());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        System.out.println("Preço final: " + (produto.getValor() + imposto));
    }
}

package AJavaCore.Npolimorfismo.servicos;

import AJavaCore.Npolimorfismo.domain.Computador;
import AJavaCore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {

    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("Relatório de imposto do Computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: " + computador.getName());
        System.out.println("Valor: " + computador.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        System.out.println("Valor total: " + (imposto + computador.getValor()));
        System.out.println(" _+_+_+_+_+_+_+_+_+__+");
    }

    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("Relatório de imposto do Tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate: " + tomate.getName());
        System.out.println("Valor: " + tomate.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        System.out.println("Valor total: " + (imposto + tomate.getValor()));
        System.out.println(" _+_+_+_+_+_+_+_+_+__+");
    }
}

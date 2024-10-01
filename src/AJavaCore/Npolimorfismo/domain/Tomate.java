package AJavaCore.Npolimorfismo.domain;

public class Tomate extends  Produto{

    public static final double IMPOSTO_POR_CENTO = 0.5;

    public Tomate(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto do Tomate ");
        return this.valor * IMPOSTO_POR_CENTO;
    }

}

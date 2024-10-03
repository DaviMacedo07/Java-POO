package AJavaCore.Npolimorfismo.domain;

public class Celular extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.45;
    public Celular(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Celular");
        return this.valor * IMPOSTO_POR_CENTO ;
    }
}

package AJavaCore.Npolimorfismo.domain;

public abstract class Produto {
    private String name;
    private double valor;

    public Produto(String name, double valor) {
        this.name = name;
        this.valor = valor;
    }
}

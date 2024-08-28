package AJavaCore.Kenum.dominio;

public enum TipeClient {
    PESSOA_FISICA(0, "Pessoa Física"),
    PESSOA_JURIDICA(1, "Pessoa Jurídica");

    private final int value;
    private final String nameOficial;

    TipeClient(int valor, String nameOficial) {
        this.value = valor;
        this.nameOficial = nameOficial;
    }

    public int getValue(){
        return value;
    }
    public String getNameOficial(){
        return nameOficial;
    }
}

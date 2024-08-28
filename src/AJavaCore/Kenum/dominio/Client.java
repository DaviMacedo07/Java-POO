package AJavaCore.Kenum.dominio;

public class Client {
    public enum TipePayment {
        DEBITO , CREDITO
    }
    private String name;
    private TipeClient tipeClient;
    private TipePayment tipePayment;

    public Client(String name, TipeClient tipeClient, TipePayment tipePayment) {
        this.name = name;
        this.tipeClient = tipeClient;
        this.tipePayment = tipePayment;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", tipeClientInt=" + tipeClient.getValue() +
                ", tipeClient=" + tipeClient.getNameOficial() +
                ", tipePayment=" + tipePayment +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TipeClient getTipeClient() {
        return tipeClient;
    }

    public void setTipeClient(TipeClient tipeClient) {
        this.tipeClient = tipeClient;
    }
}

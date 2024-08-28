package AJavaCore.Hherança.domain;

public class Pessoa {
    protected String name;
    protected String cpf;
    protected Adress adress;
    static {
        System.out.println("Dentro do bloco static de inicialização pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicialização pessoa 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização pessoa 2");
    }

    public Pessoa(String name) {
        System.out.println("Dentro do construtor pessoa");
        this.name = name;
    }
    public void print() {
        System.out.println(this.name);
        System.out.println(this.cpf);
        System.out.println(this.adress.getStreet() + " " + this.getAdress().getCep());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}

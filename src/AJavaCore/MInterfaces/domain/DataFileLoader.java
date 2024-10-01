package AJavaCore.MInterfaces.domain;

public class DataFileLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }
}

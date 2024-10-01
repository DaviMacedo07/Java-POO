package AJavaCore.MInterfaces.domain;

public class DatabaseLoader implements DataLoader{

    @Override
    public void load() {
        System.out.println("Carregando dados da database");
    }
}

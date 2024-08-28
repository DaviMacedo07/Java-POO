package AJavaCore.Isobrescrita.domain;

public class Serie extends  Object{
    private String name;
    @Override
    public String toString() {
        return "Série: " + this.name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie(String name) {
        this.name = name;
    }
}

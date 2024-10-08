package AJavaCore.ProjectSeminary.domain;


public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(Local local,Aluno[] alunos, String titulo) {
        this.local = local;
        this.alunos = alunos;
        this.titulo = titulo;
    }
    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}

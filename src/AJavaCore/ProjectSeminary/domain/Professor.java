package AJavaCore.ProjectSeminary.domain;

public class Professor {
    private String name;
    private String especialidade;
    private Seminario[] seminarios;
    private Local local;

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Professor(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Professor(String name, String especialidade) {
        this.name = name;
        this.especialidade = especialidade;
    }

    public Professor(Local local) {
        this.local = local;
    }

    public void print() {
        System.out.println("---- ____ ----- ____");

        System.out.println("Professor(a): " + this.name + "  ---  Especialidade: " + this.especialidade);
        if (this.seminarios == null) return;
        System.out.println(" -- Seminários Cadastrados --");
        for (Seminario seminario: this.seminarios) {
            System.out.println("Conceito: " + seminario.getTitulo());
            System.out.println("Local: " + seminario.getLocal().getEndereço());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("** Alunos **");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno : " + aluno.getName() + "idade: " + aluno.getAge());
            }

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}

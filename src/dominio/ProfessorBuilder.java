package dominio;

public class ProfessorBuilder {
    private String nome;
    private String senha;
    private String matricula;

    public ProfessorBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public ProfessorBuilder senha(String senha) {
        this.senha = senha;
        return this;
    }

    public ProfessorBuilder matricula(String matricula) {
        this.matricula = matricula;
        return this;
    }

    public Professor criar() {
        return new Professor(nome, senha, matricula);
    }
}
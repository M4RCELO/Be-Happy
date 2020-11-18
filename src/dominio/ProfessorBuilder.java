package dominio;

public class ProfessorBuilder {
    private String nome;
    private String senha;
    private String matricula;

    public ProfessorBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public ProfessorBuilder setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    public ProfessorBuilder setMatricula(String matricula) {
        this.matricula = matricula;
        return this;
    }

    public Professor createProfessor() {
        return new Professor(nome, senha, matricula);
    }
}
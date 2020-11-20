package dominio;

public class AlunoBuilder {
    private String nome;
    private String senha;
    private String matricula;
    private int turma;
    private Long cpf_responsavel;

    public AlunoBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public AlunoBuilder senha(String senha) {
        this.senha = senha;
        return this;
    }

    public AlunoBuilder matricula(String matricula) {
        this.matricula = matricula;
        return this;
    }

    public AlunoBuilder turma(int turma) {
        this.turma = turma;
        return this;
    }

    public AlunoBuilder cpf_responsavel(Long cpf_responsavel) {
        this.cpf_responsavel = cpf_responsavel;
        return this;
    }

    public Aluno criar() {
        return new Aluno(nome, senha, matricula, turma, cpf_responsavel);
    }
}
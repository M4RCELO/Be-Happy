package dominio;

public class AlunoBuilder {
    private String nome;
    private String senha;
    private String matricula;
    private int turma;
    private Long cpf_responsavel;

    public AlunoBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public AlunoBuilder setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    public AlunoBuilder setMatricula(String matricula) {
        this.matricula = matricula;
        return this;
    }

    public AlunoBuilder setTurma(int turma) {
        this.turma = turma;
        return this;
    }

    public AlunoBuilder setCpf_responsavel(Long cpf_responsavel) {
        this.cpf_responsavel = cpf_responsavel;
        return this;
    }

    public Aluno createAluno() {
        return new Aluno(nome, senha, matricula, turma, cpf_responsavel);
    }
}
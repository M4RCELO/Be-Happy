package ifpb.edu.br;

public class CadastroAluno {
    private String nome;
    private int matricula;
    private long cpf_responsavel;
    private int turma;

    public CadastroAluno() {
    }

    public CadastroAluno(String nome, int matricula, long cpf_responsavel, int turma) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf_responsavel = cpf_responsavel;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public long getCpf_responsavel() {
        return cpf_responsavel;
    }

    public void setCpf_responsavel(long cpf_responsavel) {
        this.cpf_responsavel = cpf_responsavel;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }
}

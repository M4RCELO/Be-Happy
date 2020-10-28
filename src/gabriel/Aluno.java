package ifpb.edu.br;

import java.util.ArrayList;

public class Aluno extends ObterValores implements Inter_Escola {
    ArrayList<CadastroAluno> alunos = new ArrayList<>();
    private String nome;
    private Long cpf_responsavel;
    private int matricula;
    private int turma;

    public Aluno(Long cpf_responsavel, int matricula) {
        nome = this.obterValorString("Informe o nome do aluno: ");
        matricula = this.matricula;
        cpf_responsavel=this.cpf_responsavel;
        turma = this.obterValorInteger("Informe a turma do aluno: ");
        cadastrar(this.nome);
    }

    public Long getCpf_responsavel() {
        return cpf_responsavel;
    }

    public void setCpf_responsavel(Long cpf_responsavel) {
        this.cpf_responsavel = cpf_responsavel;
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

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    @Override
    public void cadastrar(String Nome) {
        CadastroAluno cadastroAluno = new CadastroAluno(Nome,getMatricula(),getCpf_responsavel(),getTurma());
        alunos.add(cadastroAluno);
        System.out.println("Aluno cadastrado com sucesso");


    }
}
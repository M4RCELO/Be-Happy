package ifpb.edu.br;

import java.util.ArrayList;

public class Professor extends ObterValores implements Inter_Escola {
    public ArrayList<CadastroProfessor> professores = new ArrayList<>();
    private String nome;
    private int matricula;
    private Long cpf;
    private int turma;



    public Professor () {
        nome = this.obterValorString("Informe o nome do Professor:");
        matricula = this.obterValorInteger("Informe o número da matricula:");
        cpf=this.obterValorLong("Informe o número do cpf: ");
        turma = this.obterValorInteger("Informe a turma: ");
        cadastrar(this.nome);

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

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    @Override
    public void cadastrar(String Nome) {
    CadastroProfessor cadastroProfessor = new CadastroProfessor(Nome,getMatricula(),getCpf(),getTurma());
    professores.add(cadastroProfessor);
    System.out.println("Professor cadastrado com sucesso");


    }


}
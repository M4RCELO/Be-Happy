package ifpb.edu.br;

import java.util.ArrayList;

public class CadastrarResponsavel {
    ArrayList<CadastrarResponsavel> responsaveis = new ArrayList<>();
    private String nome;
    private long cpf;
    private long telefone;
    private ArrayList<Integer> alunos_respom = new ArrayList<Integer>();
    public CadastrarResponsavel() {
    }

    public CadastrarResponsavel(String nome, long cpf, long telefone, ArrayList<Integer> alunos_respom) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.alunos_respom = alunos_respom;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Integer> getAlunos_respom() {
        return alunos_respom;
    }

    public void setAlunos_respom(ArrayList<Integer> alunos_respom) {
        this.alunos_respom = alunos_respom;
    }
}

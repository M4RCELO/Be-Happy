package ifpb.edu.br;

import java.util.ArrayList;

public class CadastroProfessor {

    private String nome;
    private int matricula;
    private Long cpf;
    private int turma;


    public CadastroProfessor() {
    }

    public CadastroProfessor(String nome, int matricula, Long cpf, int turma) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
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

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }
}

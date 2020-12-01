package dominio;

public class ProfessorLogado {
    private String nome;
    private String senha;
    private String matricula;
    private Integer turma;

    public ProfessorLogado (String matricula) {
        setMatricula(matricula);


    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}

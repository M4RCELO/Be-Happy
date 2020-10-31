package gabriel.dominio;

public class Professor{
	
    private String nome;
    private String senha;
    private String matricula;
    private Integer turma;

    public Professor (String nome, String senha, String matricula, int turma) {
        setNome(nome);
        setSenha(senha);
        setMatricula(matricula);
        setTurma(turma);

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getTurma() {
        return turma;
    }

    public void setTurma(Integer turma) {
        this.turma = turma;
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
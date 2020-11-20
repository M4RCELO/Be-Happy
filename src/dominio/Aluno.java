package dominio;

public class Aluno {
	
    private String nome;
    private String senha;
    private String matricula;
    private Integer turma;
    private Long cpf_responsavel;
    
    public Aluno(String nome, String senha, String matricula, int turma, Long cpf_responsavel) {
        setNome(nome);
        setSenha(senha);
        setMatricula(matricula);
        setTurma(turma);
        setCpf_responsavel(cpf_responsavel);
    }
    
    public Aluno(String nome, String matricula, Long cpf_responsavel) {
        setNome(nome);
        setMatricula(matricula);
        setCpf_responsavel(cpf_responsavel);
    }

    public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
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

    public Integer getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
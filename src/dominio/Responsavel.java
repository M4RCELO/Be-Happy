package dominio;

public class Responsavel{
	
    private String nome;
    private String senha;
    private Long cpf;
    private String matri_aluno_respon;

    public Responsavel(String nome, String senha, Long cpf, String matri_aluno_respon) {
        setNome(nome);
        setSenha(senha);
        setCpf(cpf);
        setMatri_aluno_respom(matri_aluno_respon);

    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

	public String getMatri_aluno_respom() {
		return matri_aluno_respon;
	}

	public void setMatri_aluno_respom(String matri_aluno_respom) {
		this.matri_aluno_respon = matri_aluno_respom;
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

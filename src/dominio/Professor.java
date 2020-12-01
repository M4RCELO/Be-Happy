package dominio;

public class Professor{
	
    private String nome;
    private String senha;
    private String matricula;


    public Professor (String nome, String senha, String matricula) {
        setNome(nome);
        setSenha(senha);
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
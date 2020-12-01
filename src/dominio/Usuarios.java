package dominio;

public class Usuarios {

	private String matricula;
	private String senha;
	private Integer turma;
	private Long cpf_responsavel;
	private int tipo;
	
	public Usuarios(String matricula, String senha,Integer turma,Long cpf_responsavel, int tipo) {
		setMatricula(matricula);
		setSenha(senha);
		setTurma(turma);
		setCpf_responsavel(cpf_responsavel);
		setTipo(tipo);
	}
	
	public Usuarios(String matricula, String senha, int tipo) {
		setMatricula(matricula);
		setSenha(senha);
		setTipo(tipo);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Integer getTurma() {
		return turma;
	}

	public void setTurma(Integer turma) {
		this.turma = turma;
	}

	public Long getCpf_responsavel() {
		return cpf_responsavel;
	}

	public void setCpf_responsavel(Long cpf_responsavel) {
		this.cpf_responsavel = cpf_responsavel;
	}
	
	
	
}

package dominio;

public class AlunoLogado {

    private String matricula;
    private Integer turma;
    private Long cpf_responsavel;
    
	public AlunoLogado(String matricula, Integer turma, Long cpf_responsavel) {
		setMatricula(matricula);
		setTurma(turma);
		setCpf_responsavel(cpf_responsavel);
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
	public Long getCpf_responsavel() {
		return cpf_responsavel;
	}
	public void setCpf_responsavel(Long cpf_responsavel) {
		this.cpf_responsavel = cpf_responsavel;
	}
    
    
	
}

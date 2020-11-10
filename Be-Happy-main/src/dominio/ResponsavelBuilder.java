package dominio;

public class ResponsavelBuilder {
    private String nome;
    private String senha;
    private Long cpf;
    private String matri_aluno_respon;

    public ResponsavelBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public ResponsavelBuilder setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    public ResponsavelBuilder setCpf(Long cpf) {
        this.cpf = cpf;
        return this;
    }

    public ResponsavelBuilder setMatri_aluno_respon(String matri_aluno_respon) {
        this.matri_aluno_respon = matri_aluno_respon;
        return this;
    }

    public Responsavel createResponsavel() {
        return new Responsavel(nome, senha, cpf, matri_aluno_respon);
    }
}
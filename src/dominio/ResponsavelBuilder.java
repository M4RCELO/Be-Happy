package dominio;

public class ResponsavelBuilder {
    private String nome;
    private String senha;
    private Long cpf;
    private String matri_aluno_respon;

    public ResponsavelBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public ResponsavelBuilder senha(String senha) {
        this.senha = senha;
        return this;
    }

    public ResponsavelBuilder cpf(Long cpf) {
        this.cpf = cpf;
        return this;
    }

    public ResponsavelBuilder matri_aluno_respon(String matri_aluno_respon) {
        this.matri_aluno_respon = matri_aluno_respon;
        return this;
    }

    public Responsavel criar() {
        return new Responsavel(nome, senha, cpf, matri_aluno_respon);
    }
}
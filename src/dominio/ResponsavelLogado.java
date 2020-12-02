package dominio;

public class ResponsavelLogado {

    private Long cpf;
    private String matri_aluno_respon;


    public ResponsavelLogado ( Long cpf, String matri_aluno_respon) {

        setCpf(cpf);
        setMatri_aluno_respon(matri_aluno_respon);


    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getMatri_aluno_respon() {
        return matri_aluno_respon;
    }

    public void setMatri_aluno_respon(String matri_aluno_respon) {
        this.matri_aluno_respon = matri_aluno_respon;
    }



}

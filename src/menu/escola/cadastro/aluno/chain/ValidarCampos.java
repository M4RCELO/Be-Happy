package menu.escola.cadastro.aluno.chain;

import dominio.Aluno;

public class ValidarCampos implements CadastroAlunoChain {

    private Aluno aluno;
    private CadastroAlunoChain proximo;

    public ValidarCampos(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public void proximo(CadastroAlunoChain proximo) {
        this.proximo = proximo;
    }

    @Override
    public boolean validacao() {

        if(aluno.getNome().equals("") || aluno.getNome() == null){
            System.out.println("====================================");
            System.out.println(" Você deve preencher o campo nome.");
            System.out.println("====================================");
            return false;
        }

        if(aluno.getSenha().equals("") || aluno.getSenha() == null){
            System.out.println("====================================");
            System.out.println(" Você deve preencher o campo senha.");
            System.out.println("====================================");
            return false;
        }

        return proximo.validacao();
    }
}

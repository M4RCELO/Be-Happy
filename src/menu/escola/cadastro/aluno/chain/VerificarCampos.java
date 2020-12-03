package menu.escola.cadastro.aluno.chain;

import dominio.Aluno;

public class VerificarCampos implements CadastroAlunoChain{

    private Aluno aluno;
    private CadastroAlunoChain proximo;

    public VerificarCampos(Aluno aluno) { this.aluno = aluno; }

    @Override
    public void proximo(CadastroAlunoChain proximo) {
        this.proximo = proximo;
    }

    @Override
    public boolean validacao() {

        String cpf = aluno.getCpf_responsavel().toString();

        if (aluno.getSenha().length()<6){
            System.out.println("===============================================");
            System.out.println("A senha do aluno deve possuir 6 dígitos no mín.");
            System.out.println("===============================================");
            return false;
        }

        if(cpf.length()!=11){
            System.out.println("==============================================");
            System.out.println(" O CPF do responsável deve possuir 11 digitos.");
            System.out.println("==============================================");
            return false;
        }

        return proximo.validacao();
    }
}

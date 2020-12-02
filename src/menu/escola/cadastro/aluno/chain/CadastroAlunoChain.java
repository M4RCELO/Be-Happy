package menu.escola.cadastro.aluno.chain;

public interface CadastroAlunoChain {

    void proximo(CadastroAlunoChain proximo);

    boolean validacao();

}

package menu.escola.cadastro.aluno.chain;

public class ChainFinal implements CadastroAlunoChain{
    @Override
    public void proximo(CadastroAlunoChain proximo) {
    }

    @Override
    public boolean validacao() {
        return true;
    }
}

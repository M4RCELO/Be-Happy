package ifpb.edu.br;


import java.util.ArrayList;

public class Responsavel extends ObterValores implements Inter_Escola {
    ArrayList<CadastrarResponsavel> responsavels = new ArrayList<>();
    private String nome;
    private long cpf;
    private long telefone;
    private ArrayList<Integer> alunos_respom = new ArrayList<Integer>();

    public Responsavel() {

        nome = this.obterValorString("Informe o nome do responsavel: ");
        cpf= this.obterValorLong("Informe seu cpf: ");
        telefone=this.obterValorLong("Informe seu número de telefone: ");
        while (true){
            boolean Naluno = this.obterValorBoolean("Deseja cadastrar um aluno?");
            if (Naluno==true){
                int matricula=this.obterValorInteger("Informe a matricula do aluno:");
                alunos_respom.add(matricula);
                Aluno aluno = new Aluno(cpf,matricula);

            }
            else if (Naluno==false){
                break;
            }
        }
        cadastrar(nome);

    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Integer> getAlunos_respom() {
        return alunos_respom;
    }

    public void setAlunos_respom(ArrayList<Integer> alunos_respom) {
        this.alunos_respom = alunos_respom;
    }

    @Override
    public void cadastrar(String Nome) {
        CadastrarResponsavel cadastrarResponsavel = new CadastrarResponsavel(Nome,getCpf(),getTelefone(),getAlunos_respom());
        responsavels.add(cadastrarResponsavel);
        System.out.println("Responsavel cadastrado com sucesso");



    }
}

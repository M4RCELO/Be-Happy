package ifpb.edu.br;

public class EscolaFactory {


    public static Inter_Escola getEscola(int i){

        if(i==1){
            return new Responsavel();
        }
        else if(i==2){
            return new Professor();
        }

        return null;
    }
}
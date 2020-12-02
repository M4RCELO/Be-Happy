package armazenamento;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ArmazenamentoNotificacao extends AmazenamentoAbstract{

    public ArmazenamentoNotificacao() {
        this.nomeArquivo = caminho+"Notificacao.txt";
        this.arquivo_path = Paths.get(nomeArquivo);
    }
}

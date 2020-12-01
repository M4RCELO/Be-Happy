package armazenamento;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ArmazenamentoAcontecimentosCoordenacao implements Armazenamento {
    private String nomeArquivo;
    private Path arquivo_path;

    public ArmazenamentoAcontecimentosCoordenacao() {
        this.nomeArquivo =  "C:/Users/Gabri/IdeaProjects/Be-Happy/Dados/AcontecimentosCoordenacao.txt";
        this.arquivo_path = Paths.get(nomeArquivo);
    }
    public void escreverTexto(String texto) {
        try {
            FileWriter fw = new FileWriter(nomeArquivo, true);
            BufferedWriter conexao = new BufferedWriter(fw);
            conexao.write(texto);
            conexao.newLine();
            conexao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String lerTexto() {
        String texto = "";
        try {
            List<String> linhas = Files.readAllLines(arquivo_path);
            for (String linha : linhas) {
                texto += linha;
                texto += " ";
            }
            texto = texto.trim();
        } catch (IOException e) {
            System.out.println(e);
        }
        return texto;
    }
}

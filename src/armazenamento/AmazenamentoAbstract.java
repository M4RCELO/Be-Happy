package armazenamento;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

abstract class AmazenamentoAbstract {

    String nomeArquivo;
    Path arquivo_path;
    String caminho = "C:/Users/marce/Desktop/Codigos/Java/Be-Happy/Dados/";
//    String caminho = "C:/Users/Gabri/IdeaProjects/Be-Happy/Dados/";

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

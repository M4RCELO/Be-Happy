package outros;

import java.util.Scanner;

public class ObterValores {

    protected Scanner sc = new Scanner(System.in);

    public Integer obterValorInteger(String mensagemProUsuario) {
        Integer valor = null;

        while(valor == null) {
            System.out.print(mensagemProUsuario);

            try {
                String line = this.sc.nextLine();
                valor = Integer.parseInt(line);
            } catch (NumberFormatException var4) {
                System.out.println("Erro! Valor inválido. Tente novamente!");
            }
        }

        return valor;
    }

    public Long obterValorLong(String mensagemProUsuario) {
        Long valor = null;

        while(valor == null) {
            System.out.print(mensagemProUsuario);

            try {
                String line = this.sc.nextLine();
                valor = Long.parseLong(line);
            } catch (NumberFormatException var4) {
                System.out.println("Erro! Valor inválido. Tente novamente!");
            }
        }

        return valor;
    }

    public Boolean obterValorBoolean(String mensagemProUsuario) {
        Boolean valor;
        String line;
        for(valor = null; valor == null; valor = Boolean.parseBoolean(line)) {
            System.out.print(mensagemProUsuario);
            line = this.sc.nextLine();
            if ("Sim".equalsIgnoreCase(line)) {
                line = "True";
            }
        }

        return valor;
    }

    public String obterValorString(String mensagemProUsuario) {
        String valor;
        String line;
        for(valor = null; valor == null; valor = line) {
            System.out.print(mensagemProUsuario);
            line = this.sc.nextLine();
        }

        return valor;
    }
}

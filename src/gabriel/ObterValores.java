package ifpb.edu.br;

import java.util.Scanner;

public abstract class ObterValores {
    protected static final String LS = System.lineSeparator();

    protected Scanner sc;



    protected Integer obterValorInteger(String mensagemProUsuario) {
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

    protected Long obterValorLong(String mensagemProUsuario) {
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

    protected Boolean obterValorBoolean(String mensagemProUsuario) {
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

    protected String obterValorString(String mensagemProUsuario) {
        String valor;
        String line;
        for(valor = null; valor == null; valor = line) {
            System.out.print(mensagemProUsuario);
            line = this.sc.nextLine();
        }

        return valor;
    }
}

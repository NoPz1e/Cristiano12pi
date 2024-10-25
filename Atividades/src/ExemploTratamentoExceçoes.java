import java.sql.SQLOutput;

public class ExemploTratamentoExceçoes {
    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;

        try {
            novaFrase = frase.toUpperCase();
            System.out.println(novaFrase);

        }catch (java.lang.NullPointerException e) {
            System.out.println("A frase é nula.");
        }
    }
}

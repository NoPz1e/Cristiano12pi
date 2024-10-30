public class Main {
    public static void main(String[] args) {
        // Instânciar o objeto da classe == Criar um objeto da classe bolo
        Bolo boloAniversario = new Bolo();

        // Definir os detalhes do bolo
        boloAniversario.setSabor("Morango");
        boloAniversario.setTamanho(30);
        boloAniversario.setCobertura(false);


        // Mostrar os detalhes do bolo
        boloAniversario.exibirDetalhes();

        // Alterar a cobertura
        boloAniversario.adicionarCobertura();

        System.out.println();

        // Mostrar detalhes atualizados
        boloAniversario.exibirDetalhes();

    }
}

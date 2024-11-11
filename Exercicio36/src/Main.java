public class Main {
    public static void main(String[] args) {
        // Instânciar o objeto da classe == Criar um objeto da classe bolo
       /*
        Bolo boloAniversario = new Bolo("Morango", 30, false);

        Bolo boloJoao = new Bolo("Chocolate", false);
        */


        // Definir os detalhes do bolo
        /*
        boloAniversario.setSabor("Morango");
        boloAniversario.setTamanho(30);
        boloAniversario.setCobertura(false);

         */

        /*
        // Mostrar os detalhes do bolo
        boloAniversario.exibirDetalhes();

        // Alterar a cobertura
        boloAniversario.adicionarCobertura();

        System.out.println();

        // Mostrar detalhes atualizados
        boloAniversario.exibirDetalhes();
         */

        BoloChocolate bolo1 = new BoloChocolate(30, true);
        BoloMorango bolo2 = new BoloMorango(75, false);

        bolo1.exibirDetalhes();
        bolo1.tipoConfecao();

        System.out.println();

        bolo2.exibirDetalhes();
        bolo2.tipoConfecao();

        // Testar o polimorfismo
        Bolo boloChocolate = new BoloChocolate(30, true);
        Bolo boloMorango = new BoloMorango(75, false);

    }
}

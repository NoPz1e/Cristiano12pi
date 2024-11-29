import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

      // Array normal fixo
        int[] numero = new int[3];

        // Inserir valores nos indeces do array fixo
        numero[0] = 1;
        numero[1] = 2;
        numero[2] = 3;


        System.out.println("valores no array fixo: ");
        for(int i = 0; i<2; i++){
            System.out.println(numero[i]);
        }

        // arraylist dinamico
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);



        System.out.println("valores no arraylist: ");
        for(int valor: lista){
            System.out.println(valor);
        }






        /*
        // Criar uma sublista
        List<String> sublista = nomes.subList(1,3);
        System.out.println("Sublista: "+ sublista);

         */









        /*
        // Ordenar uma lista: Usar Classe Collection

        Collections.sort(nomes);
        System.out.println("Depois: "+ nomes);

        // Ordenar uma por ordem decrecente
        Collections.sort(nomes, Collections.reverseOrder());
        System.out.println("Depois decrecente: "+ nomes);

         */







        /*// Aceder a elementos pelo indice
        System.out.println("Elemento na posição 1: "+ nomes.get(1));

        // substituir um elemento
        nomes.set(2, "Cristiano");
        System.out.println(nomes);

        // remover um elemento -interface Collection
        nomes.remove(2);
        System.out.println(nomes);
        */
    }
}

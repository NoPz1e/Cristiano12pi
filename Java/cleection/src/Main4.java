import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        /*
        //Criar um objeto TreeSet
        TreeSet<Integer> numeros= new TreeSet<>();

        // adicionar Valores ao treeSet
        numeros.add(30);
        numeros.add(20);
        numeros.add(20);
        numeros.add(40);

        //Apresentar os valores ordenados
        System.out.println("Números no TreeSet(Ordenados): " + numeros);

        //Verificar qual é o menor e maior numeros
        System.out.println("Menor números: " + numeros.first());
        System.out.println("Maior números: " + numeros.last());

        // Remover os números 20
        numeros.remove(20);
        System.out.println("Remove os números 20:" + numeros);



        // Criar um objeto Map
        HashMap<String, Integer> idadeTurma = new HashMap<>();

        //Adicionar valores ao HashMap
        idadeTurma.put("Ana",26);
        idadeTurma.put("Tobino",74);
        idadeTurma.put("Casanova",33);

        // Mostrar os valores
        System.out.println("Valores do map: "+ idadeTurma);

        //Substituir idade da ana
        idadeTurma.put("Ana", 40);

        // Mostrar os valores
        System.out.println("Valores do map: "+ idadeTurma);

        //Mostrar o valor de uma chave
        System.out.println("Valor de chave CasaNova: "+ idadeTurma.get("Casanova"));


        // Eliminar uma chave
        idadeTurma.remove("Tobino");
        // Mostrar os valores
        System.out.println("Valores do map sem tobino: "+ idadeTurma);

        //Verifica se existe uma chave Clementina
        System.out.println("Existe Clementina? "+ idadeTurma.containsKey("Clementina"));



        //Criar u linkedHashMap
        LinkedHashMap<String, Double> precosProdutos = new LinkedHashMap<>();

        // Add produtos ao LinkeHashMap
        precosProdutos.put("Arroz", 1.99);
        precosProdutos.put("Feijão", 0.99);
        precosProdutos.put("Picanha", 109.99);

        //Exibir a lista
        System.out.println("Lista: " + precosProdutos);


        // Interar a Lista
        for(String produto: precosProdutos.keySet()){
            System.out.println(produto+ ": " + precosProdutos.get(produto));
        }
*/

        // Criar lista  queue
        Queue<Integer> numeros = new LinkedList<>();

        // Adiconar números a lista
        numeros.add(23);
        numeros.add(39);
        numeros.add(76);

        // Exibir o primeiro elemento
        System.out.println("Primeiro elemento: "+ numeros.peek());

        // Eliminar elementos
        System.out.println("Elemento removido (pool): "+ numeros.poll());

        // Exibir o primeiro elemento
        System.out.println("Primeiro elemento atual: "+ numeros.peek());

        // Verificar se a lista esta vazia
        System.out.println("A lista esta vazia: "+ numeros.isEmpty());

    }
}

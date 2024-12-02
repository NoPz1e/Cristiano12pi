import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        // Criar uma linkedlist de amigos
        LinkedList<String> linkedList = new LinkedList<>();

        // Adicionar uma lista de amigos
        linkedList.add("kevin");
        linkedList.add("Maria");
        linkedList.add("Hugo");

        // Mostrar lista
        System.out.println("Lista final: " + linkedList);

        // adicionar um novo amigo no inicio
        linkedList.addFirst("Ana");

        // Mostrar lista
        System.out.println("Lista final: " + linkedList);

        // remover um amigos no primeiro e ultimo lugar

        linkedList.removeFirst();
        linkedList.removeLast();

        // Mostrar lista
        System.out.println("Lista final: " + linkedList);

        // percorrer a lista com interator
        var iterator = linkedList.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}

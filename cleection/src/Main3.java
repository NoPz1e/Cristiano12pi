import java.util.HashSet;

public class Main3 {
    public static void main(String[] args) {
        // Criar um hashSet
        HashSet<String> amigos = new HashSet<>();

        // Criar uma lista de amigos
        amigos.add("Afonso");
        amigos.add("Artur");
        amigos.add("Diogo");
        amigos.add("Artur");

        // mostrar a fila (Não vai ter repetição
        System.out.println("Fila inicial: " + amigos);

        // Verificar se um elemento existe
        System.out.println("Contém David? "+ amigos.contains("David"));

        // Verificar o tamanho do hashSet
        System.out.println("Tamanho da lista: " + amigos.size());
    }
}

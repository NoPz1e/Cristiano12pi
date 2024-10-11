import java.sql.SQLOutput;

public class Atividade22 {
    public static void main(String[] args) {
        mensagemDeBoasvindas();
        menu();
    }

    public static void mensagemDeBoasvindas(){
        System.out.println("Seja Bem Vindo");
    }

    public static void menu(){
        System.out.println("== Menu ==");

        System.out.println("1 - Entradas\n2 - Prato Carne\n3 - Prato Peixe\n4 - Sobremesa\n5 - Sair");
    }
}
public class Atividade22 {
    public static void main(String[] args) {
        mensagemDeBoasVindas();
        menu();
    }

    public static void mensagemDeBoasVindas(){
        System.out.println("Seja Bem Vindo");
    }

    public static void menu(){
        System.out.println("== Menu ==");

        System.out.println("1 - Entradas\n2 - Prato Carne\n3 - Prato Peixe\n4 - Sobremesa\n5 - Sair");
    }
}
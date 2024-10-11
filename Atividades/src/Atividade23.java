import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        mensagemDeBoasVindas();

        System.out.print("Digite a sua idade: ");
        int idade = input.nextInt();
        if(idade >= 18){
            menu18();
        }else {
            menu();
        }
    }

    public static void mensagemDeBoasVindas(){
        System.out.println("Seja Bem Vindo "+ user());
    }

    public static void menu(){
        System.out.println("== Menu ==");

        System.out.println("1 - Entradas\n2 - Prato Carne\n3 - Prato Peixe\n4 - Sobremesa\n5 - Sair");
    }

    public static String user() {
        String user = "Maria Joana";
        return user;
    }

    public static void menu18(){
        System.out.println("== Menu ==");

        System.out.println("1 - Entradas\n2 - Prato Carne\n3 - Prato Peixe\n4 - Sobremesa\n5 - Carta de vinho\n6 - Sair");
    }
}
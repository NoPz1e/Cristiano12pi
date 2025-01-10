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
        Scanner input = new Scanner(System.in);
        int res;
        do {
            System.out.println("== Menu ==");

            System.out.println("1 - Entradas\n2 - Prato Carne\n3 - Prato Peixe\n4 - Sobremesa\n5 - Sair");
            res = input.nextInt();
        }while(res != 5);
    }

    public static String user() {
        String user = "Maria Joana";
        return user;
    }

    public static void menu18(){
        Scanner input = new Scanner(System.in);
        int res;
        do {
            System.out.println("== Menu ==");

            System.out.println("1 - Entradas\n2 - Prato Carne\n3 - Prato Peixe\n4 - Sobremesa\n5 - Carta de vinho\n6 - Sair");
            System.out.println("Resposta: ");
            res = input.nextInt();
        }while(res != 6);
    }
}
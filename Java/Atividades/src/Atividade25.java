import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        mensagemDeBoasVindas();

        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = input.nextInt();
        System.out.print("Digite o ano atual: ");
        int anoAtual = input.nextInt();

        int idade = idade(anoNascimento,anoAtual);

        if(idade >= 18){
            menu(idade);
        }else {
            menu();
        }
    }

    public static int idade(int anoNas, int anoAtual) {
        return anoAtual - anoNas;
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

    public static void menu(int idade){
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
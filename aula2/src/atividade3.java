import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("numero do dia: ");
        int ndia = input.nextInt();

        switch (ndia) {
            case 1:
                System.out.println("É um domingo.");
                break;

            case 2:
                System.out.println("É uma segunda-feira.");
                break;

            case 3:
                System.out.println("É uma terça-feira.");
                break;

            case 4:
                System.out.println("É uma quarta-feira.");
                break;

            case 5:
                System.out.println("É uma quinta-feira.");
                break;

            case 6:
                System.out.println("É uma sexta-feira.");
                break;

            case 7:
                System.out.println("É um sabado.");
                break;
            
            default:
                System.out.println("Esse número nao corresponde a nenhum dia da semana.");
        }   

        input.close();
    }
}
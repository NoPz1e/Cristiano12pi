import java.util.Scanner;

public class Atividade31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = 0, num2 = 0;

        while (true) {
            try {
                System.out.print("Digite um número: ");
                num1 = input.nextInt();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Erro: Por favor, insira um número inteiro válido.");
                input.nextLine(); // limpa o buffer do scanner
            }
        }

        while (true) {
            try {
                System.out.print("Digite outro número: ");
                num2 = input.nextInt();

                if (num2 == 0) {
                    System.out.println("Erro: o divisor não pode ser zero!");
                    continue;
                }
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Erro: Por favor, insira um número inteiro válido.");
                input.nextLine(); // limpa o buffer do scanner
            }
        }
        int res = num1 / num2;
        System.out.println("R:" + res);

        input.close();
    }
}

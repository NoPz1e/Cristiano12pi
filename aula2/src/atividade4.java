import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Valor: ");
        int valor = input.nextInt();

        boolean resultado = valor == 0? false: true;

        System.out.println(resultado);

        input.close();
    }
}
import java.util.Scanner;

public class Atividade29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número decimal: ");
        double x = input.nextDouble();

        // Typecast utilizado é explicita
        int a = (int) x;
        float b = (float) x;
        long c = (long) x;

        System.out.println("Número original: "+ x);
        System.out.println("Número convertido em int: "+ a);
        System.out.println("Número convertido em float: "+ b);
        System.out.println("Número convertido em long: "+ c);
    }
}

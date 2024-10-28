import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        conta contaBancaria = new conta();

        Scanner input = new Scanner(System.in);



        boolean a = true;
        while (a) {

            System.out.print("""
                1- Definir saldo;
                2- Obter saldo;
                3- Depositar;
                4- Levantar;
                5- Sair;
                R: """);
            int res = input.nextInt();

            switch (res) {
                case 1:
                    contaBancaria.definirSaldo();
                    break;

                case 2:
                    contaBancaria.obterSaldo();
                    break;

                case 3:
                    contaBancaria.Depositar();
                    break;

                case 4:
                    contaBancaria.levantar();
                    break;

                case 5:
                a = false;
            }

        }


    }
}

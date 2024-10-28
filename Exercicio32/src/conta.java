import java.util.Scanner;

public class conta {
    public float saldo = 0;

    Scanner input = new Scanner(System.in);


    public void definirSaldo(){

        do {
            System.out.print("Digite o Saldo: ");
            saldo = input.nextFloat();
        }while(saldo <= 0);
    }

    public void obterSaldo(){
        System.out.println("Saldo: " + saldo);
    }

    public void Depositar() {

        float temp;
        do {
            System.out.print("Valor a depositar: ");
            temp = input.nextFloat();
        } while (saldo <= 0);

        saldo += temp;
    }

    public void levantar(){

        float temp = 0;
        while (temp <= 0){
            System.out.print("Valor a levantar: ");
            temp = input.nextFloat();
        }

        saldo += temp;
    }
}

import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Temperatura: ");
        double temp = input.nextDouble();

        if (temp >= 100){
            System.out.println("A água esta a ferver.");
        }else{
            System.out.println("Não esta a ferver.");
        }

        input.close();
    }
}

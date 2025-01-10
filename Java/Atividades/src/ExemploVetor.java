import java.util.Scanner;
import java.util.Vector;

public class ExemploVetor{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int soma = 0;
        Vector<Integer> num =  new Vector<>();

        do{
            System.out.println("Insira um número(0 para cancelar):");
            int numero = input.nextInt();

            if(numero == 0){break;}

            num.add(numero);
            soma += numero;

        }while(true);

        System.out.println("R: "+ soma%2); 

        input.close();
    }
}

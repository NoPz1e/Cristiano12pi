import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        //6
        /* 
        for(int i=1; i<=20; i++){
            System.out.println(i);
        }
        for(int i=1; i<=20; i++){
            System.out.print(i);
        }
        */

        //7
        /* 
        int numeros[]= new int[5];

        for(int i=1;i<=5;i++){
            System.out.print("numero "+ i +": ");
            numeros[i-1] = input.nextInt();
        }

        int maior = numeros[0];

        for(int i=1; i <= 4; i++){
            if (numeros[i]>maior){
                maior = numeros[i];
            }
        }
        System.out.println("O maior numero é: "+ maior);    
        */
        
        //8
        /* 
        int numeros[]= new int[5];

        for(int i=1;i<=5;i++){
            System.out.print("numero "+ i +": ");
            numeros[i-1] = input.nextInt();
        }

        int soma = numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4];
        System.out.println("Soma: "+ soma);

        int media = soma/5;
        System.out.println("Media: "+ media);  
        */

        //9
        /* 
        for(int i=1; i<=50; i+=2){
            System.out.println(i);
        }
        */

        //10
        /* 
        System.out.print("inicio: ");
        int inicio = input.nextInt();

        System.out.print("fim: ");
        int fim = input.nextInt();

        for(int i=inicio;i<=fim;i++){
            System.out.println(i);
        }
        */

        //11
        System.out.print("inicio: ");
        int inicio = input.nextInt();

        System.out.print("fim: ");
        int fim = input.nextInt();
        
        int soma=0;

        for(int i=inicio;i<=fim;i++){
            System.out.println(i);
            soma += i;
        }
        
        System.out.println("Soma: "+ soma);

        input.close();
    }
}

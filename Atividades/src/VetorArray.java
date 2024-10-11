/*Crie uma array que armazene a quantidade de alunos, 
inserida pelo utilizador, em cada sala de uma escola. 
Num vetor armazene os valores pares encontrados. Por fim, crie uma
 variável que armazene a quantidade total de alunos nesta escola.  
 */

import java.util.Scanner;
import java.util.Vector;

public class VetorArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Vector<Integer> numPares =  new Vector<>();
        int[][] salas = new int[4][1];

        for(int j = 0; j < 4; j++){
            System.out.print("Números de alunos na sala "+(j+1)+": ");
             
            int num = input.nextInt();
            salas[j][0] = num;

            if(num%2==0){
                numPares.add(num);
            }
        }


    input.close();

    }
}

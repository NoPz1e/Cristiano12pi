import java.util.Scanner;

public class ExVetorArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nomes = new String[3];
        Double[][] notas = new Double[3][2];

        for(int i=0; i < 3; i++){
            System.out.println("Nome do aluno " + (i+1) + ": ");
            nomes[i] = input.next();

            for(int j = 0; j < 2; j++){
                System.out.print("Nota em "+(j+1)+"ª disciplina: ");
                notas[i][j] = input.nextDouble();
            }
        }

        for (int i = 0; i < 3 ; i++) {
            System.out.print(nomes[i]+ "  ");
            for (int j = 0; j <  2; j++) {
                System.out.print(notas[i][j]+ "  ");
            }
            System.out.println();
        }
        input.close();
    }
}

/* 
Gerenciar Notas de Alunos:
    Vetor: Armazene os nomes dos alunos.
    Matriz: Armazene as notas de cada aluno em diferentes disciplinas.
*/

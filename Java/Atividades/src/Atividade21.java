public class Atividade21 {
    public static void main(String[] args) {

        int[][] matriz = new int[2][3];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        System.out.println("Matriz original");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // matriz transposta
        int[][] matriztrans = new int[3][2];

        matriztrans[0][0] = 1;
        matriztrans[1][0] = 2;
        matriztrans[2][0] = 3;
        matriztrans[0][1] = 4;
        matriztrans[1][1] = 5;
        matriztrans[2][1] = 6;


        System.out.println("Matriz Transposta");
        for (int i = 0; i < matriztrans.length; i++) {
            for (int j = 0; j < matriztrans[i].length; j++) {
                System.out.print(matriztrans[i][j] + " ");
            }
            System.out.println();
        }


    }
}
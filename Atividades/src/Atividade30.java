public class Atividade30 {
    public static void main(String[] args) {

        double[] notas = {8.5, 9.0, 7.3, 6.8, 10.0};

        double soma = 0;
        int nAlunos = 0;

        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
            nAlunos ++;
        }

        double media = soma / nAlunos;
        int mediaInt = (int) media;

        System.out.println("Número de alunos: "+ nAlunos);
        System.out.println("Média original: "+ media);
        System.out.println("Média convertida: " + mediaInt);
    }
}

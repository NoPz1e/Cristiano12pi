public class Atividade30 {
    public static void main(String[] args) {

        double[] notas = {17.5, 19.0, 7.3, 11.8, 10.2};

        double soma = 0;
        int nAlunos = 0;

        for (double nota : notas) {
            soma += nota;
            nAlunos++;
        }

        double media = soma / nAlunos;
        int mediaInt = (int) media;

        System.out.println("Número de alunos: "+ nAlunos);
        System.out.println("Média original: "+ media);
        System.out.println("Média convertida: " + mediaInt);
    }
}

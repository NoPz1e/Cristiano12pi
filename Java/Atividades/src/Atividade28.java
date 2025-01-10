public class Atividade28 {
    public static void main(String[] args) {

        int idade = 30;
        double tempo = 30.5;
        float farenheit = 305.9F;

        String idadeS = Integer.toString(idade);
        String tempos = Double.toString(tempo);
        String farenheitS = Float.toString(farenheit);

        System.out.printf("Idade: %s,\ntempo: %s,\nfarenheit: %s", idadeS,tempos,farenheitS);

    }
}

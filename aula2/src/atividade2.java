import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite uma letra: ");
        String letra = input.nextLine();

        switch (letra) {
            case "a":
                System.out.println("É uma vogal.");
                break;

            case "e":
                System.out.println("É uma vogal.");
                break;

            case "i":
                System.out.println("É uma vogal.");
                break;

            case "o":
                System.out.println("É uma vogal.");
                break;

            case "u":
                System.out.println("É uma vogal.");
                break;
            
            default:
                System.out.println("É uma consoante");
        } 
        
        input.close();
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.print("Preco do livro: ");
        double precolivro = input.nextDouble();

        if (precolivro > 10){
            System.out.println("O livro é caro.");    
        }else{
            System.out.println("O livro é barato.");
        }
        
        input.close();
    }
}

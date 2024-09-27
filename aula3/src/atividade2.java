import java.util.Scanner;

public class atividade2 {   
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31,31};
        String[] mes = new String[12];
        mes[0]="jan";
        mes[1]="fev";
        mes[2]="mar";
        mes[3]="abr";
        mes[4]="mai";
        mes[5]="jun";
        mes[6]="jul";
        mes[7]="ago";
        mes[8]="set";
        mes[9]="out";
        mes[10]="nov";
        mes[11]="dez";

        System.out.print("Yearç: ");
        int ano = input.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            dias[1]= 29;
        } 
        
        for(int i=0; i<12; i++){
            System.out.println("O mês de "+ mes[i] +" tem " + dias[i] + " dias.");
        }

        input.close();

    }
}

public class atividade1 {
    public static void main(String[] args) throws Exception {

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

        
        for(int i=0; i<12; i++){
            System.out.println("O mês de "+ mes[i] +" tem " + dias[i] + " dias.");
        }



    }
}

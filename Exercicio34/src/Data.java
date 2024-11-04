public class Data {
    // Variáveis de Instância
    private int dia;
    private int mes;
    private int ano;

    // Contrutor
    public Data(){
        this.dia = 1;
        this.mes = 1;
        this.ano = 1;
    }

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }

    public void setData(int dia, int mes, int ano){
        if (dia >= 1 && dia <= 31){
            this.dia = dia;
        }else{
            System.out.println("wrong number range!");
        }

        if (mes >1 && mes <= 31){
            this.mes = mes;
        }else{
            System.out.println("wrong number range!");
        }

        if (ano >=  0){
            this.ano = ano;
        }else{
            System.out.println("wrong number range!");
        }
    }
}

public class Casa {

    // Variáveis de Instância
    private int quartos;
    private int casaDeBanho;
    private String rua;


    // Construtor
    public Casa(int quartos, int casaDeBanho, String rua){
        this.quartos = quartos;
        this.casaDeBanho = casaDeBanho;
        this.rua = rua;
    }

    // Quartos
    public void setquartos(int quartos){
        this.quartos = quartos;
    }

    public int getQuartos(){
        return quartos;
    }

    // casa de banho
    public void setCasaDeBanho(int casaDeBanho){
        this.casaDeBanho = casaDeBanho;
    }

    public int getCasaDeBanho(){
        return casaDeBanho;
    }

    // rua
    public void setRua(String rua){
        this.rua = rua;
    }

    public String getRua(){
        return rua;
    }

}

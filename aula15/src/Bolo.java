public class Bolo {
    // Variáveis de Instância
    private String sabor;
    private int tamanho;
    private boolean cobertura;


    // Construtor da classe com 2 parámetros
    public Bolo(String sabor, boolean cobertura){
        this.sabor = sabor;
        this.cobertura = cobertura;
    }

    // construtor da classe
    public Bolo(String sabor, int tamanho, boolean cobertura){
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.cobertura = false;
    }


    public String getSabor(){
        return sabor;
    }

    public void setSabor(String sabor){
        this.sabor = sabor;
    }

    public int getTamanho(){
        return tamanho;
    }

    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }

    public boolean getCobertura(){
        return cobertura;
    }

    public void setCobertura(boolean cobertura){
        this.cobertura = cobertura;
    }


    // Apresenta os detalhes do bolo
    public void exibirDetalhes(){
        System.out.println("Sabor do bolo: "+ sabor);
        System.out.println("Tamanho do bolo: "+ tamanho+ "cm");
        System.out.println("Cobertura: "+ (cobertura? "Sim": "Não"));
    }

    public void adicionarCobertura(){
        cobertura = true;
    }
}

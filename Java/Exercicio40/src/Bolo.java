public abstract class Bolo {
    // Variáveis de Instância
    private String sabor;
    private int tamanho;
    private boolean cobertura;


    // Construtor da classe com 2 parámetros
    public Bolo(String sabor, boolean cobertura){
        this.sabor = sabor;
        this.cobertura = cobertura;
    }

    private String mensagem;
    private String corDecoracao;

    // construtor da classe
    public Bolo(String sabor, int tamanho, boolean cobertura){
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.cobertura = false;
    }

    // Set and get


    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getCorDecoracao() {
        return corDecoracao;
    }

    public void setCorDecoracao(String corDecoracao) {
        this.corDecoracao = corDecoracao;
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

    // Forma de criação de um metodo abstrato
    public abstract void tipoConfecao();
}

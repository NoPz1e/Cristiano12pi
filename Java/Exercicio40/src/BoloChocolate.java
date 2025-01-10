public class BoloChocolate extends Bolo implements Personalizavel{

    public BoloChocolate(int tamanho, boolean cobertura){
        super("Chocolate", tamanho , cobertura);
    }

    @Override
    public void tipoConfecao() {
        System.out.println("Este bolo será confecionado na forno");
    }

    @Override
    public void exibirDetalhes(){
        // Herança do bolo
        super.exibirDetalhes();

        // Condiçao logica
        if(getMensagem() != null){
            System.out.println("Mensagem a apresentar: " + getMensagem());
        }

        if(getCorDecoracao() != null){
            System.out.println("A cor do bolo será: "+ getCorDecoracao());
        }

    }

    @Override
    public void definirMensagem(String mensagem){
        setMensagem(mensagem);
    }

    @Override
    public void corDecoracao(String corDecoracao){
        setCorDecoracao(corDecoracao);
    }
}

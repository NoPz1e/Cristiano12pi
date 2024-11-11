public class Carro extends Veiculo {

    public Carro(String matricula) {
        super(matricula, 13.6);
    }

    @Override
    public void acelerar() {
        System.out.println("Este carro pode acelarar!");

    }

    @Override
    public void travar() {
        System.out.println("Este carro pode travar!");

    }

    @Override
    public void  calcularPrecoAluguer(int dias){
        double precoFinal = dias*getPrecoKm();
        System.out.println("O preço final é: "+ precoFinal);
    }

}

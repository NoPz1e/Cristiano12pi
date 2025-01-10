public class Mota extends Veiculo implements  Alugavel{
    public Mota(String matricula) {
        super(matricula, 9.4);
    }

    @Override
    public void acelerar() {
        System.out.println("Este mota pode acelarar!");

    }

    @Override
    public void travar() {
        System.out.println("Este mota pode travar!");
    }

    public void  calcularPrecoAluguer(int dias){
        double precoFinal = dias*getPrecoKm();
        System.out.println("O preço final é: "+ precoFinal);
    }

    @Override
    public void aluguer(){
        setEstadoAluguer(true);
    }

    @Override
    public void devolver(){
        setEstadoAluguer(false);
    }
}

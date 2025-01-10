public abstract class Veiculo {
    private String matricula;
    private double precoKm;

    public Veiculo(String matricula, double precoKm){
        this.matricula = matricula;
        this.precoKm = precoKm;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getMatricula(){
        return matricula;
    }

    public void setPrecoKm(double precoKm){
        this.precoKm = precoKm;
    }

    public double getPrecoKm(){
        return precoKm;
    }

    public abstract void acelerar();
    public abstract void travar();

    public abstract void calcularPrecoAluguer(int dias);
}

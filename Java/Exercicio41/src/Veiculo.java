public abstract class Veiculo {
    private String matricula;
    private double precoKm;
    private boolean estadoAluguer;

    public Veiculo(String matricula, double precoKm){
        this.matricula = matricula;
        this.precoKm = precoKm;
        this.estadoAluguer = false;
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

    public boolean isEstadoAluguer() {
        return estadoAluguer;
    }

    public void setEstadoAluguer(boolean estadoAluguer) {
        this.estadoAluguer = estadoAluguer;
    }

    public abstract void acelerar();
    public abstract void travar();

    public abstract void calcularPrecoAluguer(int dias);

    public abstract void aluguer();

    public abstract void devolver();
}

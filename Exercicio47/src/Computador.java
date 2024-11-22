public class Computador {
    private CPU cpu;

    public Computador(String modeloCPU) {
        // A CPU vai ser gerida pela class computador
        this.cpu = new CPU(modeloCPU);
    }

    public void mostrarCPU(){
        System.out.println("Computador com CPU "+ cpu.getModelo());
    }
}

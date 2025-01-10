public class Main {
    public static void main(String[] args) {
        /*
        Carro carro = new Carro("AS-23-ER");
        Mota mota = new Mota("TR-34-GF");

        System.out.println("Carro:");
        carro.acelerar();
        carro.travar();
        carro.calcularPrecoAluguer(34);

        System.out.println();

        System.out.println("Mota:");
        carro.acelerar();
        carro.travar();
        carro.calcularPrecoAluguer(12);
         */

        Veiculo carroCris = new Carro("33-43-23");

        System.out.println(carroCris.isEstadoAluguer());
        carroCris.aluguer();
        System.out.println(carroCris.isEstadoAluguer());
        carroCris.devolver();
        System.out.println(carroCris.isEstadoAluguer());

    }
}

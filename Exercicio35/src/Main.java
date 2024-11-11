public class Main {
    public static void main(String[] args) {
        ContaBancaria contaJose = new ContaBancaria();

        contaJose.depositar(100);

        System.out.println("saldo atual conta: " + contaJose.getSaldo());

        contaJose.levantar(45.5);

        System.out.println("Saldo atual da conta: "+ contaJose.getSaldo());
    }
}

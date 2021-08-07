public class TesteSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.depositaSaldo(100);
        conta.sacarSaldo(200);


        System.out.println(conta.getSaldo());

    }
}

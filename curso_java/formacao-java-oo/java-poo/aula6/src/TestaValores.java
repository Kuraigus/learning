public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 5);
        Conta conta2 = new Conta(1337, 5);
        Conta conta3 = new Conta(1337, 5);

        System.out.println("TOTAL DE CONTAS ABERTAS: " + Conta.getTotal());

    }
}

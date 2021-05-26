public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        conta1.depositaSaldo(25);

        System.out.println("Saldo da conta: " + conta1.saldo);


        boolean conseguiuRetirar = conta1.sacarSaldo(25);
        if (conseguiuRetirar == true)
            System.out.println("Saldo apos saque da conta: " + conta1.saldo);
        else
            System.out.println("saldo insuficiente para saque");


        conta1.depositaSaldo(100);
        boolean conseguiuTransferir = conta1.transfereValor(50, conta2);
        if (conseguiuTransferir == true)
            System.out.println("Transferencia realizada com sucesso!\n" +
                    "Saldo da primeira conta: " + conta1.saldo + "\nSaldo da segunda conta: " + conta2.saldo);
        else
            System.out.println("Saldo insuficiente para transferencia");

    }
}

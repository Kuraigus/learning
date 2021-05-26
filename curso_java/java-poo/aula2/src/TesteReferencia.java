public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo);


        if(primeiraConta == segundaConta)
            System.out.println("Sao a mesma conta!");
    }
}

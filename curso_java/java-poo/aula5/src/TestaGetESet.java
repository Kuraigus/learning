public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        conta.setAgencia(15);
        System.out.println(conta.getAgencia());

        Cliente paulo = new Cliente();

        paulo.setNome("Paulo Silveira");

        conta.setTitular(paulo);

        Cliente titularDaConta = conta.getTitular();


        System.out.println(titularDaConta.getNome());

        titularDaConta.setProfissao("Programador");

    }
}

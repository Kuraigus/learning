public class TestaBanco {
    public static void main(String[] args) {
        Cliente clienteJoao = new Cliente();
        clienteJoao.nome = "Joao Victor";
        clienteJoao.cpf = "222.222.222-22";
        clienteJoao.profissao = "Desenvolvedor";

        Conta contaDoJoao = new Conta();
        contaDoJoao.depositaSaldo(100);
        contaDoJoao.titular = clienteJoao;

        System.out.println(contaDoJoao.titular.nome + " seu saldo e de: " + contaDoJoao.saldo);
    }
}

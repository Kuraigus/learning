public class TesteGerente {
    public static void main(String[] args) {
        Gerente joao = new Gerente();

        joao.setNome("Joao Victor");
        joao.setCpf("222.222.222-22");
        joao.setSalario(5000.0);

        System.out.println(joao.getNome());
        System.out.println(joao.getCpf());
        System.out.println(joao.getSalario());

        joao.setSenha(2222);

        boolean autenticou = joao.autentica(2222);

        System.out.println(autenticou);

        System.out.println(joao.getBonificacao());
    }
}

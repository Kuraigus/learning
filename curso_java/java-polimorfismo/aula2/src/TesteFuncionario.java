public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario joao = new Funcionario();
        joao.setNome("Joao Victor");
        joao.setCpf("222.222.222-22");
        joao.setSalario(2500);

        System.out.println(joao.getNome());
        System.out.println(joao.getCpf());
        System.out.println(joao.getSalario());
        System.out.println(joao.getBonificacao());
    }
}

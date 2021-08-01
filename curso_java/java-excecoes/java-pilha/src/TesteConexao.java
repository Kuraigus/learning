public class TesteConexao {
    public static void main(String[] args) {

        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        }

        // Conexao conexao = null;

        // try {
        // conexao = new Conexao();
        // conexao.leDados();
        // } catch (Exception exception) {
        // System.out.println("Error: " + exception.getMessage());
        // } finally {
        // if (conexao != null) {
        // conexao.close();
        // }
        // }
    }
}

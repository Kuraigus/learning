public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero) {
        Conta.total++;
        if (numero <= 0 || agencia <= 0){
            System.out.println("Nao e possivel registrar numero e/ou agencia menor ou igual a zero");
            return;
        }
        this.agencia = agencia;
        this.numero = numero;
    }

    public void depositaSaldo(double valor) {
        this.saldo += valor;
    }

    public void retiraSaldo(double valor) {
        this.saldo -= valor;
    }

    public boolean sacarSaldo(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }

        return false;
    }

    public boolean transfereValor(double valor, Conta destino) {
        if (this.saldo >= valor) {
            destino.depositaSaldo(valor);
            this.retiraSaldo(valor);
            return true;
        }

        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

    public void setNumero(int numero) {
        if (numero <= 0){
            System.out.println("Nao e possivel registrar numero menor ou igual a zero");
            return;
        }
        this.numero = numero;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0){
            System.out.println("Nao e possivel registrar numero menor ou igual a zero");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }


}
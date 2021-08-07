public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

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

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
public class Conta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular;

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
}
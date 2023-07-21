package ExercicioBanco.Entities;

public class ContaPoupanca extends Conta {
    public ContaPoupanca() {
    }
    public ContaPoupanca(String cliente, Double saldo) {
        super(cliente, saldo);
    }

    @Override
    public String toString() {
        return "Poupança{" +
                "numero=" + this.getNumero() +
                ", cliente='" + this.getCliente() + '\'' +
                ", saldo=" + this.getSaldo() +
                '}';
    }
}

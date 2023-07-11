package ExercicioBanco.Entities;

public class Conta {
    private int numero;
    private String cliente;
    private Double saldo = 0.0;
    private Double limite = 0.0;

    public Conta() {

    }
    public Conta(String cliente, Double limite) {
        this.cliente = cliente;
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimite() {
        return limite;
    }
    public void defineLimite(Double limite) {
        this.limite = limite;
    }

    public void deposita(Double quantidade){
        this.saldo += quantidade;

    }
    public void saca(Double quantidade){
        if(this.saldo + this.limite >= quantidade) {
            System.out.println(this.saldo);
            System.out.println(this.limite);
            this.saldo -= quantidade;
        }
    }

    public void transfere(Conta conta, Double quantidade) {
        if (this.saldo + this.limite >= quantidade) {
            this.saldo -= quantidade;
            conta.deposita(quantidade);
        }
    }
    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", cliente='" + cliente + '\'' +
                ", saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }
}

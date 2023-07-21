package ExercicioBanco.Entities;

public class Conta {
    private int numero;
    private String cliente;
    private Double saldo = 0.0;

    public Conta() {

    }

    public Conta(String cliente) {
        this.cliente = cliente;
    }

    public Conta(String cliente, Double saldo){
        this.cliente = cliente;
        this.saldo = saldo;
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
    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }

    public void deposita(Double quantidade){
        this.saldo += quantidade;

    }
    public void saca(Double quantidade){
        if(this.saldo >= quantidade) {
            System.out.println(this.saldo);
            this.setSaldo(this.getSaldo() - quantidade);
        }
    }

    public void transfere(Conta conta, Double quantidade) {
        if (this.saldo >= quantidade) {
            this.saldo -= quantidade;
            conta.deposita(quantidade);
        }
    }
}

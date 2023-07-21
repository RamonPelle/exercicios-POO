package ExercicioBanco.Entities;

public class ContaCorrente extends Conta{

    private Double limite;

    public ContaCorrente() {
    }

    public ContaCorrente(String cliente, Double limite) {
        super(cliente);
        this.limite = limite;
    }

    public Double getLimite() {
        return limite;
    }

//    public void setLimite(Double limite) {
//        this.limite = limite;
//    }

    public void saca(Double quantidade){
        if(this.getSaldo() + this.limite >= quantidade) {
            System.out.println(this.getSaldo());
            System.out.println(this.limite);
            this.setSaldo(this.getSaldo() - quantidade);
        }
    }

    public void transfere(Conta conta, Double quantidade) {
        if (this.getSaldo() + this.limite >= quantidade) {
            this.setSaldo(this.getSaldo() - quantidade);
            conta.deposita(quantidade);
        }
    }

    @Override
    public String toString() {
        return "Corrente{" +
                "numero=" + this.getNumero() +
                ", cliente='" + this.getCliente() + '\'' +
                ", saldo=" + this.getSaldo() +
                ", limite=" + this.getLimite() +
                '}';
    }
}

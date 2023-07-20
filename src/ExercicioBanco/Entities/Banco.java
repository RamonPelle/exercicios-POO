package ExercicioBanco.Entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private int idBanco;
    private static int numBancos = 0;
    private static int idConta = 99;
    private final static int LIMITE_DE_CONTAS = 10;
    private int numContas = 0;
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public Banco() {
        this.idBanco = ++numBancos;
    }
    public Banco(String nome) {
        this.nome = nome;
        this.idBanco = ++numBancos;
    }

    public int getIdBanco() {
        return idBanco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumContas() {
        return numContas;
    }
    public int getNumBancos(){ return numBancos; }

    public List<Conta> getContas() {
        return contas;
    }

    public Conta criarConta(Conta conta) {
        if(LIMITE_DE_CONTAS > getNumContas()) {
            conta.setNumero(idConta);
            idConta++;
            this.contas.add(conta);
            this.numContas++;
            return conta;
        }else{
            return null;
        }
    }

    public int buscarConta(Conta conta){
        for(Conta acc : contas){
            if(acc.getNumero() == conta.getNumero()) {
                return acc.getNumero();
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "idBanco=" + idBanco +
                ", numContas=" + numContas +
                ", nome='" + nome + '\'' +
                ", contas=" + contas +
                '}';
    }
}

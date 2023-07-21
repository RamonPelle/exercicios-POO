package ExercicioBanco.Application;

import ExercicioBanco.Entities.*;

public class SistemaBanco {
    public static void main(String[] args) {
        Banco b1 = new Banco("Banco do Brasil");
        Banco b2 = new Banco("Bradesco");
        Banco b3 = new Banco("Bradesco");
        ContaCorrente c1 = new ContaCorrente("Ramon", 100.0);
        ContaCorrente c2 = new ContaCorrente("Luisa", 200.0);
        ContaPoupanca p1 = new ContaPoupanca("Arthur", 200.0);
        ContaPoupanca p2 = new ContaPoupanca("Roberta", 400.0);

        b1.criarConta(c1);
        b1.criarConta(p1);
        b2.criarConta(c2);
        b2.criarConta(p2);



        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b1.buscarConta(c1)); //esperado: 99
        System.out.println(b1.buscarConta(c2)); //esperado: -1



        c1.deposita(1000.0);
        c2.deposita(1000.0);
        c1.transfere(c2, 1100.0);
        System.out.println(c1);
        System.out.println(c2);

        p1.transfere(p2, 201.0);
        System.out.println(p1);
        System.out.println(p2);



    }
}

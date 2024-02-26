package br.com.fiap.revisao.exercicios.br.com.fiap.bean;

import java.util.Calendar;

public class ContaPoupanca extends Conta implements ContaInvestimento {

    private Float taxa;
    private final Float RENDIMENTO;

    public ContaPoupanca(Float RENDIMENTO) {
        this.RENDIMENTO = RENDIMENTO;
    }

    public ContaPoupanca(Integer agencia, Integer numero, Calendar dataAbertura, Double saldo, Float taxa, Float RENDIMENTO) {
        super(agencia, numero, dataAbertura, saldo);
        this.taxa = taxa;
        this.RENDIMENTO = RENDIMENTO;
    }

    @Override
    public void sacar(double valor) {
        double saldo = getSaldo();
        saldo -= valor;
        if (saldo < 0) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= taxa;
            setSaldo(saldo);
            System.out.println("Valor sacado: " + valor + " | Saldo atual: " + saldo);
        }
    }

    @Override
    public double calculaRetornoInvestimento() {
        return getSaldo() * RENDIMENTO;
    }
}

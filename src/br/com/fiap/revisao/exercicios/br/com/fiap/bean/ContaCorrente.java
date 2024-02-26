package br.com.fiap.revisao.exercicios.br.com.fiap.bean;

import java.util.Calendar;

public class ContaCorrente extends Conta {

    private TipoConta tipo;

    public ContaCorrente() {}

    public ContaCorrente(Integer agencia, Integer numero, Calendar dataAbertura, Double saldo, TipoConta tipo) {
        super(agencia, numero, dataAbertura, saldo);
        this.tipo = tipo;
    }

    @Override
    public void sacar(double valor) {
        double saldo = getSaldo();
        if (tipo == TipoConta.COMUM) {
            saldo -= valor;
            if (saldo < 0) {
                System.out.println("Saldo insuficiente!");
            } else {
                setSaldo(saldo);
                System.out.println("Valor sacado: " + valor + " | Saldo atual: " + saldo);
            }
        } else {
            saldo -= valor;
            setSaldo(saldo);
            System.out.println("Valor sacado: " + valor + " | Saldo atual: " + saldo);
        }
    }
}

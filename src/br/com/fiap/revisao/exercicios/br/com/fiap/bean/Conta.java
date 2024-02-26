package br.com.fiap.revisao.exercicios.br.com.fiap.bean;

import java.util.Calendar;

// Classe Abstrata: não pode ser instanciada e pode conter métodos abstrados (sem implementação)
public abstract class Conta {
    private Integer agencia;
    private Integer numero;
    private Calendar dataAbertura;
    private Double saldo;

    public Conta() {}

    public Conta(Integer agencia, Integer numero, Calendar dataAbertura, Double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Valor depositado: " + valor + " | Saldo atual: " + this.saldo);
    }

    public abstract void sacar(double valor);

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Calendar getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Calendar dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}

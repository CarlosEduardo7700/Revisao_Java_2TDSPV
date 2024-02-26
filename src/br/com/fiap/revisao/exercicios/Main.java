package br.com.fiap.revisao.exercicios;

import br.com.fiap.revisao.exercicios.br.com.fiap.bean.ContaCorrente;
import br.com.fiap.revisao.exercicios.br.com.fiap.bean.ContaPoupanca;
import br.com.fiap.revisao.exercicios.br.com.fiap.bean.TipoConta;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente1 =
                new ContaCorrente(
                        1, 1, new GregorianCalendar(1990, Calendar.AUGUST, 20), 1000.0, TipoConta.COMUM);
        ContaCorrente contaCorrente2 =
                new ContaCorrente(
                        2, 2, new GregorianCalendar(1997, Calendar.JANUARY, 21), 1400.0, TipoConta.ESPECIAL);
        ContaCorrente contaCorrente3 =
                new ContaCorrente(
                        3, 3, new GregorianCalendar(2020, Calendar.DECEMBER, 7), 2000.0, TipoConta.PREMIUM);

        ContaPoupanca contaPoupanca =
                new ContaPoupanca(
                        1, 1, new GregorianCalendar(2004, Calendar.JULY, 19), 100.0, 20.0f, 1.2f);

        List<ContaCorrente> contasCorrentes = new ArrayList<>();
        contasCorrentes.add(contaCorrente1);
        contasCorrentes.add(contaCorrente2);
        contasCorrentes.add(contaCorrente3);

        contasCorrentes.forEach(cc -> System.out.println("Número da Conta: " + cc.getNumero() + " | Saldo: " + cc.getSaldo()));

    }
}

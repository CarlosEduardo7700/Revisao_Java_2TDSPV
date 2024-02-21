package br.com.fiap.revisao.view;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DatasTestes {
    public static void main(String[] args) {
        Calendar hoje = Calendar.getInstance();

        Calendar aniversario = new GregorianCalendar(2005, Calendar.JANUARY, 10);

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Data de hoje: " + format.format(hoje.getTime()));
        System.out.println("Data de aniversário: " + format.format(aniversario.getTime()));

        System.out.println(" ");

        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.of(2002, 2, 22);

        DateTimeFormatter formatterTempo = DateTimeFormatter.ofPattern("hh:mm:ss");
        LocalTime tempo = LocalTime.of(2, 22, 20);

        DateTimeFormatter formatterDataETempo = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        LocalDateTime dataETempo = LocalDateTime.of(2002, 2, 22, 2, 22, 20);

        System.out.println("Data: " + data.format(formatterData));
        System.out.println("Hora: " + tempo.format(formatterTempo));
        System.out.println("Data e Hora: " + dataETempo.format(formatterDataETempo));

    }
}

package exercicios;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DataHora {
    // não preciso da instancia/objeto para invocar o método
    // return LocalDate.of(year, month, day).getDayOfWeek().name(); outro jeito de aparecer o dia da semana
    public static String findDay(int month, int day, int year) {
        LocalDate data = LocalDate.of(year, month, day);
        DayOfWeek dw = data.getDayOfWeek();
        String diaDaSemana = dw.name();
        return diaDaSemana;

    }

    public static void main(String[] args) {

    }
}


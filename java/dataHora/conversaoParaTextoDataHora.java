package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class conversaoParaTextoDataHora {
    public static void main(String[] args) {
        LocalDate data4 = LocalDate.parse("2026-04-28");
        LocalDateTime data5 = LocalDateTime.parse("2026-04-28T01:30:18");
        Instant data6 = Instant.parse("2026-04-28T01:30:18Z");

        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter formato4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter formato5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println(data4.format(formato1));
        System.out.println(formato1.format(data4));
        System.out.println(data4.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println();

        System.out.println(data5.format(formato1));
        System.out.println(data5.format(formato2));
        System.out.println(data5.format(formato4));

        System.out.println();

        System.out.println(formato3.format(data6));
        System.out.println(formato5.format(data6));
    }
}

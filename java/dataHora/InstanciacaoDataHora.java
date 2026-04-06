package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanciacaoDataHora {
    public static void main(String[] args) {

        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate data1 = LocalDate.now();
        LocalDateTime data2 = LocalDateTime.now();
        Instant data3 = Instant.now();

        LocalDate data4 = LocalDate.parse("2026-04-28");
        LocalDateTime data5 = LocalDateTime.parse("2026-04-28T01:30:18");
        Instant data6 = Instant.parse("2026-04-28T01:30:18Z");
        Instant data7 = Instant.parse("2026-04-28T01:30:18-03:00");

        LocalDate data8 = LocalDate.parse("28/04/2026", formato1);
        LocalDateTime data9 = LocalDateTime.parse("28/04/2026 01:30", formato2);

        LocalDate data10 = LocalDate.of(2022, 07, 20);
        LocalDateTime data11 = LocalDateTime.of(2002, 07, 28, 1,30);

        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println(data4);
        System.out.println(data5);
        System.out.println(data6);
        System.out.println(data7);
        System.out.println(data8);
        System.out.println(data9);
        System.out.println(data10);
        System.out.println(data11);
    }

}

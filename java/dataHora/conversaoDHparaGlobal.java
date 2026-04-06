package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class conversaoDHparaGlobal {
    public static void main(String[] args) {
        LocalDate data4 = LocalDate.parse("2026-04-28");
        LocalDateTime data5 = LocalDateTime.parse("2026-04-28T01:30:18");
        Instant data6 = Instant.parse("2026-04-28T01:30:18Z");

        LocalDate result1 = LocalDate.ofInstant(data6, ZoneId.systemDefault()); //horario BR
        LocalDate result2 = LocalDate.ofInstant(data6, ZoneId.of("Portugal"));

        LocalDateTime result3 = LocalDateTime.ofInstant(data6, ZoneId.systemDefault());
        LocalDateTime result4 = LocalDateTime.ofInstant(data6, ZoneId.of("Portugal"));

        System.out.println(result1);
        System.out.println(result2);

        System.out.println();

        System.out.println(result3);
        System.out.println(result4);

        System.out.println();

        System.out.println("dia= " + data4.getDayOfMonth());
        System.out.println("mes= " + data4.getMonthValue());
        System.out.println("ano= " + data4.getYear());

        System.out.println();

        System.out.println("hora= " + data5.getHour());
        System.out.println("hora= " + data5.getMinute());
    }

   
}

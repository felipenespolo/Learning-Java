package dataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class calculoDataHora {
    public static void main(String[] args) {
        LocalDate data4 = LocalDate.parse("2026-04-20");
        LocalDateTime data5 = LocalDateTime.parse("2026-04-28T01:30:18");
        Instant data6 = Instant.parse("2026-04-28T01:30:18Z");

        LocalDate lastWeekLocalDate = data4.minusWeeks(1);
        LocalDate nextWeeLocalDate = data4.plusWeeks(1);

        LocalDate minusYear = data4.minusYears(20);
        LocalDate plusYear = data4.plusYears(20);

        System.out.println(lastWeekLocalDate);
        System.out.println(nextWeeLocalDate);
        System.out.println(minusYear);
        System.out.println(plusYear);

        System.out.println();

        LocalDateTime lastWeekLocalDateTime = data5.minusWeeks(1);
        LocalDateTime nextWeeLocalDateTime = data5.plusWeeks(1);
        
        System.out.println(lastWeekLocalDateTime);
        System.out.println(nextWeeLocalDateTime);

        System.out.println();

        
        Instant lastWeekInstant = data6.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = data6.plus(7, ChronoUnit.DAYS);

        System.out.println(lastWeekInstant);
        System.out.println(nextWeekInstant);


        System.out.println("Duration");

        Duration time1 = Duration.between(lastWeekLocalDateTime, data5);
        System.out.println(time1.toDays());

        Duration time2 = Duration.between(lastWeekLocalDate.atTime(0,0), data4.atTime(0,0)); //conversao para localDateTime 1 forma
        System.out.println(time2.toDays());

        Duration time3 = Duration.between(lastWeekLocalDate.atStartOfDay(), data4.atStartOfDay()); //conversao para localDateTime 2 forma (melhor q a 1)
        System.out.println(time3.toDays());

        Duration time4 = Duration.between(lastWeekInstant, data6);
        System.out.println(time4.toDays());

        Duration time5 = Duration.between(data6, lastWeekInstant);
        System.out.println(time5.toDays());
    }
}

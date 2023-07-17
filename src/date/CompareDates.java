package date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CompareDates {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2022,12,12);
        LocalDate date2 = LocalDate.of(2021,10,12);

        if(date1.isAfter((date2))){
            System.out.println("1.Prawda");
        }
        if(date2.isBefore(date1)){
            System.out.println("2.Prawda");
        }
        if(date2.isEqual(date1)){
            System.out.println("3.nieprawda");
        }
        LocalDateTime localDateTime11 = LocalDateTime.now();


    }
}

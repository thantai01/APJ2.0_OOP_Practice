package DemoDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime myDate = LocalDateTime.now();
        DateTimeFormatter myFormatDate1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter myFormatDate2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        DateTimeFormatter myFormatDate3 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formattedDate1 = myDate.format(myFormatDate1);
        String formattedDate2 = myDate.format(myFormatDate2);
        String formattedDate3 = myDate.format(myFormatDate3);
        System.out.println(formattedDate1);
        System.out.println(formattedDate2);
        System.out.println(formattedDate3);

    }
}

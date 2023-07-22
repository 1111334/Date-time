import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        int endMonthMissing =  localDate.lengthOfMonth() - localDate.getDayOfMonth();
        int endYearMissing = localDate.lengthOfYear() - localDate.getDayOfYear();

        System.out.println("Days remaining at the end of the month " + endMonthMissing);
        System.out.println("days remaining at the end of the year" + endYearMissing);
    }
}












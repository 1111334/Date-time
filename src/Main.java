import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        int endMonthMissing =  localDate.lengthOfMonth() - localDate.getDayOfMonth();
        int endYearMissing = localDate.lengthOfYear() - localDate.getDayOfYear();

        System.out.println("There are " + endMonthMissing + " days left at the end of the month.");
        System.out.println("There are " + endYearMissing + " days left until the end of the year.");
    }
}












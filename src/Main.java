
import java.time.LocalDate;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        // Calcolo dei giorni mancanti alla fine del mese
        LocalDate currentDate = LocalDate.now();
        int endMonthMissing = currentDate.lengthOfMonth() - currentDate.getDayOfMonth();
        System.out.println("Giorni mancanti alla fine del mese: " + endMonthMissing);

        // Calcolo dei giorni mancanti alla fine dell'anno
        Year currentYear = Year.of(currentDate.getYear());
        int endYearMissing = currentDate.lengthOfYear() - currentDate.getDayOfYear();
        System.out.println("Giorni mancanti alla fine dell'anno: " + endYearMissing);
    }
}

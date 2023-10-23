
import java.text.SimpleDateFormat;
import java.util.Date;
public class aktualni_datum {
    public static void aktualni_datum() {

        Date datum = new Date();
        SimpleDateFormat formatdatumu = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        String datumFinal = formatdatumu.format(datum);

        System.out.println("Aktuální datum a čas je: " + datumFinal + "\n");
    }
}

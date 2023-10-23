import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class upravaSlozky {
    public static void kopirovat(String zdroj, String cil) {
        Path zdrojPath = Path.of(zdroj);
        Path cilPath = Path.of(cil);

        try {
            if (Files.isDirectory(zdrojPath)) {
                Files.copy(zdrojPath, cilPath, StandardCopyOption.REPLACE_EXISTING);
            } else {
                Files.copy(zdrojPath, cilPath, StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING);
            }
            System.out.println("Soubor/Adresář byl úspěšně zkopírován.");
        } catch (FileAlreadyExistsException e) {
            System.err.println("Soubor/Adresář na cílové cestě již existuje.");
        } catch (IOException e) {
            System.err.println("Chyba při kopírování souboru/adresáře: " + e.getMessage());
        }
    }

    public static void odstranit(String cesta) {
        Path cestaPath = Path.of(cesta);

        try {
            if (Files.isDirectory(cestaPath)) {
                Files.delete(cestaPath);
            } else {
                Files.delete(cestaPath);
            }
            System.out.println("Soubor/Adresář byl úspěšně odstraněn.");
        } catch (IOException e) {
            System.err.println("Chyba při odstraňování souboru/adresáře: " + e.getMessage());
        }
    }

    public static void prejmenovat(String staryNazev, String novyNazev) {
        Path staryPath = Path.of(staryNazev);
        Path novyPath = Path.of(novyNazev);

        try {
            Files.move(staryPath, novyPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Soubor/Adresář byl úspěšně přejmenován.");
        } catch (FileAlreadyExistsException e) {
            System.err.println("Soubor/Adresář s novým názvem již existuje.");
        } catch (IOException e) {
            System.err.println("Chyba při přejmenování souboru/adresáře: " + e.getMessage());
        }
    }

}

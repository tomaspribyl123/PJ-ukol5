import java.io.File;

public class slozkaNaDisku {

    public void slozkaNaDisku(String cestaKslozce) {
        File slozka = new File(cestaKslozce);

        if (slozka.canRead()) {
            System.out.println("Obsah složky: " + slozka.getAbsolutePath() + "\n");
            File[] soubory = slozka.listFiles();

            if (soubory != null) {
                for (File soubor : soubory) {
                    if (soubor.isFile()) {
                        System.out.println("Soubor: " + soubor.getName() + "\n");
                    } else if (soubor.isDirectory()) {
                        System.out.println("Složka: " + soubor.getName() + "\n");

                    }
                }
            } else {
                System.out.println("Složka je prázdná." + "\n");
            }
        } else {
            System.out.println("Složka není, nebo nemáte oprávnění" + "\n");
        }
    }
}




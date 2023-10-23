public class Main {

    public static void main(String[] args) {
        mocnina_cisla prvni = new mocnina_cisla();
        prvni.mocnina_cisla(5.0);

        goniometricke_funkce druha = new goniometricke_funkce();
        druha.goniometricke_funkce(90);

        trojuhelnik_pravouhly treti = new trojuhelnik_pravouhly();
        treti.trojuhelnik_pravouhly(20, 20);

        trojuhelnik_obecny ctvrty = new trojuhelnik_obecny();
        ctvrty.trojuhelnik_obecny(6, 9, 5);

        platnost_datumu paty = new platnost_datumu();
        paty.platnost_datumu("1.5.2009", "6.8.2008"); //Datumy je třeba zadávat ve formátu "DD.MM.RRRR"

        aktualni_datum sesty = new aktualni_datum();
        sesty.aktualni_datum();

        slozkaNaDisku sedmy = new slozkaNaDisku();
        sedmy.slozkaNaDisku("C:/Users/cobec/Desktop/Create"); //Je třeba zadat vlastní složku

        upravaSlozky osmy = new upravaSlozky();
        osmy.kopirovat("C:/Users/cobec/Desktop/slozka/test.txt", "C:/Users/cobec/Desktop/slozka2/test2.txt");
        osmy.prejmenovat("C:/Users/cobec/Desktop/slozka2/test2.txt", "C:/Users/cobec/Desktop/slozka2/testPrejmenovan.txt");
        osmy.odstranit("C:/Users/cobec/Desktop/slozka/test.txt");
    }


}



public class platnost_datumu {
    public static void platnost_datumu(String prvniDatumStr, String druhyDatumStr) {


        String[] prvniDatumParts = prvniDatumStr.split("\\.");
        String[] druhyDatumParts = druhyDatumStr.split("\\.");

        if (prvniDatumParts.length != 3 || druhyDatumParts.length != 3) {
            System.out.println("Neplatné datum" + "\n");

        } else {
            int prvniDen = Integer.parseInt(prvniDatumParts[0]);
            int prvniMesic = Integer.parseInt(prvniDatumParts[1]);
            int prvniRok = Integer.parseInt(prvniDatumParts[2]);
            int druhyDen = Integer.parseInt(druhyDatumParts[0]);
            int druhyMesic = Integer.parseInt(druhyDatumParts[1]);
            int druhyRok = Integer.parseInt(druhyDatumParts[2]);


            if (prvniDen < 1 || prvniMesic < 1 || prvniRok < 1 ||
                    druhyDen < 1 || druhyMesic < 1 || druhyRok < 1) {
                System.out.println("Neplatné datum" + "\n");
            }


            if (prvniRok < druhyRok ||
                    (prvniRok == druhyRok && prvniMesic < druhyMesic) ||
                    (prvniRok == druhyRok && prvniMesic == druhyMesic && prvniDen <= druhyDen)) {
                System.out.println("Datum je platné a druhý datum je pozdější" + "\n");

            } else {
                System.out.println("Datum je platné a druhý datum není pozdější" + "\n");

            }


        }
    }

}

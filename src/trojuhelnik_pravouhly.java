public class trojuhelnik_pravouhly {
    public static void trojuhelnik_pravouhly(double odvesna1, double odvesna2) {

        double prepona = Math.round(Math.sqrt((Math.pow(odvesna1, 2) + (Math.pow(odvesna2, 2)))));
        System.out.println("odvěsna: " + prepona);
        double uhel1 = 90;
        int uhel2 = (int) Math.toDegrees(Math.asin(odvesna1 / prepona));
        int uhel3 = (int) Math.toDegrees(Math.asin(odvesna2 / prepona));
        System.out.println("Úhly jsou: " + uhel1 + " " + uhel2 + " " + uhel3 + "\n");

    }
}

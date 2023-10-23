public class trojuhelnik_obecny {
    public static void trojuhelnik_obecny(double a, double b, double c) {
        double obvod = a + b + c;

        double s = obvod / 2;
        double obsah = Math.sqrt(s * (s-a) * (s-b) * (s-c));

        double alpha = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c)));
        double beta = Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c)));
        double gamma = Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)));

        System.out.println("Obvod: " + obvod);
        System.out.println("Obsah: " + obsah);
        System.out.println("Uhel alpha: " + alpha + " stupňů");
        System.out.println("Uhel beta: " + beta + " stupňů");
        System.out.println("Uhel gamma: " + gamma + " stupňů"  + "\n");
    }

}

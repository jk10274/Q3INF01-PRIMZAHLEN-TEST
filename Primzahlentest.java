/**
 * Primzahlentest
 */
public class Primzahlentest {

    static int zahl = 7;

    public static void main(String[] args) {
        // teste ob zahl eine primzahl ist
        if (isPrimzahl(zahl)) {
            System.out.println("Die Zahl " + zahl + " ist eine Primzahl.");
        } else {
            System.out.println("Die Zahl " + zahl + " ist keine Primzahl.");
        }

    }

    /**
     * Testet ob eine Zahl eine Primzahl ist.
     * 
     * @param zahl
     * @return
     */
    public static boolean isPrimzahl(int zahl) {
        // teste ob zahl eine Primzahl ist
        for (int i = 2; i < zahl; i++) {
            if (zahl % i == 0) {
                return false;
            }
        }
        return true;
    }
}
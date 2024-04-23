import java.math.*;

public class Kalkulacka {

    public Kalkulacka() {}

    /**Sečte 2 čísla
     *
     * @param a
     * @param b
     * @return
     */
    public double secti(double a, double b) {
        return a + b;
    }

    /**Odečte 2 čísla
     *
     * @param a
     * @param b
     * @return
     */
    public double odecti(double a, double b){
        return a - b;
    }

    /**Vynásobí 2 čísla
     *
     * @param a
     * @param b
     * @return
     */
    public  double vynasob(double a, double b){
        return a * b;
    }

    /**Vydělí první číslo druhým
     *
     * @param a
     * @param b
     * @return
     */
    public double vydel(double a, double b){
        return a / b;
    }

    /** Umocní první číslo druhým
     *
     * @param a
     * @param b
     * @return
     */
    public double umocni(double a, double b){
        return Math.pow(a,b);
    }

    /** vypočítá 2 odmocninu zadaného čísla
     *
     * @param a
     * @return
     */
    public double odmocni(double a){
        return Math.sqrt(a);
    }
}

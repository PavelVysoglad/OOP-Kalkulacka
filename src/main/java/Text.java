
public class Text {


    public Text (){}

    /**Vypíše uvítací větu
     *
     */
    public void uvitej() {
        System.out.println("Vítej v konzolové Java kalkulačce");
    }

    /**Vypíše výčet operací
     *
     */
    public void vypisOperace(){
        System.out.println();
        System.out.println("Zadej číslo požadované operace:");
        System.out.println("1 - sčítání");
        System.out.println("2 - odečítání");
        System.out.println("3 - násobení");
        System.out.println("4 - dělení");
        System.out.println("5 - umocňování");
        System.out.println("6 - odmocňování");
        System.out.println("7 - zobraz pocet provedenych operaci");
        System.out.println();
        System.out.println("9 - ukončení instance");
    }

    /**Vypíše text při ukončení
     *
     */
    public void ukonceni (){
        System.out.println();
        System.out.println("Ukončuji kalkulačku");
    }

    /** Vypí pobídky pro zadání čísel do konzole
     *
     */
    public void zadejPrvni(){
        System.out.println("Zadej první číslo:");
    }
    public void zadejDruhe(){
        System.out.println("Zadej druhé číslo:");
    }

    /**Převede input z konzole na double
     *
     * @param cislo
     * @return
     */
    public double prevod(String cislo){
        return Double.parseDouble(cislo);
    }
}

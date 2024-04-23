import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        /**Vytvoří instanci objektu Kalkulačky
         * Provádí operace zadané uživatelem
         */
        Kalkulacka kalkulacka = new Kalkulacka();
        /**Vytvoří instanci objektu Scanner
         *
         */
        Scanner scanner = new Scanner(System.in);
        /**Vytvoří instanci objektu Text
         * Vypisuje texty, které se v kalkukačce mohou oběvit vícekrát
         */
        Text text = new Text();
        /** Parametry pro metody
         * @ pocet operací - POČÍTADLO PROVEDENÝCH OPERACÍ V KALKULAČCE
         * @ a - slouží jako první parametr pro matematické metody kalkuačky
         * @ b - druhý vstupní parametr matematických metod kalkulačky
         * @ vstup - slouží pro inicializaci metod Kalkulačky
          */
        int pocetOperaci=0;
        double a;
        double b;
        String vstup = "";


        text.uvitej();
        // Hlavní
        while (!vstup.equals("9")) {
            /** 3 sekundy pauza od vypsání posledního výsledku z konzole
             *
             */
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            text.vypisOperace();
            vstup = scanner.nextLine();
            switch (vstup) {
                case "1":
                    text.zadejPrvni();
                    a = text.prevod(scanner.nextLine());
                    text.zadejDruhe();
                    b = text.prevod(scanner.nextLine());
                    pocetOperaci++;
                    System.out.println(kalkulacka.secti(a, b));
                    break;
                case "2":
                    text.zadejPrvni();
                    a = text.prevod(scanner.nextLine());
                    text.zadejDruhe();
                    b = text.prevod(scanner.nextLine());
                    pocetOperaci++;
                    System.out.println(kalkulacka.odecti(a, b));
                    break;
                case "3":
                    text.zadejPrvni();
                    a = text.prevod(scanner.nextLine());
                    text.zadejDruhe();
                    b = text.prevod(scanner.nextLine());
                    pocetOperaci++;
                    System.out.println(kalkulacka.vynasob(a, b));
                    break;
                case "4":
                    text.zadejPrvni();
                    a = text.prevod(scanner.nextLine());
                    text.zadejDruhe();
                    b = text.prevod(scanner.nextLine());
                    pocetOperaci++;
                    System.out.println(kalkulacka.vydel(a, b));
                    break;
                case "5":
                    text.zadejPrvni();
                    a = text.prevod(scanner.nextLine());
                    text.zadejDruhe();
                    b = text.prevod(scanner.nextLine());
                    pocetOperaci++;
                    System.out.println(kalkulacka.umocni(a, b));
                    break;
                case "6":
                    System.out.println("Zadej číslo k odmocnění:");
                    a = text.prevod(scanner.nextLine());
                    pocetOperaci++;
                    System.out.println(kalkulacka.odmocni(a));
                    break;
                case "7":
                    System.out.println("Bylo provedeno "+pocetOperaci+" operací");;
                    break;
                default:
                    if (vstup.equals("9")){
                        System.out.println("Opravdu si přejete ukončit?     Ano/ne");
                        String odpoved = scanner.nextLine().trim().toLowerCase();
                        if (odpoved.equals("ano") ) {
                            text.ukonceni();
                        }
                    } else {
                        System.out.println("Zadán neplatný požadavek: \"" + vstup+"\"");
                    }
            }
        }
    }

}

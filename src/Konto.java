public class Konto {
    private String kontoInhaber;
    private double kontostand;
    private int idNumber; // 1,2,3,...9999 jede Nummer soll nur einmal vorkommen
    // soll automatisch festgelegt werden
    // Ideen:  -irgendwie etwas unique setzen...
    // Es braucht einen Zahlenwert, einen Range,

    public static int s_anzahlKonto = 10; // initialisierung mit einer höheren Zahl
    // s_ als naming convention damit man sieht, dass das static ist

/*
    public void setKontoInhaber(String kontoInhaber){
        this.kontoInhaber = kontoInhaber;
        kontostand = 0;

    }*/

    public void aufbuchen (double betrag) {
        if (betrag > 0) {
            kontostand = kontostand + betrag;
        }
        else{
            System.out.println("Nur Werte > 0 sind erlaubt.");
        }
    }

    public void abbuchen (double betrag){
        if (kontostand >= betrag){
            kontostand -= betrag;
        }
        else {
            System.out.println("Nicht genügend Geld am Konto");
        }
    }

    public void print () {
        System.out.println("Kontoinhaber: " +  kontoInhaber + " ; Kontostand:  "+ kontostand + " ID= " + s_anzahlKonto);
    }
// Erstelle ein neues Kommentar

    public Konto (String kontoInhaber) {
        // Konstruktor legt fest, dass kein Objekt ohne diesem Attribut erstellt werden kann
        this.kontoInhaber = kontoInhaber;
        kontostand = 0;// Erster Wert wird festgelegt
        this.idNumber = s_anzahlKonto++;
    }


    }





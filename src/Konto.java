public class Konto {
    private String kontoInhaber;
    private double kontostand;

    public void setKontoInhaber(String kontoInhaber){
        this.kontoInhaber = kontoInhaber;
        kontostand = 0;
    }

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
        System.out.println("Kontoinhaber: " +  kontoInhaber + " ; Kontostand:  "+ kontostand);
    }


    public Konto (String kontoInhaber) {
        // Konstruktor legt fest, dass kein Objekt ohne diesem Attribut erstellt werden kann
        this.kontoInhaber = kontoInhaber;
        kontostand = 0;
    }


    }





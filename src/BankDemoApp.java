public class BankDemoApp {
    public static void main(String[] args) {

        Konto max = new Konto("Max Mustermann");
        max.setKontoInhaber("Max Mustermann");
        max.print();

        max.aufbuchen(1000);
        max.print();

        max.abbuchen(800);
        max.print();

        max.abbuchen(300);
        max.print();

        //Konto susi = new Konto();
        Konto susi = new Konto("Susi Sorglos");
        susi.aufbuchen(100_000);
        susi.print();
// Damit nicht etwas annonym aufgebucht werden kann - brauche ich / will ich einen Kontoinhaber
        // ES gibt keinen Studi ohne Matrikelnummer, kein Auto ohne Fahrgestellnr
       // Keine Versicherung ohne Versicherungsnummer
        //ABHILFE _ Konstruktoren
        // haben keinen Rückgabetyp und sind nach der Klasse benannt




    }
}

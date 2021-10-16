public class InvoiceBuilderApp {
    public static void main(String[] args) {
        double article1 = 0;// Gute Gewohnheit ist es die Var mit Null zu definieren.
        double article2 = 0;//STRG + d ...um Zeile zu duplizieren
        double article3 = 0;
        double article4 = 0;
        double article5 = 0;

        //fiktives Beispiel
        article1 = 2.4; // Kaffee
        article2 = 2.0; // Kipferl
        article3 = 2.9; // Yoghurt


        double summe = article1+article2+article3+article4+article5;
        System.out.println("Der Gesamtbetrag ist " + summe);



    }
}

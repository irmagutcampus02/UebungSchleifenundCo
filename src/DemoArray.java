public class DemoArray {
    public static void main(String[] args) {
        double articles [] = new double[5];  // Deklariere einen Array
        // Gute Gewohnheit, wenn Arrays mit Mehrzahl benannt werden
        // Array ist ja auch eine Liste

        articles[0] = 2.4;// Befüllen des 1. Elements
        articles[1] = 2.0;// 2. Element
        articles[2] = 2.9;// 3. Element
        // 4. und 5. Element sind standardmäßig initialisiert - Standardwert ist Null

        double sum = articles[0] + articles[1] + articles[2] +articles[3] +articles[4];
        System.out.println("sum =" + sum);
        // Das Ergebnis ist 7,3000000000000000001 ? Warum?
        // Warum? Die PCs tun sich mit Gleitkomma zahlen sehr schwer.

        // Zusammenzählen mit einer for Schleife
        // Summiere erstes Element mit 2. mit 3. und so weiter

        double sum1 = 0;
        sum1 = sum1 + articles[0]; // sum = 2,4
        sum1 = sum1 + articles[1]; // sum = 4.4
        sum1 = sum1 + articles[2]; // sum = 7.3
        sum1 = sum1 + articles[3]; // sum = 7.3
        sum1 = sum1 + articles[4]; // sum = 7.3
        System.out.println("Neues Summenergebnis = sum1 = " +sum1);

        double sumFor = 0;
       // for (int i = 0; i < 5; i++){
        for (int i = 0; i < articles.length; i++){
            sumFor = sumFor + articles[i];
            System.out.println("i = " + i);
        }
        System.out.println("sumFor = " + sumFor);
        // besser wäre, wenn ich dann einfacher auch das Array erhöhen kann -
        // und die for SChleife weiß, wie groß der Array ist.
        // Wie? mit articles.length







    }


}

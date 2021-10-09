public class FindEven {
    public static void main(String[] args) {

            int count;
            count = 1;
            int end = 10;

            while (count <= end) {
                System.out.println("Ich bin in der Schleife.");
                if (count % 2 == 0) {
                    System.out.println("bin gerade: " + count);
                }
                count ++;
            }

            // for SChleife mit n Durchläufe
            for (int i = 1; i<=10; i++ ){
                // so lange i kleiner gleich 10 wird ddie for schleife ausgeführt
                System.out.println("Durchlauf Nr. : " + i);
            }

            // for SChleife von 10 herunter
            for (int j = 10; j >= 0; j --) {
                System.out.println("Durchlauf Nr.: " + j);
            }

            // nur jeder 5 wert k+=5   =>   k= k+5
            for (int k = 20; k <= 90; k+= 5){
                System.out.println(k);
            }


    }
}

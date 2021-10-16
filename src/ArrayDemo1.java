public class ArrayDemo1 {
    public static void main(String[] args) {

    int NumbersArray1 [] = new int[3];
    NumbersArray1 [0] = 27;
    NumbersArray1 [1] = 20;
    NumbersArray1 [2] = 53;

    // int [] array1 = {1,2,3}

    int NumbersArray2 [] = new int[3];
        NumbersArray2 [0] = 10;
        NumbersArray2 [1] = 3;
        NumbersArray2 [2] = 5;

    for (int i =0; i <NumbersArray1.length;i++) {
        System.out.print(NumbersArray1[i] + NumbersArray2[i] + ", ");
    }
        System.out.println(" ");
    System.out.println( "Das Ergnis der Multiplikationen ist ...");

        for (int i =0; i <NumbersArray1.length;i++) {
            System.out.print(NumbersArray1[i] * NumbersArray2[i] + ", ");
        }

    }

}

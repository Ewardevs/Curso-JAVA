package bucles;

public class Bucle {
    static void main(String[] args) {


        final int MAX_COUNT = 5;
        for (int currentNumber = 0; currentNumber < MAX_COUNT; currentNumber++) {
            IO.println("valor -> " + currentNumber);
        }
//        int counter =1;
//        while (counter<5){
//            IO.println("counter -> "+counter);
//            counter++;
//        }
//
//        do {
//            IO.println("2x"+counter+"="+counter*2);
//            counter++;
//        }while(counter<=10);
    }
}

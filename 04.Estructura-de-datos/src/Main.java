import java.util.ArrayList;

public class Main{
    static void main(String[] args) {
        int[] primitivos = new int[5];

        primitivos[0]= 1;
        primitivos[1]= 2;
        for (int i : primitivos) {
            IO.println(i);
        }
        IO.println("---------------");
        Integer[] wrapper = new Integer[5];

        wrapper[0]= 56;
        for (Integer i :wrapper){
            IO.println(i);
        }

    }
}
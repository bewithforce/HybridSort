import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Array.createArray();
        Algorithms al = new Algorithms();
        long start0;
        long finish0 = 0;
        long min = 0;
        long min_size = 0;
        for (; Variables.SIZE_OF_PIECE < 200; Variables.SIZE_OF_PIECE++) {
            int[][] a = Array.fillArrays();
            for (int i = 0; i < Variables.NUMBER_OF_ARRAYS; i++) {
                start0 = System.nanoTime();
                al.hybridSort(a[i]);
                finish0 = (System.nanoTime() - start0);
            }
            System.out.println("Гибридная сортировка: " + finish0
                    + " наносекунды, размер куска = " + Variables.SIZE_OF_PIECE);
            if (min == 0) {
                min = finish0;
                min_size = Variables.SIZE_OF_PIECE;
            } else if(finish0 < min){
                min = finish0;
                min_size = Variables.SIZE_OF_PIECE;
            }
        }

        System.out.println("Самая быстрая: " + min
                + " наносекунды, при размере куска = " + min_size);
    }
}

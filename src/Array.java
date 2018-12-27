import java.io.*;
import java.util.Scanner;

public class Array {

    public static void createArray() throws IOException {
        String filePath = "src\\array.txt";
        BufferedWriter out = new BufferedWriter(new FileWriter(filePath));
        for (int j = 0; j < Variables.NUMBER_OF_ARRAYS; j++) {
            for (int i = 0; i < Variables.ARRAY_LENGTH; i++) {
                int number = (int) (Math.random() * Variables.NUMBER_TO);
                out.write(number + "  ");
            }
        }
        out.close();
    }

    public static int[][] fillArrays() throws IOException {
        File file = new File( "src\\array.txt");
        int[][] array = new int[Variables.NUMBER_OF_ARRAYS][Variables.ARRAY_LENGTH];
        Scanner in = new Scanner(file);
        for (int j = 0; j < Variables.NUMBER_OF_ARRAYS; j++) {
            for (int i = 0; i < Variables.ARRAY_LENGTH; i++) {
                array[j][i] = in.nextInt();
            }
        }
        in.close();
        return array;
    }
}

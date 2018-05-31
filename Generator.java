import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class Generator {
    static void randomNumbs(int count, int max, int min) {

        int[] randomNumberInteger = new int[count];

        for (int i = 0; i <= count - 1; i++)
            randomNumberInteger[i] = (int) ((Math.random() * ((max - min) + 1)) + min);

        write(randomNumberInteger);
    }

    private static void write(int numbers[]) {
        try {
            FileWriter fileWriter = new FileWriter("RandomNumbers.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            for (int number : numbers)
                printWriter.println(Integer.toString(number));

            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

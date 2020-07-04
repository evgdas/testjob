package util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WorkWithFile {
    public static List<String> readDataFile(String filename) {
        LinkedList<String> dataFromFile = new LinkedList<>();
        try {
            Scanner scanner = new Scanner(new FileReader(filename));
            while (scanner.hasNext()) {
                dataFromFile.add(scanner.nextLine());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return dataFromFile;
    }

    public static void writeDataFile(String filename, LinkedList<String> dataForWrite) {
        try {
            FileWriter writer = new FileWriter(filename, false);
          while (!dataForWrite.isEmpty()){
                try {
                    writer.write(dataForWrite.pollLast());
                    writer.append('\n');
                } catch (IOException e) {
                    e.printStackTrace();
                }
            };
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}

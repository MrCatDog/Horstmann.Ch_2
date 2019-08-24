package Hrostmann.ch02;

import com.opencsv.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class CSV {
    public static void write (String fileName, String record) throws Exception {
        CSVWriter writer = new CSVWriter(new FileWriter(fileName,true));
        String[] SplitRecord = record.split(",");
        writer.writeNext(SplitRecord);
        writer.close();
    }
    public static void read (String fileName) throws Exception {
        CSVReader reader = new CSVReader(new FileReader(fileName));
        String[] line;
        while((line = reader.readNext()) != null)
        {
            if(line!=null)
                System.out.println(Arrays.toString(line));
        }
        reader.close();
    }
}

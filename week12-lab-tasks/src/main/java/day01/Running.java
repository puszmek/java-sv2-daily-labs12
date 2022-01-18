package day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class Running {

    private List<Run> runList = new ArrayList<>();

    public List<Run> readAllLines(Path path) {
        try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {
            String line;
            bufferedReader.readLine();      // előolvasás, amivel kizárjuk a fejlécet
            while ((line = bufferedReader.readLine()) != null) {
                Run run = createRunObject(line);
                runList.add(run);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not reach file", ioe);
        }
        return runList;
    }

    public double sumMileage(int year, Month month) {
        double sum = 0;
        for (Run actual : runList) {
            if (actual.getDate().getYear() == year && actual.getDate().getMonth() == month) {
                sum += actual.getKm();
            }
        }
        return sum;
    }

    private Run createRunObject(String line) {
        Run run;
        try {
            String[] temp = line.split(" km;");
            double firstParameter = Double.parseDouble(temp[0]);
            LocalDate secondParameter = LocalDate.parse(temp[1]);
            run = new Run(firstParameter, secondParameter);
        } catch (NumberFormatException | NullPointerException | DateTimeParseException exception) {
            throw new IllegalArgumentException("Invalid data!", exception);
        }
        return run;
    }
}

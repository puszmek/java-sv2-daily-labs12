package day01;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class RunningTest {

    Running running = new Running();
    Path path = Path.of("src/test/resources/running.csv");

    @Test
    void testReadAllLines() {
        List<Run> runList = running.readAllLines(path);
        assertEquals(7, runList.size());
        assertEquals(7.1, runList.get(0).getKm());
        assertEquals(8.9, runList.get(5).getKm());
        assertEquals(LocalDate.of(2021, 12, 3), runList.get(2).getDate());
        assertEquals(LocalDate.of(2022, 1, 8), runList.get(6).getDate());
    }

    @Test
    void testReadAllLinesWithInvalidPath() {
        Path path1 = Path.of("src/test/resources/running00.csv");
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> running.readAllLines(path1));
        assertEquals("Can not reach file", ise.getMessage());
    }

    @Test
    void testSumMileage() {
        running.readAllLines(path);
        double sum = running.sumMileage(2021, Month.DECEMBER);
        assertEquals(41.2, sum, 1);
    }
}
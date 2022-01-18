package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RunTest {

    @Test
    void testCreateRun() {
        Run run = new Run(12.4, LocalDate.of(2022, 1, 10));
        assertEquals(12.4, run.getKm());
        assertEquals(LocalDate.of(2022, 1, 10), run.getDate());
    }
}
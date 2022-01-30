package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionOfSubjectsTest {

    @Test
    void testReadFromFile() {
        DivisionOfSubjects divisionOfSubjects = new DivisionOfSubjects("src/test/resources/beosztas.txt");
        divisionOfSubjects.getSubjects();
        int result = divisionOfSubjects.numberOfLessonNumberByName("Albatrosz Aladin");
        assertEquals(24, result);
    }
}
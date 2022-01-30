package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class DivisionOfSubjects {

    private List<Subject> subjects = new ArrayList<>();

    public DivisionOfSubjects() {
    }

    public DivisionOfSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public DivisionOfSubjects(String fileName) {
        readFromFile(fileName);
    }

    private void readFromFile(String fileName) {
        try (BufferedReader br = Files.newBufferedReader(Path.of(fileName))) {
            String name;
            while ((name = br.readLine()) != null) {
                subjects.add(new Subject(name, br.readLine(), br.readLine(), Integer.parseInt(br.readLine())));

            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not reach file!", ioe);
        }
    }

    public int numberOfLessonNumberByName(String name) {
        int number = 0;
        for (Subject actual : subjects) {
            if (name.equals(actual.getTeacher())) {
                number += actual.getNumberOfLesson();
            }
        }
        return number;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}

package day04;

public class Subject {

    private String teacher;
    private String subject;
    private String nameOfClass;
    private int numberOfLesson;

    public Subject(String teacher, String subject, String nameOfClass, int numberOfLesson) {
        this.teacher = teacher;
        this.subject = subject;
        this.nameOfClass = nameOfClass;
        this.numberOfLesson = numberOfLesson;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getSubject() {
        return subject;
    }

    public String getNameOfClass() {
        return nameOfClass;
    }

    public int getNumberOfLesson() {
        return numberOfLesson;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "teacher='" + teacher + '\'' +
                ", subject='" + subject + '\'' +
                ", nameOfClass='" + nameOfClass + '\'' +
                ", numberOfLesson=" + numberOfLesson +
                '}';
    }
}

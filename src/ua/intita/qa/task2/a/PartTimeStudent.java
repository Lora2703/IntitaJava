package ua.intita.qa.task2.a;

public class PartTimeStudent extends Student{
    private String formOfEducation;
    private int course;

    public PartTimeStudent(String name, String surname, int age, String gender,
                           String faculty, String formOfEducation, int course) {
        super(name, surname, age, gender, faculty);
        this.formOfEducation = formOfEducation;
        this.course = course;
    }

    @Override
    public void exams(String name) {
        System.out.println(name + " exams as part-time student");
    }

    @Override
    public String toString() {
        return "PartTimeStudent{" +
                "formOfEducation='" + formOfEducation + '\'' +
                ", course=" + course +
                '}';
    }
}

package ua.intita.qa.task2.a;

public class Main {
    public static void main(String[] args) {
        PartTimeStudent student = new PartTimeStudent("Vasyl", "Baruch", 18, "male",
                "biology", "part-time", 1);

        student.exams(student.getName());
    }
}
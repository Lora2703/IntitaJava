package ua.intita.qa.task2.a;

public abstract class Student implements Entrant {
    private String name;
    private String surname;
    private int age;
    private String gender;
    private String faculty;

    public Student(String name, String surname, int age, String gender, String faculty) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.faculty = faculty;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }

    @Override
    public void exams(String param) {

    }
}

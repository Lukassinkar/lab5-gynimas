package student;

import java.util.Comparator;

public class Student implements Comparable {
    private int id;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String group;
    private double average;

    public Student(int id, String name, String surname, String dateOfBirth, String group, double average) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.group = group;
        this.average = average;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setSurname(String name) {
        this.surname = surname;
    }

    public String getDate() {
        return dateOfBirth;
    }

    public void setDate(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String grupe) {
        this.group = grupe;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }


    public String toString() {
        return "StudentImpl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + dateOfBirth + '\'' +
                ", grupe='" + group + '\'' +
                ", average=" + average +
                '}';
    }

    public int compareTo(Object o) {
        return Comparator.comparing(Student::getAverage).reversed().compare(this, (Student) o);
    }
}

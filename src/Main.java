import student.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Lukas", "Sinkar", "1999-01-11", "J19", 10);
        Student student2 = new Student(1, "Almantas", "Sinkar", "2000-02-11", "T19", 7);
        Student student3 = new Student(1, "Mantas", "Astrauskas", "1999-07-15", "G19", 3);
        Student student4 = new Student(1, "Tomas", "Bartasius", "1998-05-03", "J19", 4);
        Student student5 = new Student(1, "Paulius", "Stuksys", "1999-01-07", "ZP16", 3);
        Student student6 = new Student(1, "Justas", "Cinkus", "1999-07-11", "T19", 8);
        Student student7 = new Student(1, "Dovydas", "Kazlauskas", "1999-07-27", "G19", 2);
        Student student8 = new Student(1, "Antanas", "Baranauskas", "1997-06-10", "G19", 10);
        Student student9 = new Student(1, "Aurimas", "Antolevicius", "2000-02-28", "T19", 9);
        Student student10 = new Student(1, "Domantas", "Steponavicius", "1999-08-22", "T19", 6);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);

        System.out.println("Fakulteto studentu sarasas:");
        for (Student student : students) {
            System.out.println(student);
        }

        Scanner s = new Scanner(System.in);

        System.out.println("\nIveskite grupes pavadinima");
        while (s.hasNextLine()) {
            String group = s.nextLine();

            if (group.isEmpty()) {
                break;
            }

            System.out.println("Studentu skaicius " + getGroupStudentCount(group, students));
            System.out.println("\nIveskite grupes pavadinima");
        }

        Collections.sort(students);

        System.out.println("\nFakulteto studentu sarasas pagal pazanguma:");
        for (Student student : students) {
            System.out.println(student);
        }

        students.removeIf(student -> student.getAverage() < 4);
        System.out.println("\nFakulteto studentu sarasas po ismetimu:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static int getGroupStudentCount(String group, ArrayList students) {
        int count = 0;

        Iterator<Student> i = students.iterator();

        while (i.hasNext()) {
            Student student = i.next();

            if (student.getGroup().equals(group)) {
                count++;
            }
        }

        return count;
    }
}

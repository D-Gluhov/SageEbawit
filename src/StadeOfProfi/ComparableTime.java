package StadeOfProfi;

import java.util.*;

public class ComparableTime {
    public static void main(String[] args) {
        Student s1 = new Student(19, "Roma", "Teshev");
        Student s4 = new Student(400, "Roma", "Ablisov");
        Student s2 = new Student(5225, "Zaur", "Tregulov");
        Student s3 = new Student(254, "Masha", "Petrova");

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        System.out.println("Do sortirovki \n" + list);
        Collections.sort(list, new NameComparator());
        System.out.println("Posle sortirovki \n" + list);

        list.sort(Comparator.comparing(Student::getId).thenComparing(Student::getName));
        System.out.println(list);
    }

}
class Student implements Comparable<Student> {
    private int id;
    private String name;
    private String surname;

    public Student(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.id == otherStudent.id ? 0 : (this.id > otherStudent.id ? 1 : -1);
    }
}

class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
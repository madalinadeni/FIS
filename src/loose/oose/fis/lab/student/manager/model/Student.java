package loose.oose.fis.lab.student.manager.model;

import java.util.Objects;

public class Student {
    private String firstName;
    private String last_Name;
    private int age;
    private double meanGrade;

    public Student(String firstName, String last_Name, int age, double meanGrade) {
        this.firstName = firstName;
        this.last_Name = last_Name;
        this.age = age;
        this.meanGrade = meanGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + last_Name + '\'' +
                ", age=" + age +
                ", meanGrade=" + meanGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Double.compare(student.meanGrade, meanGrade) == 0 &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(last_Name, student.last_Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, last_Name, age, meanGrade);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return last_Name;
    }

    public void setLastName(String lastName) {
        this.last_Name = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMeanGrade() {
        return meanGrade;
    }

    public void setMeanGrade(double meanGrade) {
        this.meanGrade = meanGrade;
    }
}

package Collections.Comparable;

import java.lang.Comparable;

public class Student implements Comparable<Student> {
    private String name;
    private String phone;
    private int rollNo;

    @Override
    public int compareTo(Student student) {
        return student.phone.compareTo(student.phone);
    }

    public Student(String name, String phone, int rollNo) {
        this.name = name;
        this.phone = phone;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }


}

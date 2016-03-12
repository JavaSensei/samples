package ru.kpfu.itis.group11506.student;

public class Student {

    private final String studentName;

    public Student(String studentName) {
	this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void show() {
        System.out.println("My name is " + 
                                 getStudentName());
    }

}

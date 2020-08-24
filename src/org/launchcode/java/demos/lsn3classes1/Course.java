package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;


public class Course {
    private String teacherName;
    private String subject;
    private ArrayList Student = new ArrayList();

    public Course(String teacherName, String subject, ArrayList student) {
        this.teacherName = teacherName;
        this.subject = subject;
        Student = student;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ArrayList getStudent() {
        return Student;
    }

    public void setStudent(ArrayList student) {
        Student = student;
    }
}

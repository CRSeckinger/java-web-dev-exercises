package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;


public class Course {
    private String teacherName;
    private String subject;
    private ArrayList<Student> roster;

    public Course(String teacherName, String subject) {
        this.teacherName = teacherName;
        this.subject = subject;
        this.roster = new ArrayList<>(); //empty ArrayList
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


}

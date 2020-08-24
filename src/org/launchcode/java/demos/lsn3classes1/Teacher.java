package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public void setFirstName (String newFirstName) {
        firstName =newFirstName;
    }
    public String getFirstName () {
        return firstName;
    }

    public void setLastName (String newLastName) {
        lastName =newLastName;
    }
    public String getLastName () {
        return lastName;
    }

    public void setSubject (String newSubject) {
        subject =newSubject;
    }
    public String getSubject () {
        return subject;
    }

    public void setYearsTeaching (int newTeaching) {
        yearsTeaching =newTeaching;
    }
    public int getYearsTeaching () {
        return yearsTeaching;
    }
}

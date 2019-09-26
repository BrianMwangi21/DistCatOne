package com.kabiru.alpha.models;

public class Student {

    private long id, score;
    private String studentNumber, firstName, attachment;

    public Student() {
        // Empty constructor
    }

    public Student(long id, String studentNumber, String firstName, long score, String attachment ) {
        this.id = id;
        this.score = score;
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.attachment = attachment;
    }

    public Student(String studentNumber, String firstName) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", score=" + score +
                ", studentNumber='" + studentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", attachment='" + attachment + '\'' +
                '}';
    }
}

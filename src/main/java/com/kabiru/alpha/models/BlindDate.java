package com.kabiru.alpha.models;

public class BlindDate {

    private long id;
    private String requested, reason;
    private Student student;
    private Match match;

    public BlindDate() {
        // Empty constructor
    }

    public BlindDate(long id, Student student, Match match, String requested, String reason) {
        this.id = id;
        this.student = student;
        this.match = match;
        this.requested = requested;
        this.reason = reason;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRequested() {
        return requested;
    }

    public void setRequested(String requested) {
        this.requested = requested;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    @Override
    public String toString() {
        return "BlindDate{" +
                "id=" + id +
                ", requested='" + requested + '\'' +
                ", reason='" + reason + '\'' +
                ", student=" + student +
                ", match=" + match +
                '}';
    }
}

package com.aanshik.learn_hibernate.Entity;

import javax.persistence.Embeddable;


//To involve these rows in some other table we use embeddable
@Embeddable
public class Certificate {
    String course;

    int durationInHrs;

    public Certificate() {
    }

    public Certificate(String course, int durationInHrs) {
        this.course = course;
        this.durationInHrs = durationInHrs;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getDurationInHrs() {
        return durationInHrs;
    }

    public void setDurationInHrs(int durationInHrs) {
        this.durationInHrs = durationInHrs;
    }
}

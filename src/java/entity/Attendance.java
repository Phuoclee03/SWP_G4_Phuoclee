/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author leduy
 */
public class Attendance extends BaseEntity {
    
    private Session session;
    private Student student;
    private boolean status;
    private Group group;
    private String description;
    private Date datetime;
    private Instructor instructor;
    private TimeSlot timeslot;

    public Attendance() {
    }

    public Attendance(Session session, Student student, boolean status, Group group, String description, Date datetime, Instructor instructor, TimeSlot timeslot) {
        this.session = session;
        this.student = student;
        this.status = status;
        this.group = group;
        this.description = description;
        this.datetime = datetime;
        this.instructor = instructor;
        this.timeslot = timeslot;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public TimeSlot getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(TimeSlot timeslot) {
        this.timeslot = timeslot;
    }
    
    
}

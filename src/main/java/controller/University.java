package controller;

import entity.Student;

import java.util.ArrayList;

public class University<Students, Courses> {
    public Student[] getStudents() {
        return new Student[0];
    }

    public Student[] getCourses() {
        return new Student[0];
    }

    private ArrayList<Students> students = (ArrayList<Students>) new ArrayList<Student>();
    private ArrayList<Courses> courses = new ArrayList<Courses>();

    public boolean buyCourses(Object nameOfCourses, Object studentEmail, Integer noOfItems) {
        return false;
    }
}

package Courses;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private int numberOfStudents=0;

    private ArrayList<String> students = new ArrayList<>(numberOfStudents);

    public void setStudents(String studentName) {
        students.add(studentName);
        numberOfStudents++;
    }
    public String getStudents(int i){
        return students.get(i);
    }
    public int arrayListSize(){
        return students.size();
    }

    //construct + SET
    public Course(String courseName) {
        this.courseName = courseName;
    }


    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

}

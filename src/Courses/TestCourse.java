package Courses;

import java.util.ArrayList;

public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        ArrayList<Course> courses = new ArrayList<Course>();

        course1.setStudents("Peter Jones");
        course1.setStudents("Brian Smith");
        course1.setStudents("Anne Kennedy");

        course2.setStudents("Peter Jones");
        course2.setStudents("Steve Smith");

        System.out.println("Number of students in course1: " + course1.arrayListSize());

        for (int i = 0; i < course1.arrayListSize(); i++){
            System.out.print(course1.getStudents(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < course2.arrayListSize(); i++){
            System.out.print(course2.getStudents(i) + " ");
        }
        System.out.println("---------------------");

        System.out.println("Number of students in course2: " + course2.arrayListSize());
    }
}

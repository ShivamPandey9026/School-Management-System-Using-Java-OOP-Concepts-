/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.management.system;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author spshi
 */
public class School {
    private List<Teacher>teachers;
    private List<Student>students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;
    
    
    /**
     * New school object is created.
     * @param teachers lists of teachers in school.
     * @param students lists of student in school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    
    /**
     * Adds teachers in the schools.
     * @param teacher the teacher is to be added in the school.
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }
    
    /**
     * 
     * @return returns the lists of teachers in school.
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    
    /**
     * Adds students to the school.
     * @param students the student to be added in the school.
     */
    public void addStudents(Student student) {
        students.add(student);
    }
    
    /**
     * 
     * @return the lists of the students in school.
     */
    public List<Student> getStudents() {
        return students;
    }

    
    
    /**
     * 
     * @return the totalMoneyEarned by the school.
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money by the school.
     * @param totalMoneyEarned 
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }
    
    
    /**
     * 
     * @return the totalMoneySpent by the school.
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
    
    /**
     * Update the money spent by the school which 
     * is the salary given by the school to the teachers.
     * @param totalMoneySpent 
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -=  moneySpent;
    }
    
    
    
}

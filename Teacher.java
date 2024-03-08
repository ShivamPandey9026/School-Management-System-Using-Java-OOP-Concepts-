/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.management.system;

/**
 *Created by Shivam Pandey on 25-02-2024.
 * This class is responsible for keeping the track 
 * of  teacher's name, teacher's salary.
 * @author spshi
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Created a new Teacher object.
     * @param id id of the teacher.
     * @param name name of the teacher.
     * @param salary salary of the teacher.
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    
    /**
     * 
     * @return return the name of the teacher.
     */
    public int getId() {
        return id;
    }

    
    /**
     * 
     * @return return the name of the teacher. 
     */
    public String getName() {
        return name;
    }

    
    /**
     * 
     * @return return the salary of the teacher.
     */
    public int getSalary() {
        return salary;
    }
         
    /**
     * 
     * @param salary set the salary of the teacher
     */
    public void setSalary(int salary){
        this.salary = salary;
    }
    
    
    /**
     * Adds to salary.
     * Removes from the total money earned by the school.
     * @param salary 
     */
    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
            
    }
    
    @Override
    public String toString(){
        return "Teachers's name: "+name+
                "\nTotal Salary earned by teacher so far $"+salaryEarned+"."
                ;
    }
}

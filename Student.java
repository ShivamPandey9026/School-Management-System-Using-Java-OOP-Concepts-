/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.management.system;


/**
 *Created by Shivam Pandey
 * This class is responsible for keeping the 
 * track of students fees ,name ,grade ,& fees paid.
 * @author spshi
 */
public class Student {
    private int sid;
    private String sname;
    private int grade;
    private int feesPaid;
    private int feesTotal;
    
    /**
     * To create the new student by initializing.
     * @param id id for the Student: unique.
     * @param name name of the student.
     * @param grade grade of the student.
     */
    public Student(int sid, String sname, int grade){
        this.sid = sid;
        this.sname = sname;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 20000;
    }
    
    
    /**
     * Not going to change the id ,name and feesTotal.
     */
    public void setGrade(int grade){
        this.grade = grade;
    }
    
    /**
     * feesPaid = feesPaid + fees.
     * add the fees to feesPaid.
     * @param fees 
     */
    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    
    /**
     * 
     * @return returns the id of the student.
     */
    public int getId() {
        return sid;
    }

    
    /**
     * 
     * @return returns the name of the student.
     */
    public String getName() {
        return sname;
    }

    
    /**
     * 
     * @return returns the grade of the student. 
     */
    public int getGrade() {
        return grade;
    }

    
    /**
     * 
     * @return returns the feesPaid by the student. 
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    
    /**
     * 
     * @return returns the total fees of the student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }
    
    
    /**
     * returns the remaining Fees.
     */
    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }
    
    @Override
    public String toString(){
        return "Student's name: "+sname+
                "\n Total fees paid so far $"+feesPaid+"."
                ;
    }
    
    
}


package school.management.system;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author spshi
 */
public class Main {
    public static void main(String[] args) {
        Teacher raavi = new Teacher(1,"Ravi",2000);
        Teacher mukesh = new Teacher(2,"Mukesh",1000);
        Teacher adr = new Teacher(3,"Adr",2000);
        List<Teacher>teacherList = new ArrayList<>();
        teacherList.add(raavi);
        teacherList.add(mukesh);
        teacherList.add(adr);
        
        
        Student ravi= new Student(1 ,"Ravi", 2);
        Student vishal= new Student(2 ,"Vishal",4);
        Student sham= new Student(4 ,"Sham", 3 );
        List<Student>studentList = new ArrayList<>();
        
        studentList.add(ravi);
        studentList.add(vishal);
        studentList.add(sham);
        
        School gps = new School(teacherList,studentList);
        
        
        ravi.payFees(4000);
        //System.out.println("GHS has Earned "+gps.getTotalMoneyEarned());
        vishal.payFees(3000);
        System.out.println("GHS has Earned "+gps.getTotalMoneyEarned());
        
        raavi.receiveSalary(raavi.getSalary());
        System.out.println("Ghs has spent salary to "+ raavi.getName());
        System.out.println("GHS has Earned "+gps.getTotalMoneyEarned());
        System.out.println(ravi);
        raavi.receiveSalary(raavi.getSalary());
        System.out.println(raavi);
    }
}

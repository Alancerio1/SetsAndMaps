/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setsmapslab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author alancerio18
 */
public class SetsMapsLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee e1 = new Employee("Bob", "John", "111-11-111");
        Employee e2 = new Employee("Alex", "may", "222-22-222");
        Employee e3 = new Employee("John", "Doe", "333-33-333");
        Employee e4 = new Employee("Jake", "man", "333-33-333");
        
        Set<Employee> employees = new TreeSet<Employee>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        
        for(Employee e: employees)
        {
            System.out.println(e);
        }
        
        
        List<Employee> emp = new ArrayList<>(employees);
        
        for(Employee s: emp){
            System.out.println(s);
        }
        
        
        Collections.sort(emp, new CompareByFirstName());
        
        for(Employee n: emp){
            System.out.println(n);
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setsmapslab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
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
        Employee e3 = new Employee("John", "Doe", "333-33-333");
        Employee e1 = new Employee("Bob", "John", "111-11-111");
        Employee e4 = new Employee("Jake", "man", "444-44-444");
        Employee e2 = new Employee("Alex", "may", "222-22-222");

        Set<Employee> employees = new TreeSet<Employee>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        System.out.println("");
        System.out.println("lab2");
        Map employeeMap = new HashMap(); 
        employeeMap.put("111-11-111", e1);
        employeeMap.put("222-22-222", e2);
        employeeMap.put("444-44-444", e3);
        employeeMap.put("444-44-444", e4);
        Set keys = employeeMap.keySet();
        for(Object key : keys) {
            Employee found = (Employee)employeeMap.get(key);
            System.out.println(found.toString());
        }
        
        System.out.println("");
        System.out.println("Lab3");
        Employee person = null;

        Map<String, Employee> empMap = new TreeMap<String, Employee>();
        empMap.put("444-44-444", e4);
        empMap.put("111-11-111", e1);
        empMap.put("333-33-3333", e3);
        empMap.put("222-22-222", e2);

        Set<String> keys2 = empMap.keySet();
        for (String key : keys2) {
            Employee found = empMap.get(key);
            System.out.println(found.toString());
        }
        System.out.println("");
        System.out.println("lab3 sorted by first name");
        Collection<Employee> empValues = empMap.values();
       
        List<Employee> sortedList = new ArrayList<Employee>(empValues);
       
        Collections.sort(sortedList, new CompareByFirstName());
        for(Employee emp : sortedList) {
            System.out.println(emp);
        }
        
        
        
        System.out.println("");
        System.out.println("Lab4");
       Iterator<Employee> i = employees.iterator();
        while( i.hasNext() ) {
             person= i.next();
            System.out.println(person);
        }
        System.out.println("");
        System.out.println("Lab4 alternative sorting");
        List<Employee> emp = new ArrayList<>(employees);
        
        for(Employee s: emp){
          
        }
        Collections.sort(emp, new CompareByFirstName());
        
        for(Employee n: emp){
            System.out.println(n);
        }
    }
}

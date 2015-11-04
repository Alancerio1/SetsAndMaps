/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setsmapslab;

import java.util.Comparator;

/**
 *
 * @author alancerio18
 */
public class CompareByFirstName implements Comparator<Employee>{
    
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getFirstName().compareTo(e2.getFirstName());
    }
}

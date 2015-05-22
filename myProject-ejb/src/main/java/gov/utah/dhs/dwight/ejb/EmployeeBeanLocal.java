/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.utah.dhs.dwight.ejb;

import gov.utah.dhs.dwight.entities.Employee;
import gov.utah.dhs.dwight.utility.Response;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author rdarbham
 */
@Local
public interface EmployeeBeanLocal {
    public List<Employee> getAllEmployees();
    public Response createEmployee(Employee employee);
}

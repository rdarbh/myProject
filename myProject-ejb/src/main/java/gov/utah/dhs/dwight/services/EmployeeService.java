/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.utah.dhs.dwight.services;

import gov.utah.dhs.dwight.ejb.EmployeeBeanLocal;
import gov.utah.dhs.dwight.entities.Employee;
import gov.utah.dhs.dwight.utility.Response;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author rdarbham
 */
@WebService(serviceName = "Employee")
@Stateless()
public class EmployeeService {
    @EJB
    private EmployeeBeanLocal bean;

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getEmployees")
    public List<Employee> getEmployees() {
        return bean.getAllEmployees();
    }
    
    @WebMethod(operationName = "createEmployee")
    public Response createEmployee(Employee employee) {
        return bean.createEmployee(employee);
    }
}

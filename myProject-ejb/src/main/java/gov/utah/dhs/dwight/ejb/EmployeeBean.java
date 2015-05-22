/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.utah.dhs.dwight.ejb;

import gov.utah.dhs.dwight.entities.Employee;
import gov.utah.dhs.dwight.utility.Response;
import gov.utah.dhs.dwight.utility.Status;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author rdarbham
 */
@Stateless
public class EmployeeBean implements EmployeeBeanLocal {

    @PersistenceContext(unitName = "myPU")
    private EntityManager emf;

    @Override
    public List<Employee> getAllEmployees() {
        Query q = emf.createNamedQuery("Employee.findAll");
        return q.getResultList();
    }

    @Override
    public Response createEmployee(Employee employee) {
        if (employee == null) {
            return setResponse(Status.ERROR, "Employee cannot be null");
        }
        if (StringUtils.isBlank(employee.getName())) {
            return setResponse(Status.ERROR, "Employee name cannot be left empty");
        }
        if (employee.getAge() <= 0 || employee.getAge() > 120) {
            return setResponse(Status.ERROR, "Employee age can be between 1 or 120");
        }

        emf.persist(employee);
        System.out.println("Employee record inserted");
        return setResponse(Status.SUCCESS, "Employee record inserted");
    }

    /**
     * Returns the response for the client
     *
     * @param status
     * @param msg
     * @return
     */
    private Response setResponse(Status status, String msg) {
        return new Response(status, msg);
    }
}

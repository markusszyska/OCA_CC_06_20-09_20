/**
 * 
 */
package models;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import interfaces.IObserver;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class ApplicationModel  {
	private static String userAuthenticateName;
	private Employee employee;
	private List<Employee> employees;
	private final List<IObserver> observers;
	
	
	public void registerObservers(IObserver ... observers) {
		this.observers.addAll(Arrays.asList(observers));
	}
	
	public void registerObserver(IObserver observer) {
		this.observers.add(observer);
	}
	
	public void removeObserver(IObserver observer) {
		this.observers.remove(observer);
	}
	
	
	public void notifyObservers(String event) {
		this.observers.forEach(observer->observer.update(event));		
	}
	
	
	/**
	 * @return the employees
	 */
	public List<Employee> getEmployees() {
		return employees;
	}

	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public ApplicationModel() {
		this.userAuthenticateName = new String();
		this.observers = new ArrayList<>();
	}

	/**
	 * @return the userAuthenticateName
	 */
	public static String getUserAuthenticateName() {
		return userAuthenticateName;
	}

	/**
	 * @param userAuthenticateName the userAuthenticateName to set
	 */
	public void setUserAuthenticateName(String userAuthenticateName) {
		ApplicationModel.userAuthenticateName = userAuthenticateName;
	}

	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
    

}

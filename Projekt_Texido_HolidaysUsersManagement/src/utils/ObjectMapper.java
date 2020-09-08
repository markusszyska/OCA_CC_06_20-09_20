/**
 * 
 */
package utils;

import java.util.List;
import java.util.stream.Collectors;

import models.Deparment;
import models.Employee;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class ObjectMapper {

	public static List<Employee>  mapListStringToListEmployee(List<String[]> src) {
		return src.stream()
			.map(x->new Employee(x[0], x[1], x[2], x[3], new Deparment(x[4]))).collect(Collectors.toList());
		
	}
}

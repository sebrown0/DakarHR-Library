package library.object_models.modules.payroll.left_menu;

import library.object_models.modules.payroll.left_menu.employees.ContactNumbers;
import library.object_models.modules.payroll.left_menu.employees.SalaryDetails;
import library.object_models.modules.payroll.left_menu.employee_others.AbsenceEntitlements;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import library.left_menu.LeftMenuElements;

/**
* Generated Class.
* ----------------
* Source:  C:/Users/SteveBrown/eclipse-workspace/2021/DakarHR-Library/src/main/resources/xml/site_map.xml
* Author:  SteveBrown
* Version: 1.0.0
* Created: 28/04/2022 12:38:45
*/

public class LeftMenuPayroll implements LeftMenuElements {

	private static final List<String> EMPLOYEES = Arrays.asList(
		ContactNumbers.MENU_TITLE,
		SalaryDetails.MENU_TITLE
	);
	public List<String> getEmployees() {
		return EMPLOYEES;
	}

	private static final List<String> EMPLOYEE_OTHERS = Arrays.asList(
		AbsenceEntitlements.MENU_TITLE
	);
	public List<String> getEmployeeOthers() {
		return EMPLOYEE_OTHERS;
	}

	@SuppressWarnings("unchecked")
	public Map<String, Optional<List<String>>> getAll(){
		return Stream.of(new Object[][] {
				{"Employees", Optional.of(EMPLOYEES)},
				{"EmployeeOthers", Optional.of(EMPLOYEE_OTHERS)}
			}).collect(Collectors.toMap(d -> (String) d[0], d -> ((Optional<List<String>>) d[1])));		
	}
}
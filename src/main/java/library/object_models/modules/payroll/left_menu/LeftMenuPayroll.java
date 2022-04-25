package library.object_models.modules.payroll.left_menu;

import library.object_models.modules.payroll.left_menu.employees.SalaryDetails;
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
* Created: 25/04/2022 13:30:09
*/

public class LeftMenuPayroll implements LeftMenuElements {
	private static final List<String> EMPLOYEES = Arrays.asList(
		SalaryDetails.MENU_TITLE
	);
	public List<String> getEmployees() {
		return EMPLOYEES;
	}
		@SuppressWarnings("unchecked")
		public Map<String, Optional<List<String>>> getAll(){
			return Stream.of(new Object[][] {
				{"Employees", Optional.of(EMPLOYEES)}
			}).collect(Collectors.toMap(d -> (String) d[0], d -> ((Optional<List<String>>) d[1])));		
		}
}
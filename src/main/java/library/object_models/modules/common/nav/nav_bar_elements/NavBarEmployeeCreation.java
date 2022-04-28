package library.object_models.modules.common.nav.nav_bar_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import library.common.helpers.element.Closable;
import library.nav.nav_bar_elements.NavBarElement;
import core_data.CoreData;

import library.object_models.modules.payroll.top_right_nav.employees.EmployeeCreation;

/**
* Generated Class.
* ----------------
* Source:  C:/Users/SteveBrown/eclipse-workspace/2021/DakarHR-Library/src/main/resources/xml/site_map.xml
* Author:  SteveBrown
* Version: 1.0.0
* Created: 28/04/2022 12:38:45
*/
public class NavBarEmployeeCreation extends NavBarElement {
	public static final String ORIGINAL_NAME = "Employee Creation";

	public NavBarEmployeeCreation(CoreData coreData) {
		super(coreData, ORIGINAL_NAME);
	}

	@Override
	public Closable clickElement() {
		WebElement el = 
			super.getNavBar().findElement(By.xpath(".//li/a/i[contains(@class, 'fa fa-plus')]"));
		el.click();
		return new EmployeeCreation(coreData);
	}

}
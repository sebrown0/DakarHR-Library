package library.object_models.modules.common.nav.nav_bar_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core_data.CoreData;
import library.common.helpers.element.Closable;
import library.object_models.modules.payroll.top_right_nav.authorisation.Authorisations;

/**
* Generated Class.
* ----------------
* Source:  C:/Users/SteveBrown/eclipse-workspace/2021/DakarHR-Library/src/main/resources/xml/site_map.xml
* Author:  SteveBrown
* Version: 1.0.0
* Created: 03/05/2022 10:50:04
*/
public class NavBarAuthorisations extends NavBarElement {
	public static final String ORIGINAL_NAME = "Authorisations";

	public NavBarAuthorisations(CoreData coreData) {
		super(coreData, ORIGINAL_NAME);
	}

	@Override
	public Closable clickElement() {
		WebElement el = 
			super.getNavBar().findElement(By.xpath(".//li/a/i[contains(@class, 'fa fa-id-card')]"));
		el.click();
		return new Authorisations(coreData);
	}

}
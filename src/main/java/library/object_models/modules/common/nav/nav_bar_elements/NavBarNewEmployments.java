/**
 * 
 */
package library.object_models.modules.common.nav.nav_bar_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core_data.CoreData;
import library.common.helpers.element.Closable;

/**
 * @author Steve Brown
 *
 */
public class NavBarNewEmployments extends NavBarElement {	
	public static final String ORIGINAL_NAME = "New Employments";
	
	public NavBarNewEmployments(CoreData coreData) {
		super(coreData, ORIGINAL_NAME);
	}
	
	@Override
	public Closable clickElement() {
		WebElement el = super.getNavBar().findElement(By.xpath(".//li/a/i[contains(@class, 'fa fa-user-plus')]"));
		el.click();
//		return new NewEmployments(driver, ORIGINAL_NAME);
		System.out.println("[NavBarNewEmployments] -> NewEmployments not implemented."); // TODO - remove or log
		return null;
	}
}

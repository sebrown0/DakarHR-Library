/**
 * 
 */
package library.object_models.modules.common.nav.nav_bar_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core_data.CoreData;
import library.common.helpers.element.Closable;
import library.common.helpers.element.NoElement;

/**
 * @author Steve Brown
 *
 */
public class NavBarUserManagment extends NavBarElement {
	public static final String ORIGINAL_NAME = "User Management";
	
	public NavBarUserManagment(CoreData coreData) {
		super(coreData, ORIGINAL_NAME);
	}
	
	@Override
	public Closable clickElement() {
		WebElement el = super.getNavBar().findElement(By.xpath(".//li/a/i[contains(@class, 'fa fa-user-circle-o')]"));
		el.click();
		System.out.println("[NavBarUserManagment] not implemented."); // TODO - remove or log
		return new NoElement(ORIGINAL_NAME);	
//		return new UserManagment(driver, ORIGINAL_NAME);
	}	
}
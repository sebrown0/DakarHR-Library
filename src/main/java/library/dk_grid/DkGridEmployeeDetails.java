package library.dk_grid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import core_data.CoreData;
import library.common.controls.getters.ElementGetter;
import library.common.controls.interfaces.Control;
import library.common.panels.JsPanelWithIFrame;

/**
 * @author SteveBrown
 * @version 1.0
 * @since 1.0
 *
 */
public final class DkGridEmployeeDetails extends JsPanelWithIFrame implements Control {	
	private DkGrid<FindRowByEmpId> grid;
	private By locator;
	
	public static final String PANEL_TITLE = "Employee Details";	

	public DkGridEmployeeDetails(CoreData coreData, By locator) {
		super(coreData, PANEL_TITLE);
		
		this.locator = locator;		
		grid = new DkGrid<>(driver, locator, new FindRowByEmpId(), super.manager);
	}
	
	// Grid
	public DkGrid<FindRowByEmpId> getGrid() {
		return grid.loadGridIfNecessary();
	}
	
	@Override // Control
	public boolean isAvailable() {
		return 
				(new ElementGetter(driver).getElementIfClickable(this) != null) 
					? true : false;
	}
	
	@Override //Control
	public By getLocator() {
		return locator;
	}

	@Override //Control
	public WebDriver getDriver() {
		return driver;
	}	

	@Override //Control
	public WebElement getElement() {
		//Doesn't have an element. TODO - why?
		return null;
	}
}

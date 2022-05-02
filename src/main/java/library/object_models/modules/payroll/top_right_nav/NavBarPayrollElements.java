package library.object_models.modules.payroll.top_right_nav;

import library.object_models.modules.common.nav.nav_bar_elements.NavBarAuthorisations;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.openqa.selenium.WebDriver;
import library.object_models.modules.common.nav.nav_bar_elements.NavBarElement;
import library.object_models.modules.common.nav.nav_bar_elements.NavBarElementStrategy;
import library.object_models.modules.common.nav.quick_links.QuickLinks;
import library.object_models.modules.common.nav.quick_links.QuickLinksPayroll;
import core_data.CoreData;

/**
* Generated Class.
* ----------------
* Source:  C:/Users/SteveBrown/eclipse-workspace/2021/DakarHR-Library/src/main/resources/xml/site_map.xml
* Author:  SteveBrown
* Version: 1.0.0
* Created: 02/05/2022 16:33:47
*/

public class NavBarPayrollElements implements NavBarElementStrategy {
	private Map<String, NavBarElement> elements;
	private WebDriver driver;
	private CoreData coreData;

	public NavBarPayrollElements(CoreData coreData) {
		this.coreData = coreData;
		this.driver = coreData.getWebDriver();
		setElements();
	}

	private void setElements(){
		elements = Stream.of(new Object[][] {{
			NavBarAuthorisations.ORIGINAL_NAME, new NavBarAuthorisations(coreData)}
		}).collect(Collectors.toMap(data -> (String) data[0], data -> (NavBarElement) data[1])); 
	}

	@Override
	public Map<String, NavBarElement> getElements() {
		return elements;
	}

	@Override
	public QuickLinks getQuickLinks() {
		return new QuickLinksPayroll(driver);
	}
}
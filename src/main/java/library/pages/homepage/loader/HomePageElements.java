package library.pages.homepage.loader;

import context_manager.ContextManager;
import context_manager.contexts.Context;
import core_data.CoreData;
import library.dto.entites.company.Company;
import library.left_menu.LeftMenu;
import library.nav.nav_bar_elements.NavBarElementStrategy;
import library.nav.quick_links.QuickLink;
import library.pages.homepage.HomePage;


/**
 * @author SteveBrown
 * @version 1.0
 * 	Initial
 * @version 1.1
 * 	Add setCoreData(...)
 * @version 1.2
 * 	Renamed 
 * @since 1.0
 *
 * This is passed to ModuleLoader so it can load the 
 * correct elements for the module.
 *  
 */
public interface HomePageElements {
	void setCoreData(CoreData coreData);
	void setLeftMenuElements(LeftMenu menu);
	
	HomePage getHomePage();
	Context getContextForModule();
	NavBarElementStrategy getElementStrategy(ContextManager contextManager);
	QuickLink getQuickLinkToLoadModule();	
	String getModuleName();	
	Company getCompany();
}

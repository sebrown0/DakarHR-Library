/**
 * 
 */
package library.left_menu;

import static utils.text_utils.StringUtils.replaceUnderScoresWithSpaceAndAsPascalCase;

import java.util.Map;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebElement;

import context_manager.ContextManager;
import context_manager.ContextState;
import core_data.CoreData;
import library.common.forms.ContainerAction;
import utils.clazz.ClassFieldGetter;

/**
 * @author SteveBrown
 * @version 1.0
 * 	Initial
 * @since 1.0
 *
 * Actions that can be performed on a LeftMenu object.
 */
public class LeftMenuActions {
	private Logger logger;
	private ContextManager contextManager;	
	private Map<String, WebElement> anchors;
	private LeftMenuMapper menuMapper;	
	private MenuContextChecker menuContextChecker;
	private CoreData coreData;
	
	public LeftMenuActions(CoreData coreData, Map<String, WebElement> anchors, LeftMenuMapper menuMapper) {
		this.coreData = coreData;
		this.logger = LogManager.getLogger(LeftMenuActions.class);
		this.contextManager = coreData.getContextManager();
		this.anchors = anchors;
		this.menuMapper = menuMapper;
		this.menuContextChecker = new MenuContextChecker(contextManager);
	}
	
	public Optional<ContainerAction> clickAndLoad(Class<?> clazz) {		
		/*
		 * 
		 * CHECK IF WE NEED TO CHANGE OR GET NEW CONTAINER!!
		 * 
		 */
		contextManager.switchToLeftMenu();		// Puts the context @ Module.StateLeftMenu
		ClassFieldGetter fieldGetter = new ClassFieldGetter(clazz);
		return getMenuItemAsContainer(fieldGetter);
	}

	private Optional<ContainerAction> getMenuItemAsContainer(ClassFieldGetter fieldGetter) {				
		Optional<String> prntName = fieldGetter.getParentName();
		Optional<String> menuItem = fieldGetter.getMenuItemName();
		
		if(prntName.isPresent()) {
			var formattedName = 
					replaceUnderScoresWithSpaceAndAsPascalCase(prntName.get());
			
			if(isChildMenuItem(formattedName, menuItem)) {			
				return clickParent(formattedName).loadElement(fieldGetter);			
			}else if (isParentMenuItem(formattedName)) {
				return loadElement(fieldGetter);
			}	
		}		
		return Optional.empty();
	}
	
	private boolean isChildMenuItem(String prntName, Optional<String> menuIem) {		
		if(prntName.length() > 1 && menuIem.isPresent()) {
			return true;
		}	
		return false;
	}
	
	private boolean isParentMenuItem(String prntName) {
		if(prntName.equals("") || prntName.length() < 1) {
			return true;
		}		
		return false;
	}
		
	/*
	 * Returns either an existing or new ContainerAction.
	 * ContainerAction is a JsPanel, Form etc that has ContextState in the form of: myContext.	 * 
	 */
	private Optional<ContainerAction> loadElement(ClassFieldGetter fieldGetter) {
		Optional<ContainerAction> elementContainer = Optional.empty();		
		Optional<String> elementName = fieldGetter.getMenuItemName();
		Optional<String> elementId = fieldGetter.getPanelTitle();
				
		if(elementName.isPresent() && elementId.isPresent()) {
			String name = elementName.get();
			String id = elementId.get();
			WebElement e =  anchors.get(name);
					
			logger.info("Loading [" + name + "]");
			
			try {
				e.click();				
				Optional<ContextState> cs = contextManager.findContext(id);				
				if(menuContextChecker.isExistingContext(cs)) {
					elementContainer = menuContextChecker.getExistingContainerFromContext(name, cs.get());
					menuContextChecker.setExistingAsCurrent(elementContainer);					
				}else { 	
					elementContainer = Optional.of(getNewElementContainer(name));
					logger.debug("[" + elementContainer.get().toString() + "] does not exist. Creating now");
				}											
			} catch (Exception ex) {
				logger.error("Could not get menu element [" + name + "] [" + ex.getMessage() + "]");				 	
			}	
		}else {
			logger.error("Could not get menu element.");
		}
		return elementContainer; 
	}
		
	public LeftMenuActions clickParent(String prntName) {
		contextManager.switchToLeftMenu();		
		WebElement activeMenuItem = getActiveMenuItem();
		if(activeMenuItem != null) {
			String currentlyActive = activeMenuItem.getText().trim();			
			if(!currentlyActive.equalsIgnoreCase(prntName)) {
				anchors.get(prntName).click();
			}	
		}	else {
			anchors.get(prntName).click();
		}
		return this;
	}

	public WebElement getActiveMenuItem() {
		WebElement activeMenuItem = null;
		try {
			activeMenuItem = menuMapper
					.getMenuElement()
					.findElement(By.cssSelector("a[class='dcjq-parent active']"));
		} catch (NoSuchSessionException e) {
			logger.error("No session found. Driver has probably been closed [" + e.getMessage() + "]"); 	
		} catch (Exception e) {
			logger.debug("No active menu element");
		}
		return activeMenuItem;
	}
	
	private ContainerAction getNewElementContainer(String elementName) {
		MenuElementFactory elementFactory = new PayrollLeftMenuElementFactory(coreData); 
		return elementFactory.getElementForName(elementName);		
	}
}

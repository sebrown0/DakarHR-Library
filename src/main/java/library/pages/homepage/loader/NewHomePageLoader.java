package library.pages.homepage.loader;

import org.openqa.selenium.WebDriver;

import core_data.CoreDataLoader;
import library.exceptions.HomePageElementException;
import library.pages.homepage.HomePage;

/**
 * @author SteveBrown
 * @version 1.0
 * 	Initial
 * @since 1.0
 * 
 * Create a new HomePage.
 * Use when there is no existing HomePage, i.e. login.
 */
public final class NewHomePageLoader extends HomePageLoader{
	public NewHomePageLoader(WebDriver driver, HomePageElements elements) throws HomePageElementException {
		super(driver, elements);

		super.initialiseLoader(new CoreDataLoader(driver));
	}

	@Override
	public HomePage loadHomePage() {		
		super.loadModule();
		super.loadCompany();
		super.hp = super.elements.getHomePage();
		super.initialiseHomePage(super.hp);
		return super.hp;
	}

}
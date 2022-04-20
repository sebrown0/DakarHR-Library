package library.pages.homepage;

import java.util.Optional;

import core_data.CoreData;
import library.common.forms.ContainerAction;
import library.dto.entites.company.Company;
import library.dto.entites.payroll.PayGroup;
import library.helpers.payroll_initialise.InitialisePayroll;
import library.helpers.payroll_initialise.PayrollInitialiser;
import library.object_models.modules.payroll.left_menu.payroll.PayrollElement;

/**
 * @author SteveBrown
 * @version 1.0
 * 	Initial
 * @since 1.0
 */
public final class HomePagePayroll extends HomePage {

	public HomePagePayroll(CoreData coreData) {
		super(coreData);		
	}

	// Actions 
	public HomePagePayroll initialisePayroll(Company forCompany, PayGroup payGroup) {
		PayrollInitialiser initialiser = new PayrollInitialiser(this, forCompany, payGroup, super.getLeftMenu());		
		return initialiser.initialisePayroll();
	}
	
	public InitialisePayroll openInitialisePayroll() {
		return openOneOfMyElements(InitialisePayroll.class);
	}
	
//	public GlobalAdjustments openGlobalAdjustments() {
//		return openOneOfMyElements(GlobalAdjustments.class);
//	}
	
	// Helpers
	@SuppressWarnings("unchecked")
	private <T extends PayrollElement> T openOneOfMyElements(Class<T> clazz){
		T initPay = null;
		Optional<ContainerAction> initPayCont =	leftMenu.clickAndLoad(clazz);
		if(initPayCont.isPresent()) {
			initPay = (T) initPayCont.get();					
		}
		return initPay;
	}
	
	// Getters and setters
	@Override
	public String getModuleName() {
		return "Payroll";
	}

}
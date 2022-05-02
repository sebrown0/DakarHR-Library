package library.object_models.modules.payroll.left_menu.employee_others;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import java.util.List;
import java.util.Arrays;
import org.openqa.selenium.By;
import control_builder.*;
import site_mapper.annotations.SiteMap;
import org.junit.jupiter.api.DynamicTest;
import annotations.TestControl;
import control_builder.control_getters.ControlGetter;
import control_builder.control_getters.group.ControlGetterGroup;
import library.common.panels.JsPanelWithIFrame;
import control_data.ControlData;
import core_data.CoreData;
import control_builder.control_getters.single.ControlGetterTextOut;
import control_builder.control_getters.single.ControlGetterButton;
import control_builder.control_getters.group.ControlGetterInputGroup;

/**
* Generated Class.
* ----------------
* Source:  C:/Users/SteveBrown/eclipse-workspace/2021/DakarHR-Library/src/main/resources/xml/site_map.xml
* Author:  SteveBrown
* Version: 1.0.0
* Created: 02/05/2022 15:09:01
*/

@SuppressWarnings("unused")
public class AbsenceEntitlements extends JsPanelWithIFrame {
	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	public static final String PANEL_TITLE = "Employee Absence Entitlements";
	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	public static final String MENU_TITLE = "Absence Entitlements";
	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	public static final String MENU_PARENT_NAME = "Employee_Others";

	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	public AbsenceEntitlements(){}

	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	public AbsenceEntitlements(CoreData coreData){
		super(coreData, PANEL_TITLE);
		buildMyControls();
	}

	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	private void buildMyControls() {
		ControlGetter txoFormID =
			new ControlGetterTextOut("txoFormID", coreData, By.id("FORM_ID"), this);
		ControlGetter btnEmployeeList =
			new ControlGetterButton("btnEmployeeList", coreData, By.cssSelector("div[title='Search Employee']"), this);
		ControlGetterGroup empLookup =
			new ControlGetterInputGroup("EmpLookup", coreData, By.cssSelector("div[class='input-group']"))
				.addControls(Arrays.asList(txoFormID, btnEmployeeList));
		var myControls =
			List.of(
				new ControlData(empLookup)
			);
		super.buildPanelControls(myControls);
	}



	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	@TestControl(type="element", subtype="TextOut")
	public DynamicTest TextOutFormIDFunctionTest () {
		return DynamicTest.dynamicTest("[TextOutFormIDFunctionTest] *NOT IMPLEMENTED*", () -> assertTrue(true));
	}

	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	@TestControl(type="element", subtype="Button")
	public DynamicTest ButtonEmployeeListFunctionTest () {
		return DynamicTest.dynamicTest("[ButtonEmployeeListFunctionTest] *NOT IMPLEMENTED*", () -> assertTrue(true));
	}

}
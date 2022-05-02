package library.object_models.modules.payroll.left_menu.employees;

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
import control_builder.control_getters.group.ControlGetterTabs;
import control_builder.control_getters.single.ControlGetterLabel;
import control_builder.control_getters.group.ControlGetterTab;

/**
* Generated Class.
* ----------------
* Source:  C:/Users/SteveBrown/eclipse-workspace/2021/DakarHR-Library/src/main/resources/xml/site_map.xml
* Author:  SteveBrown
* Version: 1.0.0
* Created: 02/05/2022 15:09:01
*/

@SuppressWarnings("unused")
public class SalaryDetails extends JsPanelWithIFrame {
	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	public static final String PANEL_TITLE = "Employee Salary Details";
	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	public static final String MENU_TITLE = "Salary Details";
	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	public static final String MENU_PARENT_NAME = "Employees";

	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	public SalaryDetails(){}

	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	public SalaryDetails(CoreData coreData){
		super(coreData, PANEL_TITLE);
		buildMyControls();
	}

	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	private void buildMyControls() {
		ControlGetter txoFormID =
			new ControlGetterTextOut("txoFormID", coreData, By.id("FORM_ID"), this);
		ControlGetter btnEmployeeList =
			new ControlGetterButton("btnEmployeeList", coreData, By.cssSelector("div[title='Search Employee']"), this);
		ControlGetter btnSalaryHistory =
			new ControlGetterButton("btnSalaryHistory", coreData, By.cssSelector("div[title='View Salary History']"), this);
		ControlGetter btnCombos =
			new ControlGetterButton("btnCombos", coreData, By.cssSelector("div[title='Combos']"), this);
		ControlGetter btnGridView =
			new ControlGetterButton("btnGridView", coreData, By.cssSelector("div[title='Grid View for this Employee']"), this);
		ControlGetter btnExistingRecords =
			new ControlGetterButton("btnExistingRecords", coreData, By.cssSelector("div[title='Grid View for existing records']"), this);
		ControlGetter btnDocuments =
			new ControlGetterButton("btnDocuments", coreData, By.cssSelector("div[title='No Documents Attached']"), this);
		ControlGetter btnCalendar =
			new ControlGetterButton("btnCalendar", coreData, By.cssSelector("i[class='fa fa-calendar fa-fw']"), this);
		ControlGetter lblLabelReason =
			new ControlGetterLabel("lblLabelReason", coreData, By.cssSelector("label[for='REASON']"), this);
		ControlGetterGroup salaryDetails =
			new ControlGetterTab("SalaryDetails", coreData, By.cssSelector("a[id='tab-tab1']"))
				.addControls(Arrays.asList(lblLabelReason));
		ControlGetterGroup tabs =
			new ControlGetterTabs("Tabs", coreData, By.cssSelector("ul[class='nav nav-tabs']"))
				.addControls(Arrays.asList(salaryDetails));
		ControlGetterGroup datePicker =
			new ControlGetterInputGroup("DatePicker", coreData, By.cssSelector("div[class='input-group date datepicker']"))
				.addControls(Arrays.asList(btnCalendar));
		ControlGetterGroup empLookup =
			new ControlGetterInputGroup("EmpLookup", coreData, By.cssSelector("div[class='input-group']"))
				.addControls(Arrays.asList(txoFormID, btnEmployeeList, btnSalaryHistory, btnCombos, btnGridView, btnExistingRecords, btnDocuments));
		var myControls =
			List.of(
				new ControlData(empLookup),
				new ControlData(datePicker),
				new ControlData(tabs),
				new ControlData(salaryDetails)
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

	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	@TestControl(type="element", subtype="Button")
	public DynamicTest ButtonSalaryHistoryFunctionTest () {
		return DynamicTest.dynamicTest("[ButtonSalaryHistoryFunctionTest]", () -> fail("*NOT IMPLEMENTED*"));
	}

	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	@TestControl(type="element", subtype="Button")
	public DynamicTest ButtonCombosFunctionTest () {
		return DynamicTest.dynamicTest("[ButtonCombosFunctionTest] *NOT IMPLEMENTED*", () -> assertTrue(true));
	}

	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	@TestControl(type="element", subtype="Button")
	public DynamicTest ButtonGridViewFunctionTest () {
		return DynamicTest.dynamicTest("[ButtonGridViewFunctionTest] *NOT IMPLEMENTED*", () -> assertTrue(true));
	}

	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	@TestControl(type="element", subtype="Button")
	public DynamicTest ButtonExistingRecordsFunctionTest () {
		return DynamicTest.dynamicTest("[ButtonExistingRecordsFunctionTest] *NOT IMPLEMENTED*", () -> assertTrue(true));
	}

	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	@TestControl(type="element", subtype="Button")
	public DynamicTest ButtonDocumentsFunctionTest () {
		return DynamicTest.dynamicTest("[ButtonDocumentsFunctionTest] *NOT IMPLEMENTED*", () -> assertTrue(true));
	}

	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	@TestControl(type="element", subtype="Button")
	public DynamicTest ButtonCalendarFunctionTest () {
		return DynamicTest.dynamicTest("[ButtonCalendarFunctionTest] *NOT IMPLEMENTED*", () -> assertTrue(true));
	}

	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	@TestControl(type="Container", subtype="none")
	public DynamicTest ContainerTabsFunctionTest () {
		return DynamicTest.dynamicTest("[ContainerTabsFunctionTest] *NOT IMPLEMENTED*", () -> assertTrue(true));
	}

}
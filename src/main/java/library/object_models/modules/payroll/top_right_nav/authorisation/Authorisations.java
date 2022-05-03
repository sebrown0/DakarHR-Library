package library.object_models.modules.payroll.top_right_nav.authorisation;

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
import control_builder.control_getters.single.ControlGetterLabel;
import control_builder.control_getters.single.ControlGetterTextSelect;
import control_builder.control_getters.single.ControlGetterButton;
import control_builder.control_getters.group.ControlGetterRow;

/**
* Generated Class.
* ----------------
* Source:  C:/Users/SteveBrown/eclipse-workspace/2021/DakarHR-Library/src/main/resources/xml/site_map.xml
* Author:  SteveBrown
* Version: 1.0.0
* Created: 03/05/2022 10:50:04
*/

@SuppressWarnings("unused")
public class Authorisations extends JsPanelWithIFrame {
	@SiteMap(author="SteveBrown", version="1.0.0", date="03/05/2022")
	public static final String PANEL_TITLE = "Authorisations";
	@SiteMap(author="SteveBrown", version="1.0.0", date="03/05/2022")
	public static final String MENU_TITLE = "Authorisations";
	@SiteMap(author="SteveBrown", version="1.0.0", date="03/05/2022")
	public static final String MENU_PARENT_NAME = "Authorisation";

	@SiteMap(author="SteveBrown", version="1.0.0", date="03/05/2022")
	public Authorisations(){}

	@SiteMap(author="SteveBrown", version="1.0.0", date="03/05/2022")
	public Authorisations(CoreData coreData){
		super(coreData, PANEL_TITLE);
		buildMyControls();
	}

	@SiteMap(author="SteveBrown", version="1.0.0", date="03/05/2022")
	private void buildMyControls() {
		ControlGetter lblCompany =
			new ControlGetterLabel("lblCompany", coreData, By.xpath(".//*[@class='col-md-2' and starts-with(text(),'Company')]"), this);
		ControlGetter tslCompany =
			new ControlGetterTextSelect(
				"tslCompany", coreData, By.cssSelector("select[id='COMP_SELx']"));
		ControlGetter lblGroupingView =
			new ControlGetterLabel("lblGroupingView", coreData, By.xpath(".//*[@class='col-md-2' and starts-with(text(),'Grouping View')]"), this);
		ControlGetter tslGroupingView =
			new ControlGetterTextSelect(
				"tslGroupingView", coreData, By.cssSelector("select[id='VIEW_SELx']"));
		ControlGetter btnAcceptCriteria =
			new ControlGetterButton("btnAcceptCriteria", coreData, By.cssSelector("button[name='SEARCH']"), this);
		ControlGetterGroup row1InHeader =
			new ControlGetterRow("Row1InHeader", coreData)
				.addControls(Arrays.asList(lblCompany, tslCompany, lblGroupingView, tslGroupingView, btnAcceptCriteria));
		var myControls =
			List.of(
				new ControlData(row1InHeader)
			);
		super.buildPanelControls(myControls);
	}




}
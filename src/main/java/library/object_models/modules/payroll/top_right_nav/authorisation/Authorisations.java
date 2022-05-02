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
import control_builder.control_getters.single.ControlGetterComboWriteAndSelect;
import utils.text_writer.TextWriterComboMulti;
import control_builder.control_getters.group.ControlGetterRow;

/**
* Generated Class.
* ----------------
* Source:  C:/Users/SteveBrown/eclipse-workspace/2021/DakarHR-Library/src/main/resources/xml/site_map.xml
* Author:  SteveBrown
* Version: 1.0.0
* Created: 02/05/2022 16:33:47
*/

@SuppressWarnings("unused")
public class Authorisations extends JsPanelWithIFrame {
	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	public static final String PANEL_TITLE = "Authorisations";
	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	public static final String MENU_TITLE = "Authorisations";
	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	public static final String MENU_PARENT_NAME = "Authorisation";

	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	public Authorisations(){}

	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	public Authorisations(CoreData coreData){
		super(coreData, PANEL_TITLE);
		buildMyControls();
	}

	@SiteMap(author="SteveBrown", version="1.0.0", date="02/05/2022")
	private void buildMyControls() {
		ControlGetter lblCompany =
			new ControlGetterLabel("lblCompany", coreData, By.xpath(".//*[@class='col-md-2' and starts-with(text(),'Company')]"), this);
		ControlGetter cwsCompany =
			new ControlGetterComboWriteAndSelect(
				"cwsCompany", coreData
				, By.cssSelector("select[id='COMP_SELx']"),
				By.className("select2-results"),
				new TextWriterComboMulti(coreData, getContainer()));
		ControlGetterGroup row1 =
			new ControlGetterRow("Row1", coreData)
				.addControls(Arrays.asList(lblCompany, cwsCompany));
		var myControls =
			List.of(
				new ControlData(row1)
			);
		super.buildPanelControls(myControls);
	}




}
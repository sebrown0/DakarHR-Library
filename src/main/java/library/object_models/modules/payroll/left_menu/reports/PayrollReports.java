package library.object_models.modules.payroll.left_menu.reports;

import core_data.CoreData;
import library.common.panels.JsPanelWithIFrame;

/**
 * @author Steve Brown
 *
 */
public final class PayrollReports extends JsPanelWithIFrame {
	public static final String MENU_TITLE = "Payroll Reports";
	public static final String PANEL_TITLE = "Payroll Reports";
	public static final String MENU_PARENT_NAME = "Reports";

	public PayrollReports(CoreData coreData) {
		super(coreData, PANEL_TITLE);
	}

	// Elements

	// Tabs
}
package library.object_models.modules.payroll.left_menu.reports;

import core_data.CoreData;
import library.common.panels.JsPanelWithIFrame;

/**
 * @author Steve Brown
 *
 */
public final class ChequePrinting extends JsPanelWithIFrame {
	public static final String MENU_TITLE = "Cheque Printing";
	public static final String PANEL_TITLE = "Cheque Printing";
	public static final String MENU_PARENT_NAME = "Reports";

	public ChequePrinting(CoreData coreData) {
		super(coreData, PANEL_TITLE);
	}

	// Elements

	// Tabs
}
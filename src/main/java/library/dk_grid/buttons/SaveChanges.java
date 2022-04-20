/**
 * 
 */
package library.dk_grid.buttons;

import org.openqa.selenium.WebDriver;

import context_manager.ContextManager;
import library.element.ElementButton;
import library.legacy_dakar.enums.GridButtonNames;
import library.object_models.dialog.DialogOkCancel;

/**
 * @author SteveBrown
 * @version 1.0
 * @since 1.0
 */
public class SaveChanges extends GridButton {
	public SaveChanges(ElementButton elmntBtn) {
		super(elmntBtn, GridButtonNames.BTN_SAVE);
	}
	
	public DialogOkCancel clickButton(WebDriver driver, ContextManager cm) {
		elmntBtn.click();
		return new DialogOkCancel(driver);
	}

}

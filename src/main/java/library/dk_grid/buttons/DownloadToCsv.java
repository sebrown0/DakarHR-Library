/**
 * 
 */
package library.dk_grid.buttons;

import library.element.ElementButton;
import library.legacy_dakar.enums.GridButtonNames;


/**
 * @author SteveBrown
 * @version 1.0
 * @since 1.0
 */
public class DownloadToCsv extends GridButton {
	public DownloadToCsv(ElementButton elmntBtn) {
		super(elmntBtn, GridButtonNames.BTN_DOWNLOAD_TO_CSV);
	}
}

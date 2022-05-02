/**
 * 
 */
package library.object_models.modules.common.nav.nav_bar_elements;

import java.util.Map;

import library.object_models.modules.common.nav.quick_links.QuickLinks;

/**
 * @author SteveBrown
 *
 */
public interface NavBarElementStrategy {
	Map<String, NavBarElement> getElements();
	QuickLinks getQuickLinks();
}

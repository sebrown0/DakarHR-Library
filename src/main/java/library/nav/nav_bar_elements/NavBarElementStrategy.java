/**
 * 
 */
package library.nav.nav_bar_elements;

import java.util.Map;

import library.nav.NavBarElement;
import library.nav.quick_links.QuickLinks;

/**
 * @author SteveBrown
 *
 */
public interface NavBarElementStrategy {
	Map<String, NavBarElement> getElements();
	QuickLinks getQuickLinks();
}

/**
 * 
 */
package library.object_models.modules.common.nav.nav_bar_elements;

import java.util.Optional;

import library.common.forms.ContainerAction;


/**
 * @author SteveBrown
 * @since 1.0
 * @version 1.1
 *
 */
public interface NavBarElementGetter {
	/*
	 * Load the nav-bar element using context manager.
	 */
	Optional<ContainerAction> clickAndLoad(Class<?> clazz);
	/*
	 * Get the nav-bar element. The element is NOT added to the CM.
	 */
	Optional<NavBarElement> getNavBarElement(String elementName);
}

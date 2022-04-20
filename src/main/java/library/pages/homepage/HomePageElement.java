package library.pages.homepage;

import library.dto.entites.company.Company;

/**
 * @author SteveBrown
 * @version 1.0
 * 	Initial
 * @version 1.1
 *  Add loadModule(...)
 * @since 1.0
 */
public interface HomePageElement {
	HomePage loadModule(String moduleName);
	HomePage loadCompany(Company co);
}

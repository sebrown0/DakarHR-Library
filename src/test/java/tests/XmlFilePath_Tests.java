package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import common.file.XmlFileLocator;
import library.xml_file.FileLocator;

class XmlFilePath_Tests {

	@Test
	void test() {
		XmlFileLocator locator = new FileLocator();
		assertEquals(
				"C:\\Users\\SteveBrown\\eclipse-workspace\\2021\\DakarHR-Library\\src\\main\\resources\\xml\\site_map.xml", 
				locator.getPathToFile().get());
	}

}

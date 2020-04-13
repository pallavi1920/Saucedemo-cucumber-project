package cts.saucelabs.utility;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

/**
 * Class reads base settings from the config.properties file
 * @author Kalyani
 * @author Pallavi
 * @author Priyanka
 * @author Shalini
 */
public class ConfigReader {
Properties pro;
/**
 * Class constructor loads settings from the file and saves to fields
 */
public ConfigReader() {

try {
File src=new File("C:\\Users\\admin\\eclipse-workspace\\Saucedemo-Cucumber-Project\\Configuration\\Config.property");

FileInputStream fis=new FileInputStream(src);

pro=new Properties();

pro.load(fis);
} catch (Exception e) {
// TODO Auto-generated catch block
System.out.println("Exception is" + e.getMessage());
}

}
/**
 * Method to get the path to chrome profile
 * @return chromepath
 */
public String getchromepath() {
String path=pro.getProperty("ChromeDriver");
return path;
}
/**
 * Method to get the path to Firefox profile
 * @return firefoxPath
 */
public String getfirefoxpath() {
	String path=pro.getProperty("firefoxDriver");
	return path;
}
/**
 * Method to get the url
 * @return url
 */

public String getApplicationURL() {
return pro.getProperty("URL");
}
/**
 * Method to get the path to excel profile
 * @return excelpath
 */
public String getExcelpath() {
	// TODO Auto-generated method stub
	String excelpath=pro.getProperty("Excelpath");
	return excelpath;
	
}

}
package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private Properties properties;
	
	/**
	 * This method is used to load properties from config.properties file
	 * @return it returns Properties properties object
	 */
	public Properties init_prop() {
		
		properties = new Properties();
		try {
			FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config\\config.properties");
			properties.load(fileInputStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}

}

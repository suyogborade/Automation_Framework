package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties properties;

	String path = "/Users/suyogborade/eclipse-workspace/FrameworkAutomation/Automation_Framework/Configuration/config.properties";

	public ReadConfig() {
		try {
			properties = new Properties();

			FileInputStream file = new FileInputStream(path);
			properties.load(file);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getBaseURL() {
		String value = properties.getProperty("baseurl");

		if (value != null)
			return value;

		else
			throw new RuntimeException("URL is not specified in the Cofig file");

	}

	public String getbrowser() {
		String brow = properties.getProperty("browser");

		if (brow != null)
			return brow;

		else
			throw new RuntimeException("browser is not specified in the config file");
	}

}

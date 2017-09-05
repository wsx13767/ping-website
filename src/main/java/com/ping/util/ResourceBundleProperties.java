package com.ping.util;

import java.io.UnsupportedEncodingException;
import java.util.ResourceBundle;

public class ResourceBundleProperties {
	private ResourceBundleProperties() {
	}
	
	public static String getString(String language, String key) {
		String propertiesFile = "i18n/language_" + language;
		ResourceBundle rb = ResourceBundle.getBundle(propertiesFile);
		try {
			return new String(rb.getString(key).getBytes("8859_1"),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return "your key is null";
		}
	}
}

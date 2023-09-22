package com.ReaderProperty;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReaderFacebook {
	Properties p;

	public ReaderFacebook() throws Exception {
		File f = new File(
				"C:\\Users\\lenovo\\eclipse-workspace\\Facebook\\src\\main\\java\\com\\propertiesFiles\\Propertyfacebook");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getUrl() {
		String str = p.getProperty("URL");
		return str;
	}

	public String getEmail() {
		String str = p.getProperty("Email");
		return str;
	}

	public String getPassword() {
		String str = p.getProperty("Password");
		return str;
	}

	public String getfirstname() {
		String str = p.getProperty("firstname");
		return str;
	}

	public String getlastnamee() {
		String str = p.getProperty("lastname");
		return str;
	}

	public String getRegmail() {
		String str = p.getProperty("Regmail");
		return str;
	}

	public String getMonth() {
		String str = p.getProperty("month");
		return str;
	}

	public String getDay() {
		String str = p.getProperty("day");
		return str;
	}

	public String getYear() {
		String str = p.getProperty("year");
		return str;
	}

	public String getdrivername() {
		String str = p.getProperty("drivername");
		return str;
	}
}

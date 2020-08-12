package com.grantportal.utilities;

	import java.io.File;
	import java.io.FileInputStream;
	import java.util.Properties;

	public class ReadConfig {
		Properties properties;
		
		
		public ReadConfig() {

	//To Load property file
			File src = new File(".\\Configuration\\config.properties");
			try {
				FileInputStream fileInputStream = new FileInputStream(src);
				properties = new Properties();
				properties.load(fileInputStream);
			}catch (Exception e) {
				System.out.println("Exception is " +e.getMessage());
			}
		}
		public String getApplicationURL()
		{
			String url=properties.getProperty("baseURL");
			return url;
		}

		public String getNRIC()
		{
			String NRIC=properties.getProperty("nric");
			return NRIC;
		}

		public String getName()
		{
			String Name=properties.getProperty("username");
			return Name;
		}

		public String getUEN()
		{
			String UEN=properties.getProperty("uen");
			return UEN;
		}

		public String getchromepath()
		{
			String chromepath=properties.getProperty("chromepath");
			return chromepath;
		}


		public String getiepath()
		{
			String iepath=properties.getProperty("iepath");
			return iepath;
		}

		public String getfirefoxpath()
		{
			String firefoxpath=properties.getProperty("firefoxpath");
			return firefoxpath;
		}




	}


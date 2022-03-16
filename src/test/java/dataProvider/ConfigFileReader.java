package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	private Properties properties;
	private final String propertyFilePath= "configs//Configuration.properties";

	
	public ConfigFileReader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}
	
	public String getIOSDeviceName(){
		String iOSDeviceName = properties.getProperty("iOSDeviceName");
		if(iOSDeviceName!= null) return iOSDeviceName;
		else throw new RuntimeException("iOS Device Name not specified in the Configuration.properties file.");		
	}
	
	public String getAndroidDeviceName(){
		String androidDeviceName = properties.getProperty("androidDeviceName");
		if(androidDeviceName!= null) return androidDeviceName;
		else throw new RuntimeException("Android Device Name not specified in the Configuration.properties file.");		
	}
	
	public String getBrowserstackUser(){
		String browserstackUser = properties.getProperty("browserstackUser");
		if(browserstackUser!= null) return browserstackUser;
		else throw new RuntimeException("Browserstack User is not specified in the Configuration.properties file.");		
	}
	
	public String getBrowserstackKey(){
		String browserstackKey = properties.getProperty("browserstackKey");
		if(browserstackKey!= null) return browserstackKey;
		else throw new RuntimeException("Browserstack Key is not specified in the Configuration.properties file.");		
	}
	
	public String getIOSAppURL(){
		String iOSAppURL = properties.getProperty("iOSAppURL");
		if(iOSAppURL!= null) return iOSAppURL;
		else throw new RuntimeException("IOS App URL is not specified in the Configuration.properties file.");		
	}
	
	public String getAndroidAppURL(){
		String androidAppURL = properties.getProperty("androidAppURL");
		if(androidAppURL!= null) return androidAppURL;
		else throw new RuntimeException("Android App URL is not specified in the Configuration.properties file.");		
	}
	
	public String getIOSVersion(){
		String iOSVersion = properties.getProperty("iOSVersion");
		if(iOSVersion!= null) return iOSVersion;
		else throw new RuntimeException("iOS Version is not specified in the Configuration.properties file.");		
	}
	
	public String getAndroidVersion(){
		String androidOSVersion = properties.getProperty("androidOSVersion");
		if(androidOSVersion!= null) return androidOSVersion;
		else throw new RuntimeException("Android Version is not specified in the Configuration.properties file.");		
	}
	
	public String getProjectName(){
		String project = properties.getProperty("project");
		if(project!= null) return project;
		else throw new RuntimeException("Project not specified in the Configuration.properties file.");		
	}
	
	public String getIOSBuild(){
		String iOSBuild = properties.getProperty("iOSBuild");
		if(iOSBuild!= null) return iOSBuild;
		else throw new RuntimeException("iOS Build is not specified in the Configuration.properties file.");		
	}
	
	public String getAndroidBuild(){
		String androidBuild = properties.getProperty("androidBuild");
		if(androidBuild!= null) return androidBuild;
		else throw new RuntimeException("Android Build is not specified in the Configuration.properties file.");		
	}
	
	public int getImplicitWait(){
		int implicitWait = Integer.valueOf(properties.getProperty("implicitWait"));
		if(implicitWait!= 0) return implicitWait;
		else throw new RuntimeException("Implicit wait is not specified in the Configuration.properties file.");		
	}
	
	public String getBrowserstackURL(){
		String browserstackURL = properties.getProperty("browserstackURL");
		if(browserstackURL!= null) return browserstackURL;
		else throw new RuntimeException("Broswerstack URL not specified in the Configuration.properties file.");		
	}
	
	
}
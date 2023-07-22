package Utility_methods;

import java.io.FileInputStream;
import java.util.Properties;

public class Properties_Utility {
	
	public String getProperties(String key) throws Throwable
	{
	FileInputStream fis=new FileInputStream("");
	Properties pobj=new Properties();
	pobj.load(fis);
	return pobj.getProperty(key);

	}
}

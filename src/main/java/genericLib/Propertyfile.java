package genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile   implements AutoConstnt {

	public String getPropertyData(String key)   
	{
		
		Properties p=new Properties();
		try {
			p.load(new FileInputStream(propertyFilepath));
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p.getProperty(key);
	
		}
}

package GenericUtility;

import java.io.FileInputStream;
import java.util.Properties;


public class FileUtility implements IPathConstant{

	public String getPropertyKeyValue(String key) throws Throwable {
		//FileInputStream file =new FileInputStream(IPathConstant.PROPERTY_FILEPATH);
		Properties prop=new Properties();
		prop.load(new FileInputStream(PROPERTY_FILEPATH));
		return prop.getProperty(key);
	}
}

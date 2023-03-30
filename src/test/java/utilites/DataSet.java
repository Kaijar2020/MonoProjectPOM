package utilites;

import org.testng.annotations.DataProvider;

public class DataSet {
	@DataProvider(name = "InvalidCredential")
	public static Object dataset() {
		Object [] [] objects = {{"email likbo nah","92929","Please enter a valid phone number."},
				{"176565789877","........7","Please enter a valid phone number."},
				{"@@@@%%%%%%###","12345678","Incorrect username or password."},
				{"abc@c.com","abc@c.com","Incorrect username or password."},};
		return objects;
	}

}

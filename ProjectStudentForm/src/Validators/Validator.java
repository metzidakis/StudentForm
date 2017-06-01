package Validators;

public class Validator {
	
	//method for validating name
	public boolean validateName(String name) {
		boolean validate = true;
		if ( name.length() == 0 && name.length() < 10 ) {
			validate = false;
		}
		return validate;
	}
	
	//method for validating id
	public boolean validateID(String id) {
		boolean validate = true;
		if ( id.length() == 0 && id.length() < 10 ) {
			validate = false;
		}
		return validate;
	}
}

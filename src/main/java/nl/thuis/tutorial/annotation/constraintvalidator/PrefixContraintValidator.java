package nl.thuis.tutorial.annotation.constraintvalidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import nl.thuis.tutorial.annotation.Prefix;

public class PrefixContraintValidator implements ConstraintValidator<Prefix, String> {

	private String prefix;
	
	@Override
	public void initialize(Prefix constraintAnnotation) {
		prefix = constraintAnnotation.value();
	}
	
	@Override
	public boolean isValid(String thePrefix, ConstraintValidatorContext constraintValidatorContext) {
		boolean result = true;
		
		if(thePrefix != null) {
			result = thePrefix.startsWith(prefix);
		}
		
		return result;
	}

}

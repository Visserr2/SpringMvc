package nl.thuis.tutorial.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import nl.thuis.tutorial.annotation.constraintvalidator.PrefixContraintValidator;

@Constraint(validatedBy=PrefixContraintValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Prefix {
	
	public String value() default "LUV";
	
	public String message() default "doesn't start with correct prefix";
	
	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default {};

}

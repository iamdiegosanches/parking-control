package com.api.parkingcontrol.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ExistLicensePlateValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ExistLicensePlateValidation {
    //Tentativa de criar um custom validator
    String message() default "Conflict: License Plate Car is already in use!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

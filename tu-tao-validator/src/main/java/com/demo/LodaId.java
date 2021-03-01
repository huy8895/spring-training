package com.demo;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = LodaIdValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface LodaId {
    String message() default "LodaId must start with loda://";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

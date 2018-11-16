package boot.annotation;

import boot.validator.UserValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(
        validatedBy = {UserValidator.class}
)
public @interface UserUtil {
    String message() default "验签失败";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

